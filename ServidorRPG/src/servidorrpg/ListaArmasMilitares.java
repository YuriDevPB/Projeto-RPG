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
public class ListaArmasMilitares {
       private ListaItens armasMilitares;
               
        public ListaArmasMilitares(){
            initItens();
        }
        
        private void initItens(){  
            Itens espadaBastarda,alabarda,lanca,lancaDeCavalaria,maca,machadoBatalha,pique,tridente;
            
            espadaBastarda = new Itens("ESPADA BASTARDA", "FORCA", "ARMA", "2d6", 1000, "0");
            alabarda = new Itens("ALABARDA", "FORCA", "ARMA", "1d6+2", 1000, "0");
            lanca = new Itens("LANCA", "FORCA", "ARMA", "1d6", 100, "0");
            lancaDeCavalaria =  new Itens("LANCA CAVALARIA", "FORCA", "ARMA", "1d6+1", 500, "0");
            maca =  new Itens("MACA", "FORCA", "ARMA", "1d6", 500, "0");
            machadoBatalha =  new Itens("MAHCADO BATALHA", "FORCA", "ARMA", "1d6+2", 500, "0");
            pique =  new Itens("PIQUE", "FORCA", "ARMA", "1d6", 500, "0");
            tridente =  new Itens("TRIDENTE", "FORCA", "ARMA", "1d6", 500,"0");
            
                        
            armasMilitares = new ListaItens(espadaBastarda);
            armasMilitares.addItem(alabarda);
            armasMilitares.addItem(lanca);
            armasMilitares.addItem(lancaDeCavalaria);
            armasMilitares.addItem(maca);
            armasMilitares.addItem(machadoBatalha);
            armasMilitares.addItem(pique);
            armasMilitares.addItem(tridente);
            
        }

        public ListaItens getListaArmasMilitares(){
            return this.armasMilitares;
        }
}


