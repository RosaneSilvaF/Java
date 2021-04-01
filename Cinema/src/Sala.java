/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

import java.util.HashMap;

public class Sala {
    private int numero;
    private int capacidade;
    private HashMap <String,Ingresso> assentos = new HashMap<>();
    
    
    
    public void Sala(){
        numero = 0;
        capacidade = 0;
    }
    
    public void Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public HashMap<String, Ingresso> getAssentos() {
        return assentos;
    }

    public void setAssentos(HashMap<String, Ingresso> assentos) {
        this.assentos = assentos;
    }
    
    public void adicionaAssento (String nome, Ingresso ingresso){
        assentos.put(nome, ingresso);
    }
    
}
