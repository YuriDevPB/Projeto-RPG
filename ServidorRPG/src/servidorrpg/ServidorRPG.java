/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichelli
 */
public class ServidorRPG {
    //Chama metodo que vai iniciar o servidor
    public static void main(String[] args) throws IOException {
        new ServidorRPG().executa();
    }
    
    private final List<Jogador> jogadores;
     private final List<SalaJogo> salas;
     private int idSala;
    
    public ServidorRPG () throws UnknownHostException {
          salas = new ArrayList<>();
          jogadores = new ArrayList<>();
          idSala = 0;
    }

    public void executa () throws IOException {
        ServerSocket servidor = new ServerSocket(25565);
        System.out.println("Porta 25565 aberta!");
                
        //Fica sendo executado esperando a conexão do cliente.
        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("Nova conexão com o cliente " +   cliente.getInetAddress().getHostAddress());

            // cria tratador de cliente numa nova thread
            new Thread((Runnable) new TratadorMensagem(cliente,this)).start();
        }
    }
    
    public SalaJogo[] getSalas(){
            SalaJogo retorno[];
            if(!salas.isEmpty()){
                  retorno = new SalaJogo[salas.size()];
                  int i = 0;
            
                  for (SalaJogo j : salas) {
                        retorno[i] = j;
                        i++;
                  }
            
                  return retorno;
            }
            else
                  return null;
                          
    }
    
    public void criarSala(Jogador jogador){
          SalaJogo sala = new SalaJogo(jogador,idSala);
          idSala++;

          salas.add(sala);
    }
    
    public SalaJogo getSala(int id){
          return salas.get(id);
    }
    
    public void removerSala(SalaJogo sala){
          salas.remove(sala);
    }
    
    public void addJogadores(Jogador jogador){
          jogadores.add(jogador);
          System.out.println(jogadores.size());
    }
    
     public void removerJogador(Jogador jogador){
          jogadores.remove(jogador);
          System.out.println(jogadores.size());
    }
    
    public Object[] getJogadores(){
          return jogadores.toArray();
    }
}
/*
    public void distribuiMensagem(String msg) throws IOException {
        PrintStream saida;
        for(Jogador cliente : this.jogadores) {
            if(!cliente.isConfirmado()){
                saida = new PrintStream(cliente.getJogador().getOutputStream());
                saida.println(msg);
            }
        }
    }
    */