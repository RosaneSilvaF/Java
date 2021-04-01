/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

public class Fatura {
    private Item itens[];
    private float valorTotal;
    
    public Fatura(){
        itens = null;
        valorTotal=0;
    }
    
    public Fatura(int tamanho){
        this.itens = new Item[tamanho];
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public float getValorTotal() {
        calculaValor();
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void calculaValor(){
        int soma=0;
        for (int i=0 ; i< itens.length; i++) {
            soma += itens[i].getValor(); 
        }
        valorTotal=soma;
    }
   
   
}