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
public class Itens {
    
   private final String nome, mod, tipoItem, dano, defesa;
   private final int preco;
   private int quantidade;
   private Itens proxItem;

    public Itens(String nome, String mod, String tipoItem, String dano, int preco, String defesa) {
        this.nome = nome;
        this.mod = mod;
        this.tipoItem = tipoItem;
        this.dano = dano;
        this.preco = preco;
        this.defesa = defesa;
        this.quantidade = 1;
        this.proxItem = null;
    }
    
    public Itens(String nome, String mod, String tipoItem, String dano, int preco,String defesa, int quantidade) {
        this.nome = nome;
        this.mod = mod;
        this.tipoItem = tipoItem;
        this.dano = dano;
        this.preco = preco;
        this.defesa = defesa;
        this.quantidade = quantidade;
        this.proxItem = null;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getMod() {
        return mod;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public String getDano() {
        return dano;
    }

    public int getPreco() {
        return preco;
    }

    public String getDefesa() {
        return defesa;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public Itens getProxItem(){
        return proxItem;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setProxItem(Itens proxItem){
          this.proxItem = proxItem;
    }
}

