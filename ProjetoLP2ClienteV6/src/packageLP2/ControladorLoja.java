/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLP2;
import java.awt.print.PrinterException;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichelli
 */
public class ControladorLoja {
      
      private final Loja loja;
      private final JButton btnLoja;
      private JTable tables[];
      private final ObjectOutputStream saida;
      
      public ControladorLoja(JButton btnLoja,ObjectOutputStream saida){
            loja = new Loja(this);
            this.btnLoja = btnLoja;      
            this.saida = saida;
      }
      
      public void mostrarMenu(){
             loja.setVisible(true);
      } 
      
      public void montarTablesLojaMestre(String[][] valores) throws PrinterException{
            tables = loja.getTablesMontarLoja();
             
            for(JTable t : tables){
                  removerLinhas(t);
               }
            
              int j;
              for(int i = 1;i < valores.length; i++){
                if (valores[i][0].equalsIgnoreCase("ARMA") || valores[i][0].equalsIgnoreCase("ESCUDO")){
                    j = loja.iteraTable(tables[0], valores[i][1]);
                        tables[0].setValueAt(valores[i][3], j, 1);
                        tables[0].setValueAt(valores[i][2], j, 2);
                        tables[0].setValueAt(valores[i][4], j, 3);  
                        tables[0].setValueAt(valores[i][6], j, 4);
                        tables[0].setValueAt(valores[i][5], j, 5);
                        
                }else if(valores[i][0].equalsIgnoreCase("ARMADURA")){
                        j = loja.iteraTable(tables[1], valores[i][1]);
                        tables[1].setValueAt(valores[i][4], j, 1);
                         tables[1].setValueAt(valores[i][6], j, 2);
                         tables[1].setValueAt(valores[i][5], j, 3);
                
                }else if(valores[i][0].equalsIgnoreCase("CONSUMIVEL")){
                 j = loja.iteraTable(tables[2], valores[i][1]);
                       tables[2].setValueAt(valores[i][6], j, 1);
                        tables[2].setValueAt(valores[i][5], j, 2);
                }
              }
             loja.mostrarLoja();
              loja.setVisible(true);
       }
       
       public void montarTablesLojaCliente(String[][] valores) throws PrinterException{
             tables = loja.getTablesCliente();
             
             for(JTable t : tables){
                  removerLinhas(t);
               }
             
               int j;
              for(int i = 1;i < valores.length; i++){
                  if(Integer.parseInt(valores[i][6]) > 0 ){
                        if (valores[i][0].equalsIgnoreCase("ARMA") || valores[i][0].equalsIgnoreCase("ESCUDO")){
                              j = loja.iteraTable(tables[0], valores[i][1]);
                              tables[0].setValueAt(valores[i][3], j, 1);
                              tables[0].setValueAt(valores[i][2], j, 2);
                              tables[0].setValueAt(valores[i][4], j, 3);  
                              tables[0].setValueAt(valores[i][6], j, 4);
                              tables[0].setValueAt(valores[i][5], j, 5);
                   
                        }else if(valores[i][0].equalsIgnoreCase("ARMADURA")){
                              j = loja.iteraTable(tables[1], valores[i][1]);
                              tables[1].setValueAt(valores[i][4], j, 1);
                               tables[1].setValueAt(valores[i][6], j, 2);
                              tables[1].setValueAt(valores[i][5], j, 3);
                        }else if(valores[i][0].equalsIgnoreCase("CONSUMIVEL")){
                              j = loja.iteraTable(tables[2], valores[i][1]);
                              tables[2].setValueAt(valores[i][6], j, 1);
                              tables[2].setValueAt(valores[i][5], j, 2);
                        }
                  }
              }
             loja.mostrarLojaCliente();
              loja.setVisible(true);
       }
       
