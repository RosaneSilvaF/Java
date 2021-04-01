//Nome : Rosane Silva Freitas Araujo
//Matricula : 20193007058
package agendaPrincipal;
        
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        String continuar="s",listarContatos;
        int opcao;
        
        Contato contatoAux;
        
        Arquivo agendaPessoal = new Arquivo();
        
        Scanner scanner = new Scanner(System.in);
       
        ArrayList<Contato> contatos = new ArrayList<>();

        
        while(continuar.equals("s")){
            
            System.out.println("O que deseja fazer?");
            System.out.println("Digite 1 para adicionar contato.\n"
                + "Digite 2 para alterar algum contato.\n"
                + "Digite 3 para pesquisar um contato.");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    contatoAux=new Contato();
                    contatoAux.AdicionaContato();
                    contatos.add(contatoAux);
                    
                    
                break;
                
                case 2:
                    
                    System.out.println("Qual o nome do contato a ser alterado?");
                    String nomeAux ;
                    nomeAux = scanner.nextLine();
                    
                    boolean contatoLocalizado=false;
                    //System.out.println(contatos.size());
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println(contatos.size());
                        if(contatos.get(i).getNome().equals(nomeAux)){
                            contatoAux = new Contato();
                            contatoAux.AdicionaContato();
                            contatos.remove(i);
                            contatos.add(contatoAux);
                            contatoLocalizado=true;
                        }
                    }
                    if (!contatoLocalizado){
                        System.out.println("Contato Inexistente.");
                    }    
                    
                break;
                
                case 3:
                    
                    System.out.println("Digite 1 para pesquisar por nome e 2 para pesquisar"
                            + "por número.");
                    int pesquisa = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (pesquisa==1){
                        System.out.println("Digite o nome da pessoa:");
                        nomeAux = scanner.nextLine();
                        for (int i = 0; i < contatos.size(); i++) {
                            if(nomeAux.equals(contatos.get(i).getNome())){
                                System.out.println("Nome: " + contatos.get(i).getNome());
                                System.out.println("Numero: " + contatos.get(i).getNumero());
                                System.out.println("Endereço: " + contatos.get(i).getEndereco());
                                System.out.println("E-mail: " + contatos.get(i).getEmail());
                            }
                        }
                    }
                    if (pesquisa==2){
                        System.out.println("Digite o numero da pessoa:");
                        int numero = scanner.nextInt();
                        for (int i = 0; i < contatos.size(); i++) {
                            if(numero == contatos.get(i).getNumero()){
                                System.out.println("Nome: " + contatos.get(i).getNome());
                                System.out.println("Numero: " + contatos.get(i).getNumero());
                                System.out.println("Endereço: " + contatos.get(i).getEndereco());
                                System.out.println("E-mail: " + contatos.get(i).getEmail());
                            }
                        }
                    }
                    
                break;
               
            }
            System.out.println("Deseja continuar utilizando a agenda? (s/n)");
            continuar = scanner.nextLine();    
            
        }
        for (int i = 0; i < contatos.size(); i++) {
            agendaPessoal.EscreverArquivo(contatos.get(i));
        }
        agendaPessoal.encerrarEscrita();
        
        System.out.println("Deseja Listar contatos?(s/n)");
        listarContatos = scanner.nextLine();
        if(listarContatos.equals("s")){
            agendaPessoal.LerArquivo();
        }
        agendaPessoal.encerrarLeitura();
       
    }
    
    
}
