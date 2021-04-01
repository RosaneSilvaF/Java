/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoForca;

import java.util.Random;

/**
 *
 * @author rosane
 */
public class JogoForca {
    
    Arquivo arquivo = new Arquivo();
    
    char[] palavraAux = new char[14];
    char[] palavra = new char[7];
    int pularChar, vidas=0, numeroVidas=15;
    
    
    
    public char[] escolhePalavra(){
        Random gerador = new Random();
        pularChar = gerador.nextInt(7592); //quantidade de caracteres do arquivo -7
        palavraAux = arquivo.LerArquivo(pularChar);
        
        
        for (int i = 0; i < 14; i++) {
            if (palavraAux[i]== ' ') {
                for (int j = 0; j < 7; j++) {
                    palavra[j] = palavraAux[i+1];
                    i++;       
                }
            }
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.println("");
            System.out.print(palavra[i]);
        }
       
        return palavra;
    }
    
    public boolean contagemVidas(boolean errou){
        
        
        if (errou){
            vidas++;
        }
        if (vidas==14){
            return false;
        }
        return true;
    }
    
    public void reiniciaJogo(){
        palavraAux= null;
        palavra=null;
    }
    
    public String mostraVidas(){
       
        String mostraVidas = "       Você errou " + vidas + " vezes. Se erradas 15 vezes, você perde.";
        return mostraVidas;
    }
    
}
