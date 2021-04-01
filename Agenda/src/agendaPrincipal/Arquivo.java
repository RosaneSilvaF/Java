//Nome : Rosane Silva Freitas Araujo
//Matricula : 20193007058

package agendaPrincipal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class Arquivo {
    
    private File agendaPessoal;
    private BufferedReader bufferLeitor;
    private BufferedWriter bufferEscritor;
    private FileWriter escritor;
    private FileReader leitor;
    
    public Arquivo() {
         try{
            agendaPessoal = new File("agendaPessoal.txt");
            agendaPessoal.createNewFile();
            leitor = new FileReader(agendaPessoal);
            bufferLeitor = new BufferedReader(leitor);
            escritor = new FileWriter(agendaPessoal);
            bufferEscritor = new BufferedWriter(escritor);
        }
        catch (Exception e ){
            System.out.println("Erro ao abrir o arquivo.");
            
        }
    }

    public void LerArquivo(){
        String leitura;
  
        try{
            leitura = this.bufferLeitor.readLine();
            System.out.println(leitura);
            
            while (leitura!=null) {
                leitura = bufferLeitor.readLine();
                System.out.println(leitura);
            }
            
            
        }
        catch (Exception e ){
            System.out.println("Erro ao ler o arquivo.");
            
        }
    }
    
    public void EscreverArquivo(Contato contato){
  
        try{
            
            bufferEscritor.write("Nome: " + contato.getNome() +
                    "\n   Telefone: " + contato.getNumero() + 
                    "\n   Endereço: " + contato.getEndereco() +
                    "\n   E-mail: " + contato.getEmail());
            bufferEscritor.write("\n*************************************\n");
            
        
        }
        catch (Exception e ){
            System.out.println("Erro ao escrever no arquivo.");
            
        }
    }
    
    public void encerrarEscrita(){
        try{
            
            bufferEscritor.close();
            escritor.close();
        
        }
        catch (Exception e ){
            System.out.println("Erro ao encerrar o arquivo.");
            
        }
        
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
