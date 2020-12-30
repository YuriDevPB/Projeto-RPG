/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;

import java.io.IOException;

/**
 * Essa classe sera utilizada para controlar o jogo do ponto de vista do
 * servidor,recebendo as informações a as passando para o lado do cliente.
 *
 * @author Pichelli
 */
public class ControleJogo {

      private final ServidorRPG servidor;
      private final Jogador jogador;
      private final Personagem personagemEx;//Este personagem e usado so pra passar os valores inicias.

      public ControleJogo(ServidorRPG servidor, Jogador jogador) {
            this.servidor = servidor;
            this.jogador = jogador;
            personagemEx = new Personagem();
      }

      //Manda as salas ja existentes para o cliente caso exista alguma.
      public void mandarSalas() throws IOException {
            SalaJogo aux[];
            String retorno[][];
            if (servidor.getSalas() != null) {
                  aux = servidor.getSalas();
                  retorno = new String[aux.length][2];

                  int i = 0;
                  for (SalaJogo s : aux) {
                        retorno[i][0] = Integer.toString(s.getID());
                        retorno[i][1] = Integer.toString(s.getQuantJog());
                        i++;
                  }
                  jogador.getSaida().writeObject(retorno);
            }
      }

      //Semelhante ao metodo acima este é responsavel por mandar as salas ao cliente recebido por ele,
      //utilizado internamente para passar uma atualização caso criada uma sala por outro cliente.
      private void mandarSalas(Jogador jogador) throws IOException {
            SalaJogo aux[];
            String retorno[][];
            if (servidor.getSalas() != null) {
                  aux = servidor.getSalas();
                  retorno = new String[aux.length][2];

                  int i = 0;
                  for (SalaJogo s : aux) {
                        retorno[i][0] = Integer.toString(s.getID());
                        retorno[i][1] = Integer.toString(s.getQuantJog());
                        System.out.println("pegando salas");
                        i++;
                  }
                  System.out.println("mandando salas");
                  jogador.getSaida().writeObject(retorno);
                  System.out.println("depois de enviars");
            }
      }

      //Utilizado para criar uma nova sala.
      public void criarSala() throws IOException {
            servidor.criarSala(jogador);

            String mensagem[][] = new String[1][2];
            mensagem[0][0] = "/ENTREI";
            if (jogador.getSala().temMestre()) {
                  mensagem[0][1] = "true";
            } else {
                  mensagem[0][1] = "false";
            }

            jogador.getSaida().writeObject(mensagem);

            mandarSalaPraTodos();
      }

      //Utilizado para se entrar em uma sala existente;
      public void entrarSala(int id) throws IOException {
            if (servidor.getSala(id) != null) {
                  servidor.getSala(id).addJogador(jogador);

                  String mensagem[][] = new String[1][2];
                  mensagem[0][0] = "/ENTREI";
                  if (jogador.getSala().temMestre()) {
                        mensagem[0][1] = "true";
                  } else {
                        mensagem[0][1] = "false";
                  }

                  jogador.getSaida().writeObject(mensagem);

                  mandarSalaPraTodos();
            }
      }

      //Envia a sala para todos os jogadores que não estão em salas ainda,utilizado em caso de criação de nova
      //sala para atualizar o cliente.
      public void mandarSalaPraTodos() throws IOException {
            Object aux[];

            aux = servidor.getJogadores();
            System.out.println(aux.length);
            for (Object o : aux) {
                  System.out.println("pegando jogadores");
                  Jogador joga = (Jogador) o;
                  if (joga.getSala() == null) {
                        System.out.println("depois da checagem");
                        mandarSalas(joga);
                  }
            }
      }

      //Utilizado para criar o personagem e ja atualizar os valores para os escolhidos pelo cliente.
      public void criarPersonagem(String[][] valores) throws IOException {
            Personagem personagem = new Personagem(valores[1][0]);
            this.jogador.setPersonagem(personagem);

            personagem.setCaracteristicas("FORCA", Integer.parseInt(valores[2][0]));
            personagem.setCaracteristicas("AGILIDADE", Integer.parseInt(valores[3][0]));
            personagem.setCaracteristicas("INTELECTO", Integer.parseInt(valores[4][0]));
            personagem.setCaracteristicas("VONTADE", Integer.parseInt(valores[5][0]));
            personagem.setNome(valores[6][0]);
            personagem.setCaracteristicas("IDADE", Integer.parseInt(valores[7][0]));

            personagem.atualizarAtributos();

            String saida[] = new String[1];
            saida[0] = "/confirmado";

            jogador.setConfirmado(true);

            jogador.getSaida().writeObject(saida);

            Jogador jogadores[] = jogador.getSala().getJogadores();

            for (Jogador j : jogadores) {
                  if (j.isMestre()) {
                        enviarListaPersonagem(j);
                  }
            }
      }

