//Nome : Rosane Silva Freitas Araujo
//Matricula : 20193007058

package jogoForca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class Arquivo {
    
    private BufferedReader bufferLeitor;
    private FileReader leitor;
    
    private ArrayList<Character> leituraVetor;
    
    private char[] vetorLetras = new char[14];
    
    public Arquivo() {
         try{
            
            leitor = new FileReader("palavras7letras");
            bufferLeitor = new BufferedReader(leitor);
            
        }
        catch (Exception e ){
            System.out.println("Erro ao abrir o arquivo.");
            
        }
    }

    public char[] LerArquivo(int pular){
        String leitura;
        
        try{
            bufferLeitor.skip(pular);
            leitura = bufferLeitor.readLine();
 
            
            vetorLetras =leitura.toCharArray();
            
       
            
             
        }
        catch (Exception e ){
            System.out.println("Erro ao ler o arquivo.");
            
        }
        return vetorLetras;
    }
    
    
    public void encerrarLeitura(){
        try{
            
            bufferLeitor.close();
            leitor.close();
        
        }
        catch (Exception e ){
            System.out.println("Erro ao encerrar o arquivo.");
            
        }
        
    }
}
