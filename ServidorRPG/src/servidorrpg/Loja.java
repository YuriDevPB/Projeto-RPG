/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;


/**
 *
 * @author Pichelli
 */
public class Loja {
      private final ListaItens listaFixa;
      private final ListaConsumiveis consFixo;
      private ListaItens listaVol;
      private ListaConsumiveis consVol;
      
      public Loja(){
            listaFixa = new ListaItens();
            consFixo = new ListaConsumiveis();
            iniListaFixa();
            iniConsFixo();

      }
      /*Inicia a lista de itens fixa que vamos usar como base para a lista volatil. Iniciamos ela a partir das listas de itens
            separados que ja temos.*/
      private void iniListaFixa(){
            Itens aux[];
            
            aux = new ListaArmaduras().getListaArmaduras().getItens();
            addListaFixa(aux);
                  
             aux = new ListaArmasBasicas().getListaArmasBasicas().getItens();
            addListaFixa(aux);
            
             aux = new ListaArmasDistancia().getListaArmasDistancia().getItens();
            addListaFixa(aux);
            
             aux = new ListaArmasMilitares().getListaArmasMilitares().getItens();
            addListaFixa(aux);
            
             aux = new ListaArmasPesadas().getListaArmasPesadas().getItens();
            addListaFixa(aux);
            
             aux = new ListaArmasRapidas().getListaArmasRapidas().getItens();
            addListaFixa(aux);
            
             aux = new ListaEscudos().getListaEscudos().getItens();
            addListaFixa(aux);      
     }
      /*Inicia a lista de consumiveis fixa que vamos usar como base para a lista volatil. Iniciamos ela a partir da lista de 
          consumiveis separados que ja temos.*/      
      private void iniConsFixo(){
            Consumiveis aux[];
             
            aux = new ListaIniCons().getListaIniConsumiveis().getConsumiveis();
            addConsFixo(aux);
      }
       /*
           Metodo utilizado para adicionar os itens na lista fixa.
      */
      private  void addListaFixa(Itens aux[]){
                      
            for(Itens i : aux){                 
                  i.setQuantidade(0);
                  listaFixa.addItem(i);
            }  
      }
       /*
           Metodo utilizado para adiciona os consumiveis nos consumiveis fixo.
      */
       private  void addConsFixo(Consumiveis aux[]){
                      
            for(Consumiveis i : aux){                 
                  i.setQuantidade(0);
                  consFixo.addConsumivel(i);
            }  
      }
         /*
            Metodo utilizado para criar as listas  volateis de acordo com os valores passados. Retirando os itens que tem a 
            quantidade 0.A String valores deve seguir a regra da string retorno descrita no metodo getTodosVol()
      */
      public synchronized void atualizarListas(String[][] valores) {
            listaVol = new ListaItens();
            consVol = new ListaConsumiveis();
            Consumiveis conAux;
            Itens itemAux;

            int limite = valores.length;

            for (int i = 1; i < limite; i++) {
                  if (Integer.parseInt(valores[i][6]) > 0) {
                        if (valores[i][0].equalsIgnoreCase("CONSUMIVEL")) {
                              conAux = new Consumiveis(valores[i][1], valores[i][0], valores[i][2], Integer.parseInt(valores[i][5]), Integer.parseInt(valores[i][6]));
                              consVol.addConsumivel(conAux);
                        } else {
                              if (valores[i][0].equalsIgnoreCase("ARMADURA")) {
                                    if (valores[i][4] != null && valores[i][4].charAt(0) == 'A') {
                                          itemAux = new Itens(valores[i][1], "FORCA", valores[i][0], valores[i][4], Integer.parseInt(valores[i][5]),"0",Integer.parseInt(valores[i][6]));
                                    } else {
                                          itemAux = new Itens(valores[i][1], "FORCA", valores[i][0], valores[i][2], Integer.parseInt(valores[i][5]), valores[i][4], Integer.parseInt(valores[i][6]));
                                    }
                              } else {
                                    itemAux = new Itens(valores[i][1], valores[i][3], valores[i][0], valores[i][2], Integer.parseInt(valores[i][5]), valores[i][4], Integer.parseInt(valores[i][6]));
           
                              }
                              listaVol.addItem(itemAux);
                        }
                  }
            }
      }
      /*
      Passa os valores de todos os itens e consumiveis das listas Volateis, tais valores serão utilizados para se 
      montar as tabelas da loja do jogador.
      
      retorno[n][0] sempre recebe o tipo do item;
      retorno[n][1] sempre recebe o nome do item;
      retorno[n][2] recebe o dano ou a cura do item;
      retorno[n][3] recebe o modificador do item caso exista;
      retorno[n][4] recebe a defesa do item, em caso de ser uma armadura que tenha def relativa a atributo então ele
                        recebe o dano,  onde nesse caso tera uma string representado defesa;
      retorno[n][5] sempre recebe o preço do item;
      retorno[n][6] sempre recebe a quantidade;
      
      *n é o numero da linha 
      */
      public synchronized String[][] getTodosVol(){
           String retorno[][] = new String[listaVol.getTamanho() + consVol.getTamanho()+1][7];
          
           retorno[0][0] = "comando";
           int cont = 1;
           
          Itens auxItens[];
          Consumiveis auxCon[];  
          
          auxItens = listaVol.getItens();
          auxCon = consVol.getConsumiveis();
          
            for(Itens i : auxItens){                 
                retorno[cont][0] = i.getTipoItem();
                retorno[cont][1] = i.getNome();
                retorno[cont][5] = Integer.toString(i.getPreco());
                retorno[cont][6] = Integer.toString(i.getQuantidade());
                
                if(i.getTipoItem().equalsIgnoreCase("ARMADURA")){
                            retorno[cont][2] = i.getDano();
                            retorno[cont][4] = i.getDefesa();
                      
               }else{
                      retorno[cont][2] = i.getDano();
                      retorno[cont][3] = i.getMod();
                      retorno[cont][4] = i.getDefesa();
                }
                cont++;
            } 
          
           for(Consumiveis i : auxCon){                 
                retorno[cont][0] = i.getTipoItem();
                retorno[cont][1] = i.getNome();
                retorno[cont][2] = i.getCura();
                retorno[cont][5] = Integer.toString(i.getPreco());
                retorno[cont][6] = Integer.toString(i.getQuantidade());
                 
                cont++;
           }    
            return retorno;
      } 
            
