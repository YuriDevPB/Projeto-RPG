/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLP2;

import java.awt.print.PrinterException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichelli
 */
public class ControleFichaMestre {

    private final JLabel labels[];
    private final JTextField paineis[]; 
    private final JButton buttons[];
    private final JTable tables[];
    private final FichaMestre ficha;
    private final ObjectOutputStream saida;
      
      
      public ControleFichaMestre(ObjectOutputStream saida) {
         ficha = new FichaMestre(this);
        paineis = ficha.getPaineis();
        labels = ficha.getLabels();
        buttons = ficha.getButtons();
        tables = ficha.getTables();
        this.saida = saida;
    }
    
    public ObjectOutputStream getSaida(){
          return saida;
    }
    
    public void montarLista(String[][] mensagem){
          ficha.montarListaPers(mensagem);
          ficha.setVisible(true);
    }
    
    public void atualizarLista(String[][] mensagem){
            ficha.montarListaPers(mensagem);
    }
    
    public void montarFicha(String[][] valores) throws PrinterException{
      
        for(JTable t : tables){
              removerLinhas(t);
        }
          
      labels[0].setText(valores[1][0]);
      labels[1].setText( valores[2][0] + " anos");
      labels[2].setText(valores[3][0]);
      labels[3].setText(valores[12][0]);
      labels[4].setText(valores[13][0]);
      labels[5].setText(valores[16][0]);
      labels[6].setText(valores[18][0]);
      
      paineis[0].setText(valores[4][0]);
      paineis[1].setText(valores[5][0]);
      paineis[2].setText(valores[6][0]);
      paineis[3].setText(valores[7][0]);
      paineis[4].setText(valores[8][0]);
      paineis[5].setText(valores[9][0]);
      paineis[6].setText(valores[10][0]);
      paineis[7].setText(valores[11][0]);
      paineis[8].setText(valores[14][0]);
      paineis[9].setText(valores[15][0]);
      paineis[10].setText(valores[17][0]);
      paineis[11].setText(valores[19][0]);

      
    int modFor,modAgi,modInt,modVon,modPer;
      
      modFor = Integer.parseInt(valores[4][0]) - 10;
      modAgi = Integer.parseInt(valores[5][0]) - 10;
      modInt = Integer.parseInt(valores[6][0]) - 10;
      modVon = Integer.parseInt(valores[7][0]) - 10;
      modPer = Integer.parseInt(valores[17][0]) - 10;
      
      buttons[0].setText(Integer.toString(modFor));
      buttons[1].setText(Integer.toString(modAgi));
      buttons[2].setText(Integer.toString(modInt));
      buttons[3].setText(Integer.toString(modVon));
      buttons[4].setText(Integer.toString(modPer));
      
      int j;
      for(int i = 20;i < valores.length; i++){
                if (valores[i][0].equalsIgnoreCase("ARMA")){
                    j = ficha.iteraTable(tables[0], valores[i][1]);
                        tables[0].setValueAt(valores[i][4], j, 1);
                        tables[0].setValueAt(valores[i][2], j, 2);  
                        tables[0].setValueAt(valores[i][3], j, 3);
                }else if(valores[i][0].equalsIgnoreCase("ARMADURA")){
                        j = ficha.iteraTable(tables[1], valores[i][1]);
                        tables[1].setValueAt(valores[i][2], j, 1);
                         tables[1].setValueAt(valores[i][3], j, 2);
                }else if(valores[i][0].equalsIgnoreCase("CONSUMIVEL")){
                 j = ficha.iteraTable(tables[2], valores[i][1]);
                       tables[2].setValueAt(valores[i][3], j, 1);
                }
                
            }
    
    }
    
    
    public void atualizarFicha(String[][] valores) throws PrinterException{
      
          for(JTable t : tables){
              removerLinhas(t);
            }
          
      int j;
      for(int i = 2;i < valores.length; i++){
                if (valores[i][0].equalsIgnoreCase("ARMA")){
                    j = ficha.iteraTable(tables[0], valores[i][1]);
                        tables[0].setValueAt(valores[i][4], j, 1);
                        tables[0].setValueAt(valores[i][2], j, 2);  
                        tables[0].setValueAt(valores[i][3], j, 3);
                }else if(valores[i][0].equalsIgnoreCase("ARMADURA")){
                        j = ficha.iteraTable(tables[1], valores[i][1]);
                        tables[1].setValueAt(valores[i][2], j, 1);
                         tables[1].setValueAt(valores[i][3], j, 2);
                }else if(valores[i][0].equalsIgnoreCase("CONSUMIVEL")){
                 j = ficha.iteraTable(tables[2], valores[i][1]);
                       tables[2].setValueAt(valores[i][3], j, 1);
                }            
      }  
    }
    
      public void atualizarItensMestre(String[][] valores) {
            if (valores[1][0].equalsIgnoreCase(labels[0].getText())) {
                  try {
                        for (JTable t : tables) {
                              removerLinhas(t);
                        }

                        int j;
                        for (int i = 3; i < valores.length; i++) {
                              if (valores[i][0].equalsIgnoreCase("ARMA")) {
                                    j = ficha.iteraTable(tables[0], valores[i][1]);
                                    tables[0].setValueAt(valores[i][4], j, 1);
                                    tables[0].setValueAt(valores[i][2], j, 2);
                                    tables[0].setValueAt(valores[i][3], j, 3);
                              } else if (valores[i][0].equalsIgnoreCase("ARMADURA")) {
                                    j = ficha.iteraTable(tables[1], valores[i][1]);
                                    tables[1].setValueAt(valores[i][2], j, 1);
                                    tables[1].setValueAt(valores[i][3], j, 2);
                              } else if (valores[i][0].equalsIgnoreCase("CONSUMIVEL")) {
                                    j = ficha.iteraTable(tables[2], valores[i][1]);
                                    tables[2].setValueAt(valores[i][3], j, 1);
                              }
                        }
                  } catch (PrinterException ex) {
                        Logger.getLogger(ControleFichaMestre.class.getName()).log(Level.SEVERE, null, ex);
                  }
            }
      }

    
    
    
    
    public void removerLinhas(JTable table){
            DefaultTableModel model = (DefaultTableModel) table.getModel();            
             int linha;
             
             while(model.getRowCount() != 0){
                   linha = table.getModel().getRowCount() - 1;
                   model.removeRow(linha);     
             } 
       }
    
    public void montarListaArmas(String[][] mensagem){
          ficha.montarListaArmas(mensagem);
    }
    
    public void montarListaArmaduras(String[][] mensagem){
          ficha.montarListaArmaduras(mensagem);
    }

    public void montarListaConsumiveis(String[][] mensagem){
          ficha.montarListaConsumiveis(mensagem);
    }
}
      