       public void montarTablesLojaExemplo(String[][] valores) throws PrinterException{
              tables = loja.getTablesMestre();
             
              for(JTable t : tables){
                  removerLinhas(t);
               }
              int j;
            for(int i = 1;i < valores.length; i++){
                  if(Integer.parseInt(valores[i][6]) > 0 ){
                        if (valores[i][0].equalsIgnoreCase("ARMA") || valores[i][0].equalsIgnoreCase("ESCUDO")){
                              j = loja.iteraTable(tables[0], valores[i][1]);
                              tables[0].setValueAt(valores[i][3], j, 1);
                              tables[0].setValueAt(valores[i][2], j, 2);
                              tables[0].setValueAt(valores[i][4], j, 3);  
                              tables[0].setValueAt(valores[i][6], j, 4);
                              tables[0].setValueAt(valores[i][5], j, 5);
                   
                        }else if(valores[i][0].equalsIgnoreCase("ARMADURA")){
                              j = loja.iteraTable(tables[1], valores[i][1]);
                              tables[1].setValueAt(valores[i][4], j, 1);
                               tables[1].setValueAt(valores[i][6], j, 2);
                              tables[1].setValueAt(valores[i][5], j, 3);
                        }else if(valores[i][0].equalsIgnoreCase("CONSUMIVEL")){
                              j = loja.iteraTable(tables[2], valores[i][1]);
                              tables[2].setValueAt(valores[i][6], j, 1);
                              tables[2].setValueAt(valores[i][5], j, 2);
                        }
                  }
              }
             loja.mostrarLojaEx();
             loja.setVisible(true);
       }
      
        
       public ObjectOutputStream getSaida(){
             return this.saida;
       }
          
       public void removerLinhas(JTable table){
            DefaultTableModel model = (DefaultTableModel) table.getModel();            
             int linha;
             
             while(model.getRowCount() != 0){
                   linha = table.getModel().getRowCount() - 1;
                   model.removeRow(linha);     
             }
             
             
       }

       public void atualizarLinha(String mensagem[][]){
              DefaultTableModel model;      
             int valor;
             int linha = Integer.parseInt(mensagem[0][2]);
             tables = loja.getTablesCliente();
             
            
             if (mensagem[0][1].equalsIgnoreCase("ARMA")){
                    model = (DefaultTableModel) tables[0].getModel(); 
                    if(model.getRowCount()>0){
                         valor = Integer.parseInt(tables[0].getValueAt(linha, 4).toString()) - 1;
                    if(valor > 0)
                        tables[0].setValueAt(valor,linha, 4);
                    else
                   model.removeRow(linha);     
                    }
                }
             else if(mensagem[0][1].equalsIgnoreCase("ARMADURA")){
                   model = (DefaultTableModel) tables[1].getModel();            
                      if(model.getRowCount()>0){ 
                   valor = Integer.parseInt(tables[1].getValueAt(linha, 2).toString()) - 1;
                    if(valor > 0)
                        tables[1].setValueAt(valor,linha, 2);
                    else
                   model.removeRow(linha); 
                      }
             }
             else if(mensagem[0][1].equalsIgnoreCase("CONSUMIVEL")){
                model = (DefaultTableModel) tables[2].getModel();            
                   if(model.getRowCount()>0){   
                valor = Integer.parseInt(tables[2].getValueAt(linha, 1).toString()) - 1;
                    if(valor > 0)
                        tables[2].setValueAt(valor,linha, 1);
                    else
                         model.removeRow(linha); 
                   }
               }
       }      
       
         public void atualizarLinhaEx(String mensagem[][]){
              DefaultTableModel model;      
             int valor;
             int linha = Integer.parseInt(mensagem[0][2]);
             tables = loja.getTablesMestre();
             
            
             if (mensagem[0][1].equalsIgnoreCase("ARMA")){
                    model = (DefaultTableModel) tables[0].getModel(); 
                    if(model.getRowCount()>0){
                         valor = Integer.parseInt(tables[0].getValueAt(linha, 4).toString()) - 1;
                    if(valor > 0)
                        tables[0].setValueAt(valor,linha, 4);
                    else
                   model.removeRow(linha);     
                    }
                }
             else if(mensagem[0][1].equalsIgnoreCase("ARMADURA")){
                   model = (DefaultTableModel) tables[1].getModel();            
                      if(model.getRowCount()>0){ 
                   valor = Integer.parseInt(tables[1].getValueAt(linha, 2).toString()) - 1;
                    if(valor > 0)
                        tables[1].setValueAt(valor,linha, 2);
                    else
                   model.removeRow(linha); 
                      }
             }
             else if(mensagem[0][1].equalsIgnoreCase("CONSUMIVEL")){
                model = (DefaultTableModel) tables[2].getModel();            
                   if(model.getRowCount()>0){   
                valor = Integer.parseInt(tables[2].getValueAt(linha, 1).toString()) - 1;
                    if(valor > 0)
                        tables[2].setValueAt(valor,linha, 1);
                    else
                         model.removeRow(linha); 
                   }
               }
       }
         
         public void aviso(){
               
               loja.avisoDinheiro();
               
         }
         
         public void fecharLoja(){
               loja.dispose();
         }
}
       

