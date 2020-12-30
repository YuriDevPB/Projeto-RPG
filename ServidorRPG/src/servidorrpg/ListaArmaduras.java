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
public class ListaArmaduras {
    private ListaItens Larmaduras;
               
        public ListaArmaduras(){
            initItens();
        }
        
        private void initItens(){  
            Itens roupas,couro,couroBatido,brigandina,cotaMalha,escamas,cotaMalhaRef,armaduraCompleta;
            
            roupas = new Itens("ROUPAS", "NADA", "ARMADURA", "0", 0, "AGILIDADE");
            couro = new Itens("COURO", "NADA", "ARMADURA", "0", 200, "AGILIDADE+1");
            couroBatido = new Itens("COURO BATIDO", "FORCA 11", "ARMADURA", "0", 500, "AGILIDADE+2");
            brigandina =  new Itens("BRIGANDINA", "FORCA 11", "ARMADURA", "0", 500, "13");
            cotaMalha =  new Itens("COTA MALHA", "FORCA 13", "ARMADURA", "0", 1000, "15");
            escamas =  new Itens("ESCAMAS", "FORCA 13", "ARMADURA", "0", 2000, "16");
            cotaMalhaRef =  new Itens("COTA MALHA REFORCADO", "FORCA 15", "ARMADURA", "0", 5000, "17");
            armaduraCompleta =  new Itens("ARMADURA  COMPLETA", "FORCA 15", "ARMADURA", "0", 25000, "18");
            
                        
            Larmaduras = new ListaItens(roupas);
            Larmaduras.addItem(couro);
            Larmaduras.addItem(couroBatido);
            Larmaduras.addItem(brigandina);
            Larmaduras.addItem(cotaMalha);
            Larmaduras.addItem(escamas);
            Larmaduras.addItem(cotaMalhaRef);
            Larmaduras.addItem(armaduraCompleta);
            
        }

        public ListaItens getListaArmaduras(){
            return this.Larmaduras;
        }
}
