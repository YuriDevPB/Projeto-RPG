/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichelli
 */
public class SalaJogo {
     private final int id;
     private final List<Jogador> jogadores;
     private boolean temMestre;
     private Jogador mestre;

      public Jogador getMestre() {
            return mestre;
      }

      public void setMestre(Jogador mestre) {
            this.mestre = mestre;
      }
     private final Loja loja;

      public SalaJogo(Jogador jogador,int id){
            temMestre = false;
            this.id = id;
            jogadores = new ArrayList<>();
            jogadores.add(jogador);
            jogador.setSala(this);
            loja = new Loja();
      }
      
        public Loja getLoja() {
            return loja;
      }
      
      public void addJogador(Jogador jogador){
             jogadores.add(jogador);
             jogador.setSala(this);
      }
      
      public void removerJogador(Jogador jogador){
            jogadores.remove(jogador);
            jogador.setSala(null);
      }
      
      public void setMestre(boolean temMestre){
            this.temMestre = temMestre;
      }
      
      public int getID(){
            return this.id;
      }
      public int getQuantJog(){
            return jogadores.size();
      }
      
      public Jogador[] getJogadores(){
            Jogador retorno[];
            retorno = new Jogador[jogadores.size()];
            int i = 0;
            
           for (Jogador j : jogadores) {
                 retorno[i] = j;
                 i++;
           }
           return retorno;
      }
      
     public boolean temMestre(){
           return temMestre;
     }
}
