/*
Nome : Rosane Silva Freitas Araujo
Matrícula : 20193007058
*/
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        SuporteTecnico suporte = new SuporteTecnico();
        Scanner s = new Scanner(System.in);
        
        String operacao;
        String problema;
        boolean resposta;
        
        System.out.println("Bem-vindo ao sistema de Suporte Técnico\n" +
            "Digite 'continuar' para continuar ou digite 'sair' para sair do sistema.");
        operacao = s.nextLine();
        
        while(operacao.toLowerCase().equals("continuar")){
            System.out.println("Descreva seu problema de maneira sucinta.");
            problema = s.nextLine();
            resposta = suporte.buscaSolucao(problema);
            while(!resposta){
               problema = s.nextLine(); 
               resposta = suporte.buscaSolucao(problema);
            }
            System.out.println("Digite 'continuar' para continuar ou digite 'sair' para sair do sistema.");
            operacao = s.nextLine();
        }
    }
    
}
