import java.util.Scanner;

/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

public class Teste {
    public static void main(String[] args) {

        Produto produto[];
        Item item[];
        Fatura fatura;

        Scanner s = new Scanner(System.in);

        produto= new Produto[4];
        item = new Item[4];
        fatura = new Fatura(4);

        produto[0] = new Produto();
        produto[0].setDescricao("Cooler para processador");
        produto[0].setPreco(40);

        produto[1] = new Produto();
        produto[1].setDescricao("Mouse Gamer sem fio");
        produto[1].setPreco(70);

        produto[2] = new Produto();
        produto[2].setDescricao("Teclado / mouse sem fio");
        produto[2].setPreco(125);

        produto[3] = new Produto();
        produto[3].setDescricao("Monitor LED 24");
        produto[3].setPreco(692);

        item[0] = new Item();
        item[0].setProduto(produto[0]);

        item[1] = new Item();
        item[1].setProduto(produto[1]);

        item[2] = new Item();
        item[2].setProduto(produto[2]);

        item[3] = new Item();
        item[3].setProduto(produto[3]);

        fatura.setItens(item);

        System.out.println("Quantos Cooler para processador? ");
        item[0].setQuantidade(s.nextInt());

        System.out.println("Quantos Mouse Gamer sem fio? ");
        item[1].setQuantidade(s.nextInt());

        System.out.println("Quantos Teclado / mouse sem fio? ");
        item[2].setQuantidade(s.nextInt());

        System.out.println("Quantos Monitor LED 24? ");
        item[3].setQuantidade(s.nextInt());

        System.out.println("Foram comprados: " + item[0].getQuantidade() + 
                " "+ produto[0].getDescricao() + " " + item[0].getValor() + " reais." );
        
        System.out.println("Foram comprados: " + item[1].getQuantidade() + 
                " "+ produto[1].getDescricao() + " " + item[1].getValor() + " reais." );
        
        System.out.println("Foram comprados: " + item[2].getQuantidade() + 
                " "+ produto[2].getDescricao() + " " + item[2].getValor() + " reais." );
        
        System.out.println("Foram comprados: " + item[3].getQuantidade() + 
                " "+ produto[3].getDescricao() + " " + item[3].getValor() + " reais." );
        
        
        System.out.println("A fatura ficou em: " + fatura.getValorTotal() + " reais." );
    }  
    
}
