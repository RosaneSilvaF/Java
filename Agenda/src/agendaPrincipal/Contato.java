//Nome : Rosane Silva Freitas Araujo
//Matricula : 20193007058

package agendaPrincipal;

import java.util.Scanner;

public class Contato {
    private String nome;
    private String endereco;
    private String email;
    private int numero;
    Scanner scanner = new Scanner(System.in);
    
     public Contato() {
        nome = null;
        endereco = null;
        email = null;
        numero =0;
    }
    
    public Contato(String nome, String endereco, String email, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.numero = numero;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void AdicionaContato(){ 
        
        System.out.println("Digite o nome do contato:");
        nome = scanner.nextLine();
        System.out.println("Digite o endereço do contato:");
        endereco = scanner.nextLine();
        System.out.println("Digite o email do contato:");
        email = scanner.nextLine();
        System.out.println("Digite o numero do contato:");
        numero = scanner.nextInt();
        scanner.nextLine();
    }
    
    
    
}
