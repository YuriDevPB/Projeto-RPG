package servidorrpg;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichelli
 */
public class TratadorMensagem implements Runnable {

      private final Socket cliente;
      private final ServidorRPG servidor;
      private final Jogador jogador;
      private final ControleJogo control;
      private final ObjectInputStream entrada;

      public TratadorMensagem(Socket cliente, ServidorRPG servidor) throws IOException {
            this.cliente = cliente;
            this.servidor = servidor;
            jogador = new Jogador(cliente);
            servidor.addJogadores(jogador);
            control = new ControleJogo(this.servidor, jogador);
            entrada = new ObjectInputStream(this.cliente.getInputStream());  
      }

      @Override
      public void run() {
            String mensagem[][];
            String comando;
            
            try {
                                   
                  while (true) {
                        System.out.println("aguardando");
                        mensagem =(String[][]) entrada.readObject();
                        comando = mensagem[0][0];
                        System.out.println(comando);
                       
                        if (comando.startsWith("/")) {        
                              switch (comando) {
                                     case "/mandarSala":
                                           control.mandarSalas();
                                           break;
                                     case "/criarSala":
                                           control.criarSala();                                  
                                           break;
                                     case "/entrarSala":
                                           control.entrarSala(Integer.parseInt(mensagem[0][1]));
                                           break;
                                     case "/mandarExemplos":
                                           control.mandarExemplos(mensagem[0][1]);
                                           break;
                                     case  "/confirma":
                                           control.criarPersonagem(mensagem);
                                           break;
                                     case "/mestre":
                                            control.setMestre();
                                           break;
                                     case "/ficha":
                                           control.montarFicha();
                                           break;
                                     case "/desconectou":
                                           control.desconectar();
                                           break;
                                     case "/chat":
                                           control.enviarMensagem(mensagem[0][1]);    
                                           break;
                                     case "/menuLoja":
                                                control. enviarMenuLoja();
                                           break;
                                      case "/exemploLoja" :
                                         control.enviarLojaVolEx();
                                           break;
                                      case "/lojaMestre":
                                            control.enviarLojaFixa();
                                            break;
                                      case "/loja":
                                            control.enviarLojaVol();
                                            break;
                                      case "/fecharLoja":
                                            control.fecharLoja();
                                           break;
                                      case "/atualizarLista":
                                            control.atualizarLoja(mensagem);
                                            break;
                                       case"/comprar":
                                             control.comprarItem(mensagem);
                                             break;
                                       case"/removerInv":
                                             control.removerInv(mensagem);
                                             break;
                                       case"/removerInvMestre":
                                             control.removerInvMestre(mensagem);
                                             break;
                                       case "/fichaMestre":
                                             control.enviarListaPersonagem();
                                             break;
                                       case "/fichaMestreEnviar":
                                             control.enviarFichaPersonagemX(mensagem[0][1]);
                                             break;
                                       case "/atualizarVFicha":
                                             control.atualizarVFicha(mensagem);
                                             break;
                                       case "/listaArmas":
                                             control.mandarListaArmas();
                                             break;
                                       case"/listaArmaduras":
                                             control.mandarListaArmaduras();
                                             break;
                                       case"/listaConsumiveis":
                                             control.mandarListaConsumiveis();
                                             break; 
                                       case"/addInv":
                                             control.addInv(mensagem);
                                             break;
                                       case"/resultados":
                                             control.enviarResultados(mensagem);
                                             break;
                                       case"/resultadosD20":
                                             control.enviarResultados(mensagem);
                                             break;
                                       case "/atualizarDano":
                                             control.atualizarDano(mensagem);
                                             break;
                                       default:
                                           
                                           System.out.println("Comando Invalido");
                                                  
                              }
                       }
                  }
            } catch (IOException ex) {
                  Logger.getLogger("Erro na execução do thread da classe Jogo");
            } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TratadorMensagem.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
}

