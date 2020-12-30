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
public class ListaConsumiveis {
      private Consumiveis cabeca;
    private Consumiveis cauda;
    private int nElementos;
    
    public ListaConsumiveis(){
        nElementos = 0;
    }
    
   public ListaConsumiveis(Consumiveis cabeca){
        this.cabeca = cabeca;
        this.cauda = cabeca;
        this.nElementos = 1;
    }
    
    public void addConsumivel(Consumiveis item){
          if(nElementos == 0){
                cabeca = item;
                cauda = item;
                nElementos++;
          }else{
                  if(getConsumivel(item.getNome()) != null)
                       getConsumivel(item.getNome()).setQuantidade( getConsumivel(item.getNome()).getQuantidade() + 1);
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
    
    public Consumiveis getConsumivel(String nomeItem){
          Consumiveis itemAux = cabeca;        
          Consumiveis retorno = null;  
          
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
        retorno = new String[nElementos][4];
                
         Consumiveis item = cabeca;
        for(int i = 0; i < this.nElementos;i++){
           retorno[i][0] = item.getTipoItem();
           retorno[i][1] = item.getNome();
           retorno[i][2] = item.getCura();
           retorno[i][3] = Integer.toString(item.getQuantidade());
           
            item = item.getProxItem();
        }
        return retorno;
    }
    
    
    public Consumiveis[] getConsumiveis(){
         Consumiveis retorno[] = new Consumiveis[nElementos];
         
         Consumiveis item = cabeca;
         for(int i = 0; i < this.nElementos;i++){
               retorno[i] = item;
               item = item.getProxItem();
        }
          return retorno;
         
    }
    
      public void removerItem(String nome) {
            Consumiveis aux1, aux2;
            if (getConsumivel(nome) != null) {
                  aux1 = getConsumivel(nome);
                  if (cabeca == aux1) {
                        cabeca = aux1.getProxItem();
                        nElementos--;
                  } else {
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
        
        Consumiveis item = cabeca;
        for(int i = 0; i < this.nElementos;i++){
            System.out.println(item.getNome());
            item = item.getProxItem();
        }
    
    }
}

