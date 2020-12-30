/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Pichelli
 */
public class Jogador {
   final private Socket cliente;
   private Personagem personagem;
   private boolean mestre,confirmado;
   private SalaJogo sala;
   private final ObjectOutputStream saida;


   
   public Jogador(Socket jogador) throws IOException{
       cliente = jogador;
       sala = null;
       saida = new ObjectOutputStream(cliente.getOutputStream()); 
   }
   
      public ObjectOutputStream getSaida() {
            return saida;
      }
   
   public void setSala(SalaJogo sala) {
            this.sala = sala;
      }

      public SalaJogo getSala() {
            return sala;
      }
   
    public Socket getCliente() {
        return cliente;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
    public boolean isMestre(){
        return mestre;
    }
    
    public void setMestre(boolean mestre){
        this.mestre = mestre;
    } 
    
    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

}