      /*
      Passa os valores de todos os itens e consumiveis das listas FIXAS, tais valores serão utilizados para  
      que o mestre indique a quantidade de itens ventidos nas lojas.
      
      retorno[n][0] sempre recebe o tipo do item;
      retorno[n][1] sempre recebe o nome do item;
      retorno[n][2] recebe o dano ou a cura do item;
      retorno[n][3] recebe o modificador do item caso exista;
      retorno[n][4] recebe a defesa do item, em caso de ser uma armadura que tenha def relativa a atributo então ele
                        recebe o dano,  onde nesse caso tera uma string representado defesa;
      retorno[n][5] sempre recebe o preço do item;
      retorno[n][6] sempre recebe a quantidade;
      
      *n é o numero da linha 
      */
      public synchronized String[][] getTodosfixos(){
           String retorno[][] = new String[listaFixa.getTamanho() + consFixo.getTamanho()+1][7];
          
           retorno[0][0] = "comando";
           int cont = 1;
           
          Itens auxItens[];
          Consumiveis auxCon[];  
          
          auxItens = listaFixa.getItens();
          auxCon = consFixo.getConsumiveis();
          
          for(Itens i : auxItens){                 
                retorno[cont][0] = i.getTipoItem();
                retorno[cont][1] = i.getNome();
                retorno[cont][5] = Integer.toString(i.getPreco());
                retorno[cont][6] = Integer.toString(i.getQuantidade());
                
                if(i.getTipoItem().equalsIgnoreCase("ARMADURA")){
                      if(i.getDano().charAt(0) == 'A')
                              retorno[cont][4] = i.getDano();
                      else{
                            retorno[cont][2] = i.getDano();
                            retorno[cont][4] = i.getDefesa();
                      }
               }else{
                      retorno[cont][2] = i.getDano();
                      retorno[cont][3] = i.getMod();
                      retorno[cont][4] = i.getDefesa();
                }
                cont++;
            } 
          
           for(Consumiveis i : auxCon){                 
                retorno[cont][0] = i.getTipoItem();
                retorno[cont][1] = i.getNome();
                retorno[cont][2] = i.getCura();
                retorno[cont][5] = Integer.toString(i.getPreco());
                retorno[cont][6] = Integer.toString(i.getQuantidade());
                 
                cont++;
           }    
            return retorno;
      }
       
      
     public synchronized Itens getItem(String nome,String tipo){
            listaVol.getItem(nome).setQuantidade( listaVol.getItem(nome).getQuantidade() - 1);
            Itens item =  listaVol.getItem(nome);
            Itens itemaux = new Itens(item.getNome(), item.getMod(),item.getTipoItem(),item.getDano(),item.getPreco(), item.getDefesa(), 1);
            
           return itemaux;                 
     }
     
     public synchronized Consumiveis getCons(String nome,String tipo){
            consVol.getConsumivel(nome).setQuantidade( consVol.getConsumivel(nome).getQuantidade() - 1);
           Consumiveis cons =   consVol.getConsumivel(nome);
           
           Consumiveis consAux = new Consumiveis(cons.getNome(),cons.getTipoItem(), cons.getCura(), cons.getPreco(),1);
            
            return consAux;                 
     }
     
     public Itens getItemFixo(String nome){
            Itens item =  listaFixa.getItem(nome);
            Itens itemaux = new Itens(item.getNome(), item.getMod(),item.getTipoItem(),item.getDano(),item.getPreco(), item.getDefesa(), 1);
            System.out.println(itemaux.getNome());
           return itemaux; 
     }
     
        public Consumiveis getConsFixo(String nome){
           Consumiveis cons =   consFixo.getConsumivel(nome);
              
           Consumiveis consAux = new Consumiveis(cons.getNome(),cons.getTipoItem(), cons.getCura(), cons.getPreco(),1);
            System.out.println(consAux.getNome());
            return consAux;                 
     }
     
}

