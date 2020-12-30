/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorrpg;

/**
 *
 * @author rafae
 */
public class Personagem {
   
    
    String ancestralidade,nome,tamanho;
    int forca,intelecto,vontade,agilidade,poder;
    int defesa,saude,taxaCura,dano,percepcao,idade;
    int deslocamento,insanidade,corrupcao,nivel;
    int bits;

    String valores[];
    ListaItens inventario;
    ListaConsumiveis consumiveis;
    boolean temInv;
    
    //Recebe a ancestralidade do personagem e o nome do mesmo,
    //Apos isso chama criaancestralidade() para receber os valores
    //referentes a ancestralidade escolhida 
    Personagem(String ancestralidade){
        
        this.nome = "novoJogador";
        this.ancestralidade = ancestralidade.toUpperCase();
        criaAncestralidade(this.ancestralidade);
        addInventario("ADAGA", "ARMA BASICA");
        addInventario("FUNDA", "ARMA DISTANCIA");
        addInventario("ROUPAS", "ARMADURA");
        addConsumiveis("PEDRAS");
        consumiveis.getConsumivel("PEDRAS").setQuantidade(20);
        bits = 45;
    }

    //Esse construtor sera usado apenas para puxar o metodo getValoresini() o qual passa alguns valores iniciais
    //de cada ancestralidade.
      Personagem(){
        
    }
    
    //Recebe uma String ancestralidade a atribui os respectivos valores
    //para aquela ancestralidade
    private void criaAncestralidade(String ancestralidade){
        switch(ancestralidade){
            case "HUMANO":
                forca = 10;
                intelecto = 10;
                vontade = 10;
                agilidade = 10;
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto;
                tamanho = "1";
                deslocamento = 10;
                poder = 0;
                insanidade = 0;
                corrupcao = 0;
                nivel = 0;
                dano = 0;
                break;
                
            case "GOBLIN":
                forca = 8;
                intelecto = 10;
                vontade = 9;
                agilidade = 12;
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                tamanho = "1/2";
                deslocamento = 10;
                poder = 0;
                insanidade = 0;
                corrupcao = 0;
                nivel = 0;
                dano = 0;
                
                break;
            
            case "CHANGELING":
                forca = 9;
                intelecto = 10;
                vontade = 10;
                agilidade = 10;
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                tamanho = "1";
                deslocamento = 10;
                poder = 0;
                insanidade = 0;
                corrupcao = 0;
                nivel = 0;
                dano = 0;
                
                break;
            
            case "ANAO":
                forca = 10;
                intelecto = 10;
                vontade = 10;
                agilidade = 9;
                defesa = agilidade;
                saude = forca + 4;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                tamanho = "1/2";
                deslocamento = 8;
                poder = 0;
                insanidade = 0;
                corrupcao = 0;
                nivel = 0;
                dano = 0;
                
                break;
            
            case "AUTOMATO":
                forca = 9;
                intelecto = 9;
                vontade = 9;
                agilidade = 8;
                defesa = 13;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto;
                tamanho = "1";
                deslocamento = 8;
                poder = 0;
                insanidade = 0;
                corrupcao = 0;
                nivel = 0;
                dano = 0;
                break;
                
                case "ORC":
                forca = 11;
                intelecto = 9;
                vontade = 9;
                agilidade = 10;
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                tamanho = "1";
                deslocamento = 12;
                poder = 0;
                insanidade = 0;
                corrupcao = 1;
                nivel = 0;
                dano = 0;
                break;
            
            default:
                System.out.println("Erro criando o personagem");
                break;
        }
        
    }
    
    //Recebe uma String e retorna o valor da caracteristica respectiva.
    public String getCaracteristicas(String caracteristica){
        switch(caracteristica.toUpperCase()){
            
            case "FORCA":
                return Integer.toString(forca);
            
            case "AGILIDADE":
                return Integer.toString(agilidade);
            
            case "INTELECTO":
                return Integer.toString(intelecto);
            
            case "VONTADE":
                return Integer.toString(vontade);
                
            case "PERCEPCAO":
                return Integer.toString(percepcao);
            
            case "DEFESA":
                return Integer.toString(defesa);
                
            case "SAUDE":
                return Integer.toString(saude);
            
            case "TAXACURA":
                return Integer.toString(taxaCura);
                
            case "TAMANHO":
                return tamanho;
            
            case "DESLOCAMENTO":
                return Integer.toString(deslocamento);    
             
           case "PODER":
                return Integer.toString(poder);
            
            case "DANO":
                return Integer.toString(dano);
                
            case "INSANIDADE":
                return Integer.toString(insanidade);
            
            case "CORRUPCAO":
                return Integer.toString(corrupcao);
            
            case "NIVEL":
                return Integer.toString(nivel);
                
            case "IDADE":
                return Integer.toString(idade);
                    
            case "NOME":
                return nome;
                 
            case "ANCESTRALIDADE":
                return ancestralidade;
            
            default:
                return "Caracteristica Invalida";
        }
    }
    
