/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoMatematico_RosaneSilva_DiegoSimoes;

import java.util.Random;

public class JogoMatematico {
    private Random gerador;
    private String[] conta;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultadoInt;

    public JogoMatematico() {
        gerador = new Random();
        conta = new String[3];
    }
    
    public String defineOperacao(){
        String contaString = "";
        valor1 = gerador.nextInt(100);//numeros de 0 a 100
        valor2 = gerador.nextInt(99)+1;//numeros de 0 a 100
        
        operacao = gerador.nextInt(4);
        
        switch (operacao){
            case 0:
                conta[1] = "+";
            break;
            
            case 1:
                conta[1] = "-";
                while(valor1<valor2){
                    valor1 = gerador.nextInt(100);//numeros de 0 a 100
                    valor2 = gerador.nextInt(100);//numeros de 0 a 100
                }
                break;
                
            case 2:
                conta[1] = "*";
                break;
                
            case 3:
                conta[1] = "/";
                while(valor1%valor2!=0){
                    valor1 = gerador.nextInt(100);//numeros de 0 a 100
                    valor2 = gerador.nextInt(99)+1;//numeros de 1 a 100
                }
                break;
        }
        
        conta[0]=Integer.toString(valor1);
        conta[2]=Integer.toString(valor2);
        
        for (int i = 0; i < 3; i++) {
            contaString+=conta[i];
        }
        
        return contaString;
    }

    public boolean confereResposta(int respostaUser){
        switch (operacao){
            case 0:
                resultadoInt = valor1 + valor2;
            break;
            
            case 1:
                resultadoInt = valor1 - valor2;
                break;
                
            case 2:
                resultadoInt = valor1 * valor2;
                break;
                
            case 3:
                resultadoInt = valor1 / valor2;
                
                break;
        }
        
        return respostaUser==resultadoInt;
    }   
    
}