      //Utilizado para mandar os exemplos de valores iniciais
      public void mandarExemplos(String ancestralidade) throws IOException {
            String valores[];
            valores = personagemEx.getValoresIni(ancestralidade);

            jogador.getSaida().writeObject(valores);
      }

      //Utilizado para tranformar o jogador em mestre, fazer as atualizações necessarias e em seguida enviar
      //mensagem para os outros jogadores da mesma sala que não escolheram seu personagem ainda.
      public void setMestre() throws IOException {
            jogador.setMestre(true);
            jogador.getSala().setMestre(true);
            jogador.getSala().setMestre(jogador);
            jogador.setConfirmado(true);

            String saida[] = new String[1];
            saida[0] = "/mestre";
            jogador.getSaida().writeObject(saida);

            Jogador jogadores[];
            jogadores = jogador.getSala().getJogadores();

            for (Jogador joga : jogadores) {
                  if (!joga.isConfirmado()) {
                        String mestre[] = new String[1];
                        mestre[0] = "/atualizar";
                        joga.getSaida().writeObject(mestre);
                  }
            }
      }

      //Utilizado para remover o jogador da lista e da sala caso o mesmo desconecte.
      public void desconectar() throws IOException {
            SalaJogo aux = jogador.getSala();

            servidor.removerJogador(jogador);

            if (aux != null) {
                  if (jogador.isMestre()) {
                        aux.setMestre(false);
                        Jogador jogadores[];
                        jogadores = jogador.getSala().getJogadores();

                        for (Jogador joga : jogadores) {
                              if (!joga.isConfirmado()) {
                                    String mestre[] = new String[1];
                                    mestre[0] = "/atualizarT";
                                    joga.getSaida().writeObject(mestre);
                              }
                        }
                  }

                  aux.removerJogador(jogador);

            }

            mandarSalaPraTodos();
      }

      //Utilizada para juntar as informações de caracterisca com as de inventario e mandar como um
      //unico array para montar a ficha do cliente.
      public void montarFicha() throws IOException {
            String auxValores[];
            String itens[][];
            String consumiveis[][];
            String ficha[][];

            auxValores = jogador.getPersonagem().getValores();
            ListaItens inv = jogador.getPersonagem().getInventario();
            ListaConsumiveis cons = jogador.getPersonagem().getConsumiveis();
            itens = inv.getNomeQuant();
            consumiveis = cons.getNomeQuant();

            ficha = new String[auxValores.length + itens.length + consumiveis.length + 1][5];

            ficha[0][0] = "/ficha";

            int i = 1;
            for (String s : auxValores) {
                  ficha[i][0] = s;
                  i++;
            }
            for (int j = 0; j < itens.length; j++) {
                  ficha[i][0] = itens[j][0];
                  ficha[i][1] = itens[j][1];
                  ficha[i][2] = itens[j][2];
                  ficha[i][3] = itens[j][3];
                  ficha[i][4] = itens[j][4];
                  i++;
            }
            for (int j = 0; j < consumiveis.length; j++) {
                  ficha[i][0] = consumiveis[j][0];
                  ficha[i][1] = consumiveis[j][1];
                  ficha[i][2] = consumiveis[j][2];
                  ficha[i][3] = consumiveis[j][3];
                  i++;
            }

            jogador.getSaida().writeObject(ficha);

      }

      public void atualizarFicha() throws IOException {
            String itens[][];
            String consumiveis[][];
            String ficha[][];

            ListaItens inv = jogador.getPersonagem().getInventario();
            ListaConsumiveis cons = jogador.getPersonagem().getConsumiveis();
            itens = inv.getNomeQuant();
            consumiveis = cons.getNomeQuant();

            ficha = new String[itens.length + consumiveis.length + 1][5];

            ficha[0][0] = "/atualizarFicha";

            int i = 1;
            for (int j = 0; j < itens.length; j++) {
                  ficha[i][0] = itens[j][0];
                  ficha[i][1] = itens[j][1];
                  ficha[i][2] = itens[j][2];
                  ficha[i][3] = itens[j][3];
                  ficha[i][4] = itens[j][4];
                  i++;
            }
            for (int j = 0; j < consumiveis.length; j++) {
                  ficha[i][0] = consumiveis[j][0];
                  ficha[i][1] = consumiveis[j][1];
                  ficha[i][2] = consumiveis[j][2];
                  ficha[i][3] = consumiveis[j][3];
                  i++;
            }

            jogador.getSaida().writeObject(ficha);

      }

