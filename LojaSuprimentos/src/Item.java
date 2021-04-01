/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

public class Item {
    private Produto produto;
    private int quantidade;
    private float valor;

    public Item (){
        produto = null;
        quantidade = 0;
        valor = 0;
    }
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade=quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        calculaValor();
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void calculaValor(){
        valor=produto.getPreco()*quantidade;
    }
}
