/*
/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

public class Produto {
    private String descricao;
    private float preco;
    
    public Produto(){
        descricao = null;
        preco = 0;
    }
    
    public Produto(String descricao , float preco){
        this.descricao=descricao;
        this.preco=preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
