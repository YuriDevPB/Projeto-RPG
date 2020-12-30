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
public class ListaArmasPesadas {
    private ListaItens armasPesadas;
               
        public ListaArmasPesadas(){
            initItens();
        }
        
        private void initItens(){  
            Itens marteloGuerra, espadaGrande;
            
            marteloGuerra = new Itens("MARTELO GUERRA", "FORCA", "ARMA", "2d6", 1000, "0");
            espadaGrande = new Itens("ESPADA GRANDE", "FORCA", "ARMA", "3d6", 2000, "0");
            
                        
            armasPesadas = new ListaItens(marteloGuerra);
            armasPesadas.addItem(espadaGrande);

        }
        
        public ListaItens getListaArmasPesadas(){
              return this.armasPesadas;
        }
}
