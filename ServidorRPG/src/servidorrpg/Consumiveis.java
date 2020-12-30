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
public class Consumiveis {
    
   private final String nome, tipoItem, cura;
   private final int preco;
   private int quantidade;
   private Consumiveis proxItem;

   
   public Consumiveis(String nome, String tipoItem, String cura, int preco) {
        this.nome = nome;
       this.tipoItem = tipoItem;
        this.cura= cura;
        this.preco = preco;
        this.quantidade = 1;
        this.proxItem = null;
    }
    
    public Consumiveis(String nome, String tipoItem, String cura, int preco, int quantidade) {
         this.nome = nome;
       this.tipoItem = tipoItem;
        this.cura= cura;
        this.preco = preco;
        this.quantidade = quantidade;
        this.proxItem = null;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public String getCura() {
        return cura;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public Consumiveis getProxItem(){
        return proxItem;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setProxItem(Consumiveis proxItem){
          this.proxItem = proxItem;
    }
}


