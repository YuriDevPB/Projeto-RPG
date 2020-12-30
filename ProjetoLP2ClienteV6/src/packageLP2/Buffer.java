/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLP2;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yuri Gabriel
 */
public class Buffer implements Runnable {

    private String valores[];
    private String mensagem[][];
    private final InicioJFrame frame;
    private final ObjectInputStream entrada;
    private boolean confirmado;

    public Buffer(Socket servidor, InicioJFrame frame) throws IOException {
        this.frame = frame;
        valores = new String[12];
        entrada = new ObjectInputStream(servidor.getInputStream());
    }

    @Override
    public void run() {
        try {
            while (!frame.getTemSala()) {
                mensagem = ((String[][]) entrada.readObject());

                if (mensagem[0][0].equalsIgnoreCase("/entrei")) {
                    frame.setTemSala(true);
                    if (mensagem[0][1].equalsIgnoreCase("true")) {
                        frame.getMestreButton().setEnabled(false);
                    }

                } else {
                    frame.tabelaSalas(mensagem);
                }
            }
            frame.getjFrameAnc().setVisible(true);

            while (!confirmado) {
                valores = ((String[]) entrada.readObject());
                

                if (valores[0].equalsIgnoreCase("/atualizar")) {
                    frame.getMestreButton().setEnabled(false);
                }else if(valores[0].equalsIgnoreCase("/atualizarT")){
                      frame.getMestreButton().setEnabled(true);
                } else if (valores[0].equalsIgnoreCase("/confirmado")) {
                    confirmado = true;
                }else if (valores[0].equalsIgnoreCase("/mestre")){
                      confirmado = true;
                      frame.getBtnLoja().setEnabled(true);
                      frame.setEhMestre(true);
                } else if (!valores[0].equalsIgnoreCase("/mestre")) {
                    frame.colocarValores(valores);
                    frame.setLayer(2);
                }
            }
            String comando;
            ControladorFicha controlFicha = new ControladorFicha(frame.getBtnFicha(),frame.getSaida());
            ControladorLoja controlLoja = new ControladorLoja(frame.getBtnLoja(), frame.getSaida());
            ControleFichaMestre controlFMestre = new ControleFichaMestre(frame.getSaida());
            while (true) {
                mensagem = ((String[][]) entrada.readObject());
                comando = mensagem[0][0];
                System.out.println(comando);
                
                switch (comando){
                      case "/chat":
                            frame.atualizarChat(mensagem);
                            break;
                      case "/ficha":
                            controlFicha.montarFicha(mensagem);
                            break;
                       case"/atualizarFicha":
                             controlFicha.atualizarFicha(mensagem);
                             break;
                       case"/atualizarAtributos":
                               controlFicha.atualizarAtributos(mensagem);
                                break;
                      case"/menuMestre":
                            controlLoja.mostrarMenu();
                            break;
                      case"/mostraExemplos":
                              controlLoja.montarTablesLojaExemplo(mensagem);
                           break;
                     case"/criandoLoja":
                           controlLoja.montarTablesLojaMestre(mensagem);
                           break;
                      case "/mostrarLoja":
                            controlLoja.montarTablesLojaCliente(mensagem);
                            break;
                      case"/abrirLoja":
                              frame.getBtnLoja().setEnabled(true);
                            break;
                      case "/fecharLoja":
                            frame.getBtnLoja().setEnabled(false);
                            controlLoja.fecharLoja();
                            break;
                     case"/atualizarLinha":
                           controlLoja.atualizarLinha(mensagem);
                           controlLoja.atualizarLinhaEx(mensagem);
                           break;
                     case"/liso":
                           controlLoja.aviso();
                           break;
                     case"/listaPersonagem":
                           controlFMestre.montarLista(mensagem);
                           break;
                     case"/fichaPersonagemX":
                           controlFMestre.montarFicha(mensagem);
                           break;
                      case"/atualizarLista":
                            controlFMestre.atualizarLista(mensagem);
                            break;
                      case"/listaArmas":
                            controlFMestre.montarListaArmas(mensagem);
                            break;
                     case"/listaArmaduras":
                           controlFMestre.montarListaArmaduras(mensagem);
                           break;
                     case"/listaConsumiveis":
                           controlFMestre.montarListaConsumiveis(mensagem);
                           break;
                      case"/atualizarItens":
                            controlFMestre.atualizarFicha(mensagem);
                            break;
                       case"/resultados":
                             frame.getlblRolagem().setText(mensagem[0][1]);
                             frame.getlblRolagem().setForeground(Color.WHITE);
                             break;
                       case"/resultadosD20":
                             frame.checarResultados(Integer.parseInt(mensagem[0][1]));
                             break;
                       case"/atualizarItensMestre":
                             controlFMestre.atualizarItensMestre(mensagem);
                              break;                
                          
                }
              
            }
        } catch (IOException | ClassNotFoundException | PrinterException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  

