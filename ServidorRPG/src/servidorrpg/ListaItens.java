/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;


/**
 *
 * @author rafae
 */
public class ListaItens {
    
    private Itens cabeca;
    private Itens cauda;
    private int nElementos;
    
    public ListaItens(){
        nElementos = 0;
    }
    
    public ListaItens(Itens cabeca){
        this.cabeca = cabeca;
        this.cauda = cabeca;
        this.nElementos = 1;
    }
    
    public void addItem(Itens item){
          if(nElementos == 0){
                cabeca = item;
                cauda = item;
                nElementos++;
          }else{
                  if(getItem(item.getNome()) != null)
                        getItem(item.getNome()).setQuantidade( getItem(item.getNome()).getQuantidade() + 1);
                  else{
                        cauda.setProxItem(item);
                        cauda = item;
                        nElementos++;
                  }  
         }
    }
    
    public int getTamanho(){
        return this.nElementos;
    }
    
    public Itens getItem(String nomeItem){
          Itens itemAux = cabeca;        
          Itens retorno = null;  
          
          for(int i = 0; i < this.nElementos;i++){
             if(itemAux.getNome().equalsIgnoreCase(nomeItem)){
                 retorno = itemAux;
                 break;
             }            
            itemAux = itemAux.getProxItem();  
          }
          return retorno;           
    }
    
    public String[][] getNomeQuant(){
        String retorno[][];
        retorno = new String[nElementos+1][5];
        
         retorno[0][0] = Integer.toString(nElementos);
        
         Itens item = cabeca;
        for(int i = 1; i <= this.nElementos;i++){
           retorno[i][0] = item.getTipoItem();
           retorno[i][1] = item.getNome();
           
           if(item.getTipoItem().equalsIgnoreCase("ARMA")){
                retorno[i][2] = item.getDano();
                retorno[i][4] = item.getMod();
           }
           
           else if(item.getTipoItem().equalsIgnoreCase("ARMADURA"))
                  retorno[i][2] = item.getDefesa();
           
                  retorno[i][3] = Integer.toString(item.getQuantidade());
           
                  item = item.getProxItem();
            }
            return retorno;
    }
    
    public Itens[] getItens(){
         Itens retorno[] = new Itens[nElementos];
         
         Itens item = cabeca;
         for(int i = 0; i < this.nElementos;i++){
               retorno[i] = item;
               item = item.getProxItem();
        }
          
          return retorno;
          
    }
    
      public void removerItem(String nome) {
            Itens aux1, aux2;
            if (getItem(nome) != null) {
                  aux1 = getItem(nome);
                  if(aux1 == cabeca){
                    cabeca = aux1.getProxItem();
                    nElementos--;
                  }else{
                        aux2 = cabeca;
                  
                        for (int i = 0; i < this.nElementos; i++) {
                              if (aux2.getProxItem() == aux1) {
                                    aux2.setProxItem(aux1.getProxItem());
                                    nElementos--;
                                    break;
                              } else {
                                    aux2 = aux2.getProxItem();
                              }
                        }
                  }
            }
      }
      
    public void printLista(){
        
        Itens item = cabeca;
        for(int i = 0; i < this.nElementos;i++){
            System.out.println(item.getNome());
            item = item.getProxItem();
        }
    
    }
}
