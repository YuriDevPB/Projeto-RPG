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
public class ListaEscudos {
    private ListaItens escudos;
               
        public ListaEscudos(){
            initItens();
        }
        
        private void initItens(){  
            Itens escudoPequeno, escudoGrande;
            
            escudoPequeno = new Itens("ESCUDO PEQUENO", "FORCA", "ARMA", "1", 500, "1");
            escudoGrande = new Itens("ESCUDO GRANDE", "FORCA", "ARMA", "1d3", 1000, "2");
            
                        
            escudos = new ListaItens(escudoPequeno);
            escudos.addItem(escudoGrande);

        }

        public ListaItens getListaEscudos(){
            return this.escudos;
        }   

}
