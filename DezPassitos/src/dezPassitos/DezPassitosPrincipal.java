/*
Nomes : 
Rosane Silva Freitas Araujo
Diego Simões Maria
*/

package dezPassitos;

import java.util.Random;

public class DezPassitosPrincipal {
    private String[] campoMinado; // 10 casas serão campo minado 
    private int valorAux;
    private String fraseAux;
    
    public DezPassitosPrincipal() {
        campoMinado = new String[10];
        
    }
    
    
    public void geraCampoMinado(){
        
        Random gerador = new Random();
        
        for (int i = 0; i < 10; i++) {
            valorAux = gerador.nextInt(69);
            fraseAux = Integer.toString(valorAux+1);
            System.out.println(fraseAux);
            campoMinado[i] = fraseAux;
        }
        
    }
    
    public boolean confereBotao(String botao){
        
        for (int i = 0; i < 10; i++) {
            if(campoMinado[i].equals(botao)){
                return true;
            }
        }
        return false;
    }
}