      public void atualizarFicha(Jogador joga) throws IOException {
            String itens[][];
            String consumiveis[][];
            String ficha[][];

            ListaItens inv = joga.getPersonagem().getInventario();
            ListaConsumiveis cons = joga.getPersonagem().getConsumiveis();
            itens = inv.getNomeQuant();
            consumiveis = cons.getNomeQuant();

            ficha = new String[itens.length + consumiveis.length + 1][5];

            ficha[0][0] = "/atualizarFicha";

            int i = 1;
            for (int j = 0; j < itens.length; j++) {
                  ficha[i][0] = itens[j][0];
                  ficha[i][1] = itens[j][1];
                  ficha[i][2] = itens[j][2];
                  ficha[i][3] = itens[j][3];
                  ficha[i][4] = itens[j][4];
                  i++;
            }
            for (int j = 0; j < consumiveis.length; j++) {
                  ficha[i][0] = consumiveis[j][0];
                  ficha[i][1] = consumiveis[j][1];
                  ficha[i][2] = consumiveis[j][2];
                  ficha[i][3] = consumiveis[j][3];
                  i++;
            }

            joga.getSaida().writeObject(ficha);
      }

      public void enviarMensagem(String mensagem) throws IOException {
            String nome;
            if (!jogador.isMestre()) {
                  nome = jogador.getPersonagem().getCaracteristicas("NOME");
            } else {
                  nome = "Mestre";
            }

            Jogador jogadores[];
            jogadores = jogador.getSala().getJogadores();

            String saida[][] = new String[1][3];
            saida[0][0] = "/chat";
            saida[0][1] = nome;
            saida[0][2] = mensagem;

            for (Jogador joga : jogadores) {
                  if (joga != jogador && joga.isConfirmado()) {
                        joga.getSaida().writeObject(saida);
                  }
            }
      }

      public void enviarMenuLoja() throws IOException {
            String saida[][] = new String[1][1];
            saida[0][0] = "/menuMestre";

            jogador.getSaida().writeObject(saida);
      }

      public void enviarLojaFixa() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosfixos();
            saida[0][0] = "/criandoLoja";

