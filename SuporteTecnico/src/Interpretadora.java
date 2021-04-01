/*
Nome : Rosane Silva Freitas Araujo
Matrícula : 20193007058
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Interpretadora {
    private HashSet<String> palavraChave = new HashSet<>();
    
    

    public Interpretadora() {
        this.palavraChave = new HashSet<>();
    }

    public HashSet<String> getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(HashSet<String> palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    
    
    public ArrayList<String> SeparaPalavras(String problema){
        
        StringTokenizer st = new StringTokenizer(problema);
        ArrayList<String> auxiliar = new ArrayList();
        palavraChave = new HashSet<>();
        
        String aux;
        
        palavraChave.clear();
        int cont=0;
        while (st.hasMoreElements()){
            
            auxiliar.add(cont, st.nextToken());
            cont++;
        }
        palavraChave.addAll(auxiliar);
       
        return auxiliar;
    }
    
}