    //Recebe uma String e um booleano representando a soma,e então
    //realiza a operação na caracteristica escolhida.
    //caso seja true faz a soma caso false faz a subtração
    public void setCaracteristicas(String caracteristica,int valor){           
        
        switch(caracteristica.toUpperCase()){
          
            case "FORCA":
                forca = valor;
                break;
                    
            case "AGILIDADE":
                agilidade = valor;
                break;
                    
            case "INTELECTO":
                intelecto = valor;
                break;
                    
            case "VONTADE":
                vontade = valor;
                break;
                    
            case "PERCEPCAO":
                percepcao = valor;
                break;
                   
            case "DEFESA":
                defesa -= valor;
                break;
                   
            case "SAUDE":
                saude = valor;
                break;
                   
            case "TAXACURA":
                taxaCura = valor;
                break;
                    
            case "DESLOCAMENTO":
                deslocamento = valor;    
                break;
                
            case "PODER":
                poder = valor;
                break;
                    
            case "DANO":
                dano = valor;
                break;
                    
            case "INSANIDADE":
                insanidade = valor;
                break;
            
            case "CORRUPCAO":
                corrupcao = valor;
                break;
                    
            case "NIVEL":
                nivel = valor;
                break;
                    
            case "IDADE":
                idade = valor;
                break;
                   
            default:
                System.out.print("Erro no setCaracteristicas");
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    
    public void bonusAncestralidade(){
        
        switch(ancestralidade){
            case "HUMANO":
                saude += 5;
                break;
                
            case "GOBLIN":
                saude += 4;
                break;
            
            case "CHANGELING":
                saude += 4;
                break;
            
            case "ANAO":
                saude += 6; 
                break;
            
            case "AUTOMATO":
                saude += 5;
                break;
                
            case "ORC":
                saude += 6;
                break;
            
            default:
                System.out.println("Erro no bonusAncestralidades");
                break;
        }
    }

    public void atualizarAtributos(){
        
         switch(ancestralidade){
            case "HUMANO":
               
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto;
                break;
                
            case "GOBLIN":
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                break;
            
            case "CHANGELING":
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;              
                break;
            
            case "ANAO":
                defesa = agilidade;
                saude = forca + 4;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                break;
            
            case "AUTOMATO":
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto;
                break;
                
                case "ORC":  
                defesa = agilidade;
                saude = forca;
                taxaCura = saude/4;
                percepcao = intelecto + 1;
                break;
            
            default:
                System.out.println("Erro criando no atualizarAtributos");
                break;
        }
        
    }
    
    
    public String[] getValoresIni(String ancestralidade){
        valores = new String[12];
        
          switch(ancestralidade){
            case "HUMANO":
                valores[0] = "10";
                valores[1] = "10";
                valores[2] = "10";
                valores[3] = "10";
                valores[4] = "10";
                valores[5] = "2";
                valores[6] = "10";
                valores[7]= "10";
                valores[8] = "0";
                valores[9] = "0";
                valores[10] = "1";
                valores[11] = "10";
                break;
                
            case "GOBLIN":
                valores[0] = "8";
                valores[1] = "12";
                valores[2] = "11";
                valores[3] = "12";
                valores[4] = "8";
                valores[5] = "2";
                valores[6] = "10";
                valores[7]= "9";
                valores[8] = "0";
                valores[9] = "0";
                valores[10] = "1/2";
                valores[11] = "10";
                break;
            
            case "CHANGELING":
                valores[0] = "9";
                valores[1] = "10";
                valores[2] = "11";
                valores[3] = "10";
                valores[4] = "9";
                valores[5] = "2";
                valores[6] = "10";
                valores[7]= "10";
                valores[8] = "0";
                valores[9] = "0";
                valores[10] = "1";
                valores[11] = "10";
                break;
            
            case "ANAO":
                valores[0] = "10";
                valores[1] = "9";
                valores[2] = "11";
                valores[3] = "9";
                valores[4] = "14";
                valores[5] = "3";
                valores[6] = "10";
                valores[7]= "10";
                valores[8] = "0";
                valores[9] = "0";
                valores[10] = "1/2";
                valores[11] = "8";
                break;
            
            case "AUTOMATO":
                valores[0] = "9";
                valores[1] = "8";
                valores[2] = "9";
                valores[3] = "13";
                valores[4] = "9";
                valores[5] = "2";
                valores[6] = "9";
                valores[7]= "9";
                valores[8] = "0";
                valores[9] = "0";
                valores[10] = "1";
                valores[11] = "8";
                break;
                
                case "ORC":
                valores[0] = "11";
                valores[1] = "10";
                valores[2] = "10";
                valores[3] = "10";
                valores[4] = "11";
                valores[5] = "2";
                valores[6] = "9";
                valores[7]= "9";
                valores[8] = "0";
                valores[9] = "1";
                valores[10] = "1";
                valores[11] = "12";
                break;
            
            default:
                System.out.println("Erro no getValores");
                break;
         }    
        
        return valores;
    }
    
     public int getBits() {
            return bits;
      }

      public void setBits(int bits) {
            this.bits = bits;
      }
    
    public String[] getValores(){
        valores = new String[19];
        
        valores[0] = getCaracteristicas("NOME");//
        valores[1] = getCaracteristicas("IDADE");//
        valores[2] = getCaracteristicas("ANCESTRALIDADE");//
        valores[3] = getCaracteristicas("FORCA");
        valores[4] = getCaracteristicas("AGILIDADE");
        valores[5] = getCaracteristicas("INTELECTO");
        valores[6] = getCaracteristicas("VONTADE");
        valores[7] = getCaracteristicas("SAUDE");
        valores[8] = getCaracteristicas("NIVEL");//
        valores[9] = getCaracteristicas("INSANIDADE");
        valores[10] = getCaracteristicas("CORRUPCAO");
        valores[11] = getCaracteristicas("TAMANHO");
        valores[12] = getCaracteristicas("DESLOCAMENTO");
        valores[13] = getCaracteristicas("PODER");//
        valores[14] = getCaracteristicas("DANO");//
        valores[15] = getCaracteristicas("TAXACURA");
        valores[16] = getCaracteristicas("PERCEPCAO");
        valores[17] = getCaracteristicas("DEFESA");
        valores[18] = Integer.toString(getBits());
        
        return valores;
    }
    
    public void addInventario(String nomeItem, String tipoItem){
        Itens item = null;
        ListaItens lista;
        
        switch(tipoItem){
            case "ARMADURA":
                lista = new ListaArmaduras().getListaArmaduras();
               item = lista.getItem(nomeItem);
                break;
            case "ARMA BASICA":
                    lista = new ListaArmasBasicas().getListaArmasBasicas();
                    item = lista.getItem(nomeItem);
                break;
            case "ARMA DISTANCIA":
                    lista = new ListaArmasDistancia().getListaArmasDistancia();
                    item = lista.getItem(nomeItem);
                break;
            case "ARMA MILITAR":
                     lista = new ListaArmasMilitares().getListaArmasMilitares();
                   item = lista.getItem(nomeItem);
                break;
            case "ARMA PESADA":
                     lista = new ListaArmasPesadas().getListaArmasPesadas();
                    item = lista.getItem(nomeItem);
                break;
            case "ARMA RAPIDA":
                    lista = new ListaArmasRapidas().getListaArmasRapidas();
                    item = lista.getItem(nomeItem); 
                break;
            case "ESCUDO":
                     lista = new ListaEscudos().getListaEscudos();
                     item = lista.getItem(nomeItem);
                break;
            
            default:
                System.out.println("Erro no addInventario()");      
        }
       
        if( item != null){
             if(inventario == null)
                 inventario = new ListaItens(item);
             else
                 inventario.addItem(item);
        }
        else
            System.out.println("tava vazio");
    }
    
     public void addConsumiveis(String nomeItem){
        Consumiveis cons;
        ListaConsumiveis lista;
        
       lista = new ListaIniCons().getListaIniConsumiveis();
       cons = lista.getConsumivel(nomeItem);
            
       
        if( cons != null){
             if(consumiveis == null)
                 consumiveis = new ListaConsumiveis(cons);
             else
                 consumiveis.addConsumivel(cons);
        }
        else
            System.out.println("tava vazio");
    }
    
    public ListaItens getInventario(){
             return this.inventario;    
    }
    
      public ListaConsumiveis getConsumiveis() {
            return consumiveis;
      }
    
    public void printInv(){
       inventario.printLista();
    }
}