            jogador.getSaida().writeObject(saida);
      }

      public void atualizarLoja(String[][] mensagem) throws IOException {
            Jogador jogadores[];

            jogador.getSala().getLoja().atualizarListas(mensagem);

            jogadores = jogador.getSala().getJogadores();

            String saida[][] = new String[1][1];
            saida[0][0] = "/abrirLoja";

            for (Jogador joga : jogadores) {
                  if (joga != jogador && joga.isConfirmado()) {
                        joga.getSaida().writeObject(saida);
                  }
            }
      }

      public void enviarLojaVol() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosVol();
            saida[0][0] = "/mostrarLoja";

            jogador.getSaida().writeObject(saida);
      }

      public void enviarLojaVolEx() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosVol();
            saida[0][0] = "/mostraExemplos";

            jogador.getSaida().writeObject(saida);
      }

      public void fecharLoja() throws IOException {
            Jogador jogadores[];
            jogadores = jogador.getSala().getJogadores();

            String saida[][] = new String[1][1];
            saida[0][0] = "/fecharLoja";

            for (Jogador joga : jogadores) {
                  if (joga != jogador && joga.isConfirmado()) {
                        joga.getSaida().writeObject(saida);
                  }
            }
      }

      public void comprarItem(String[][] mensagem) throws IOException {
            String saida[][] = new String[1][3];
            Jogador jogadores[];
            jogadores = jogador.getSala().getJogadores();

            if (mensagem[1][1].equalsIgnoreCase("CONSUMIVEL")) {
                  if (jogador.getSala().getLoja().getCons(mensagem[1][0], mensagem[0][1]).getPreco() <= jogador.getPersonagem().getBits()) {
                        jogador.getPersonagem().getConsumiveis().addConsumivel(jogador.getSala().getLoja().getCons(mensagem[1][0], mensagem[0][1]));
                        jogador.getPersonagem().setBits(jogador.getPersonagem().getBits() - jogador.getSala().getLoja().getCons(mensagem[1][0], mensagem[0][1]).getPreco());

                        saida[0][0] = "/atualizarLinha";
                        saida[0][1] = mensagem[1][1];
                        saida[0][2] = mensagem[0][1];

                        for (Jogador joga : jogadores) {
                              if (joga.isConfirmado() && joga != jogador) {
                                    joga.getSaida().writeObject(saida);
                              }
                        }

                        atualizarFicha();
                        atualizarItensMestre(jogador);

                  } else {
                        saida[0][0] = "/liso";
                        jogador.getSaida().writeObject(saida);
                  }
            } else {
                  if (jogador.getSala().getLoja().getItem(mensagem[1][0], mensagem[0][1]).getPreco() <= jogador.getPersonagem().getBits()) {
                        jogador.getPersonagem().getInventario().addItem(jogador.getSala().getLoja().getItem(mensagem[1][0], mensagem[0][1]));
                        jogador.getPersonagem().setBits(jogador.getPersonagem().getBits() - jogador.getSala().getLoja().getItem(mensagem[1][0], mensagem[0][1]).getPreco());

                        saida[0][0] = "/atualizarLinha";
                        saida[0][1] = mensagem[1][1];
                        saida[0][2] = mensagem[0][1];

                        for (Jogador joga : jogadores) {
                              if (joga.isConfirmado() && joga != jogador) {
                                    joga.getSaida().writeObject(saida);
                              }
                        }
                        atualizarFicha();
                         atualizarItensMestre(jogador);

                  } else {
                        saida[0][0] = "/liso";
                        jogador.getSaida().writeObject(saida);
                  }
            }
      }

      public void removerInv(String[][] mensagem) throws IOException {
            Itens item;
            Consumiveis cons;
            if (!mensagem[0][2].equalsIgnoreCase("CONSUMIVEL")) {
                  item = jogador.getPersonagem().getInventario().getItem(mensagem[0][1]);
                  item.setQuantidade(item.getQuantidade() - 1);

                  if (item.getQuantidade() <= 0) {
                        jogador.getPersonagem().getInventario().removerItem(item.getNome());
                  }

            } else {
                  cons = jogador.getPersonagem().getConsumiveis().getConsumivel(mensagem[0][1]);
                  cons.setQuantidade(cons.getQuantidade() - 1);

                  if (cons.getQuantidade() <= 0) {
                        jogador.getPersonagem().getConsumiveis().removerItem(cons.getNome());
                  }
            }
      
            atualizarItensMestre(jogador);
      }

      public void removerInvMestre(String[][] mensagem) throws IOException {
            Itens item;
            Consumiveis cons;
            Jogador jogadores[] = jogador.getSala().getJogadores();
            Jogador joga = null;

            for (Jogador j : jogadores) {
                  if (j != jogador) {
                        if (j.getPersonagem().getCaracteristicas("NOME").equalsIgnoreCase(mensagem[0][3])) {
                              joga = j;
                              break;
                        }
                  }
            }

            if (!mensagem[0][2].equalsIgnoreCase("CONSUMIVEL")) {
                  item = joga.getPersonagem().getInventario().getItem(mensagem[0][1]);
                  item.setQuantidade(item.getQuantidade() - 1);

                  if (item.getQuantidade() <= 0) {
                        joga.getPersonagem().getInventario().removerItem(item.getNome());
                  }

            } else {
                  cons = joga.getPersonagem().getConsumiveis().getConsumivel(mensagem[0][1]);
                  cons.setQuantidade(cons.getQuantidade() - 1);

                  if (cons.getQuantidade() <= 0) {
                        joga.getPersonagem().getConsumiveis().removerItem(cons.getNome());
                  }
            }
            atualizarFicha(joga);
      }

      public void enviarListaPersonagem() throws IOException {
            String saida[][];
            Jogador jogadores[] = jogador.getSala().getJogadores();

            saida = new String[jogadores.length][1];

            saida[0][0] = "/listaPersonagem";
            int i = 1;
            for (Jogador joga : jogadores) {
                  if (joga != jogador && joga.isConfirmado()) {
                        saida[i][0] = joga.getPersonagem().getCaracteristicas("NOME");
                        i++;
                  }
            }
            jogador.getSaida().writeObject(saida);
      }

      public void enviarListaPersonagem(Jogador joga) throws IOException {
            String saida[][];
            Jogador jogadores[] = joga.getSala().getJogadores();

            saida = new String[jogadores.length][1];

            saida[0][0] = "/atualizarLista";
            int i = 1;
            for (Jogador j : jogadores) {
                  if (j != joga && j.isConfirmado()) {
                        saida[i][0] = j.getPersonagem().getCaracteristicas("NOME");
                        i++;
                  }
            }
            joga.getSaida().writeObject(saida);
      }

      public void enviarFichaPersonagemX(String nome) throws IOException {
            String saida[][];
            Jogador jogadores[] = jogador.getSala().getJogadores();
            Jogador enviar = null;

            for (Jogador joga : jogadores) {
                  if (joga != jogador) {
                        if (joga.getPersonagem().getCaracteristicas("NOME").equalsIgnoreCase(nome)) {
                              enviar = joga;
                              break;
                        }
                  }
            }

            if (enviar != null) {
                  String auxValores[];
                  String itens[][];
                  String consumiveis[][];
                  String ficha[][];

                  auxValores = enviar.getPersonagem().getValores();
                  ListaItens inv = enviar.getPersonagem().getInventario();
                  ListaConsumiveis cons = enviar.getPersonagem().getConsumiveis();
                  itens = inv.getNomeQuant();
                  consumiveis = cons.getNomeQuant();

                  ficha = new String[auxValores.length + itens.length + consumiveis.length + 1][5];

                  ficha[0][0] = "/fichaPersonagemX";

                  int i = 1;
                  for (String s : auxValores) {
                        ficha[i][0] = s;
                        i++;
                  }
                  for (int j = 0; j < itens.length; j++) {
                        ficha[i][0] = itens[j][0];
                        ficha[i][1] = itens[j][1];
                        ficha[i][2] = itens[j][2];
                        ficha[i][3] = itens[j][3];
                        ficha[i][4] = itens[j][4];
                        i++;
                  }
                  for (int j = 0; j < consumiveis.length; j++) {
                        ficha[i][0] = consumiveis[j][0];
                        ficha[i][1] = consumiveis[j][1];
                        ficha[i][2] = consumiveis[j][2];
                        ficha[i][3] = consumiveis[j][3];
                        i++;
                  }

                  jogador.getSaida().writeObject(ficha);
            }
      }

      public void atualizarVFicha(String[][] mensagem) throws IOException {
            Jogador jogadores[] = jogador.getSala().getJogadores();
            Jogador joga = null;

            for (Jogador j : jogadores) {
                  if (j != jogador) {
                        if (j.getPersonagem().getCaracteristicas("NOME").equalsIgnoreCase(mensagem[1][0])) {
                              joga = j;
                              break;
                        }
                  }
            }
            Personagem perso = joga.getPersonagem();

            perso.setCaracteristicas("FORCA", Integer.parseInt(mensagem[2][0]));
            perso.setCaracteristicas("AGILIDADE", Integer.parseInt(mensagem[3][0]));
            perso.setCaracteristicas("INTELECTO", Integer.parseInt(mensagem[4][0]));
            perso.setCaracteristicas("VONTADE", Integer.parseInt(mensagem[5][0]));
            perso.setCaracteristicas("SAUDE", Integer.parseInt(mensagem[6][0]));
            perso.setCaracteristicas("NIVEL", Integer.parseInt(mensagem[7][0]));
            perso.setCaracteristicas("INSANIDADE", Integer.parseInt(mensagem[8][0]));
            perso.setCaracteristicas("CORRUPCAO", Integer.parseInt(mensagem[9][0]));
            perso.setCaracteristicas("PODER", Integer.parseInt(mensagem[10][0]));
            perso.setCaracteristicas("DANO", Integer.parseInt(mensagem[11][0]));
            perso.setCaracteristicas("PERCEPCAO", Integer.parseInt(mensagem[12][0]));
            perso.setBits(Integer.parseInt(mensagem[13][0]));
            perso.setCaracteristicas("TAXACURA", Integer.parseInt(perso.getCaracteristicas("SAUDE")) / 4);

            String[][] saida;
            saida = new String[perso.getValores().length + 1][1];
            saida[0][0] = "/atualizarAtributos";

            String aux[] = perso.getValores();

            int i = 1;
            for (String s : aux) {
                  saida[i][0] = s;
                  i++;
            }

            joga.getSaida().writeObject(saida);
      }

      public void mandarListaArmas() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosfixos();
            saida[0][0] = "/listaArmas";

            jogador.getSaida().writeObject(saida);
      }

      public void mandarListaArmaduras() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosfixos();
            saida[0][0] = "/listaArmaduras";

            jogador.getSaida().writeObject(saida);
      }

      public void mandarListaConsumiveis() throws IOException {
            String[][] saida;
            saida = jogador.getSala().getLoja().getTodosfixos();
            saida[0][0] = "/listaConsumiveis";

            jogador.getSaida().writeObject(saida);
      }

      public void addInv(String[][] mensagem) throws IOException {
            Jogador jogadores[];
            Jogador joga = null;
            jogadores = jogador.getSala().getJogadores();

            for (Jogador j : jogadores) {
                  if (j != jogador) {
                        if (j.getPersonagem().getCaracteristicas("NOME").equalsIgnoreCase(mensagem[3][0])) {
                              joga = j;
                              break;
                        }
                  }
            }
            if (joga != null) {
                  if (mensagem[1][0].equalsIgnoreCase("CONSUMIVEL")) {
                        joga.getPersonagem().getConsumiveis().addConsumivel(joga.getSala().getLoja().getConsFixo(mensagem[2][0]));

                        atualizarFicha(joga);

                  } else {
                        joga.getPersonagem().getInventario().addItem(joga.getSala().getLoja().getItemFixo(mensagem[2][0]));

                        atualizarFicha(joga);
                  }

                  String itens[][];
                  String consumiveis[][];
                  String ficha[][];

                  ListaItens inv = joga.getPersonagem().getInventario();
                  ListaConsumiveis cons = joga.getPersonagem().getConsumiveis();
                  itens = inv.getNomeQuant();
                  consumiveis = cons.getNomeQuant();

                  ficha = new String[itens.length + consumiveis.length + 1][5];

                  ficha[0][0] = "/atualizarItens";

                  int i = 1;
                  for (int j = 0; j < itens.length; j++) {
                        ficha[i][0] = itens[j][0];
                        ficha[i][1] = itens[j][1];
                        ficha[i][2] = itens[j][2];
                        ficha[i][3] = itens[j][3];
                        ficha[i][4] = itens[j][4];
                        i++;
                  }
                  for (int j = 0; j < consumiveis.length; j++) {
                        ficha[i][0] = consumiveis[j][0];
                        ficha[i][1] = consumiveis[j][1];
                        ficha[i][2] = consumiveis[j][2];
                        ficha[i][3] = consumiveis[j][3];
                        i++;
                  }

                  jogador.getSaida().writeObject(ficha);
                  atualizarItensMestre(jogador);
            }

      }
      
      
      public void enviarResultados(String[][] mensagem) throws IOException{
            
           Jogador jogadores[] = jogador.getSala().getJogadores();
           
           for(Jogador j: jogadores){
                 if(j.isConfirmado())
                       j.getSaida().writeObject(mensagem);
           }
            
      }
      
      public void atualizarDano(String[][] mensagem) throws IOException{
            jogador.getPersonagem().setCaracteristicas("DANO", Integer.parseInt(mensagem[1][0]));
            jogador.getSaida().writeObject(mensagem);
      }

      public void atualizarItensMestre(Jogador jogador) throws IOException{
            Jogador mestre = jogador.getSala().getMestre();
      
             String itens[][];
                  String consumiveis[][];
                  String ficha[][];
                  
              if(jogador != mestre){
                  ListaItens inv = jogador.getPersonagem().getInventario();
                  ListaConsumiveis cons = jogador.getPersonagem().getConsumiveis();
                  itens = inv.getNomeQuant();
                  consumiveis = cons.getNomeQuant();

                  ficha = new String[itens.length + consumiveis.length + 2][5];

                  ficha[0][0] = "/atualizarItensMestre";
                  ficha[1][0] = jogador.getPersonagem().getCaracteristicas("NOME");

                  int i = 2;
                  for (int j = 0; j < itens.length; j++) {
                        ficha[i][0] = itens[j][0];
                        ficha[i][1] = itens[j][1];
                        ficha[i][2] = itens[j][2];
                        ficha[i][3] = itens[j][3];
                        ficha[i][4] = itens[j][4];
                        i++;
                  }
                  for (int j = 0; j < consumiveis.length; j++) {
                        ficha[i][0] = consumiveis[j][0];
                        ficha[i][1] = consumiveis[j][1];
                        ficha[i][2] = consumiveis[j][2];
                        ficha[i][3] = consumiveis[j][3];
                        i++;
                  }
                  
                  mestre.getSaida().writeObject(ficha);
              }
      
      
      
      }

}
