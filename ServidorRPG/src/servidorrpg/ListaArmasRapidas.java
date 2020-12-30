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
public class ListaArmasRapidas {
       private ListaItens armasRapidas;
    
        
        public ListaArmasRapidas(){
            initItens();
        }
        
        private void initItens(){  
            Itens chicote,corrente,rapieira;
            
            chicote = new Itens("CHICOTE", "ACUIDADE", "ARMA", "1d3", 500, "0");
            corrente = new Itens("CORRENTE","ACUIDADE","ARMA", "1D6", 500, "0");
            rapieira = new Itens("RAPIEIRA","ACUIDADE","ARMAS", "1D6+1", 1000, "0");
            
            armasRapidas = new ListaItens(chicote);
            armasRapidas.addItem(corrente);
            armasRapidas.addItem(rapieira);
        
        }

        public ListaItens getListaArmasRapidas(){
            return this.armasRapidas;
        }
        
}
