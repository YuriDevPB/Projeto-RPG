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
public class ListaIniCons {
      private ListaConsumiveis consumiveis;
               
        public ListaIniCons(){
            initItens();
        }
        
        private void initItens(){  
            Consumiveis cura,panaceia,tocha,dardos,balas,pedras,flechas,virotes;
            
            cura = new Consumiveis("POCAO CURA", "CONSUMIVEL", "TAXACURA", 200);
            panaceia = new Consumiveis("POCAO PANACEIA", "CONSUMIVEL", "TAXACURA*2", 10000);
            tocha = new Consumiveis("TOCHA","CONSUMIVEL","0",5);
            balas = new Consumiveis("BALAS","CONSUMIVEL","0",100);
            dardos = new Consumiveis("DARDOS","CONSUMIVEL","0",50);
            flechas = new Consumiveis("FLECHAS","CONSUMIVEL","0",50);
            pedras = new Consumiveis("PEDRAS","CONSUMIVEL","0",50);
            virotes = new Consumiveis("VIROTES","CONSUMIVEL","0",50);
                        
            consumiveis = new ListaConsumiveis(cura);
            consumiveis.addConsumivel(panaceia);
            consumiveis.addConsumivel(tocha);
            consumiveis.addConsumivel(balas);
            consumiveis.addConsumivel(dardos);
            consumiveis.addConsumivel(flechas);
            consumiveis.addConsumivel(pedras);
            consumiveis.addConsumivel(virotes);
            
        }

        public ListaConsumiveis getListaIniConsumiveis(){
            return this.consumiveis;
        }
        
}
