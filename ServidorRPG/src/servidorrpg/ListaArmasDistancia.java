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
public class ListaArmasDistancia {
    private ListaItens armasDistancia;
               
        public ListaArmasDistancia(){
            initItens();
        }
        
        private void initItens(){  
            Itens arco,arcoLongo,besta,bestaManual,funda,pistola,rifle,zarabatana;
            
            arco= new Itens("ARCO", "AGILIDADE", "ARMA", "1d6", 500, "0");
            arcoLongo = new Itens("ARCO LONGO", "AGILIDADE", "ARMA", "1d6+1", 1000, "0");
            besta = new Itens("BESTA", "AGILIDADE", "ARMA", "2d6", 1000, "0");
            bestaManual =  new Itens("BESTA MANUAL", "AGILIDADE", "ARMA", "1d6", 2000, "0");
            funda =  new Itens("FUNDA", "AGILIDADE", "ARMA", "1d3", 50, "0");
            pistola =  new Itens("PISTOLA", "AGILIDADE", "ARMA", "2d6", 5000, "0");
            rifle =  new Itens("RIFLE", "AGILIDADE", "ARMA", "3d6", 10000, "0");
            zarabatana =  new Itens("ZARABATANA", "AGILIDADE", "ARMA", "1d3", 100, "0");
            
                        
            armasDistancia = new ListaItens(arco);
            armasDistancia.addItem(arcoLongo);
            armasDistancia.addItem(besta);
            armasDistancia.addItem(bestaManual);
            armasDistancia.addItem(funda);
            armasDistancia.addItem(pistola);
            armasDistancia.addItem(rifle);
            armasDistancia.addItem(zarabatana);
            
        }

        public ListaItens getListaArmasDistancia(){
            return this.armasDistancia;
        }
}
