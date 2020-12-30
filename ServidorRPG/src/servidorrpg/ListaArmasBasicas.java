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
public class ListaArmasBasicas {
    private ListaItens armasBasicas;
               
        public ListaArmasBasicas(){
            initItens();
        }
        
        private void initItens(){  
            Itens adaga,azagaia,cajado,dardo,foice,machado,martelo,porrete;
            
            adaga = new Itens("ADAGA", "ACUIDADE", "ARMA", "1d3", 50, "0");
            azagaia = new Itens("AZAGAIA", "ACUIDADE", "ARMA", "1d3", 100, "0");
            cajado = new Itens("CAJADO", "ACUIDADE", "ARMA", "1d6+1", 50, "0");
            dardo =  new Itens("DARDO", "ACUIDADE", "ARMA", "1", 10, "0");
            foice =  new Itens("FOICE", "ACUIDADE", "ARMA", "1d6", 100, "0");
            machado =  new Itens("MACHADO", "ACUIDADE", "ARMA", "1d6+1", 100, "0");
            martelo =  new Itens("MARTELO", "ACUIDADE", "ARMA", "1d3", 100, "0");
            porrete =  new Itens("PORRETE", "ACUIDADE", "ARMA", "1d6", 50, "0");
            
                        
            armasBasicas = new ListaItens(adaga);
            armasBasicas.addItem(azagaia);
            armasBasicas.addItem(cajado);
            armasBasicas.addItem(dardo);
            armasBasicas.addItem(foice);
            armasBasicas.addItem(machado);
            armasBasicas.addItem(martelo);
            armasBasicas.addItem(porrete);
            
        }

        public ListaItens getListaArmasBasicas(){
            return this.armasBasicas;
        }
        
}
