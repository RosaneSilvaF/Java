/**
 * Nome : Rosane Silva Freitas Araujo
 * Matrícula : 20193007058
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Cinema {
    public static void main(String[] args) {
        int numeroSala, aux = 0, quantidadeIngressos, cont=0, numeroAssento = 0, totalIngressos=0;
        double valorIngresso;
        String var = "s";
        Sala salaAux;
        Filme filmeAux;
        Ingresso ingresso = new Ingresso();
        HashMap <String,Ingresso> assentos = new HashMap<>();
        
       
        ArrayList <Sala> salas = new ArrayList<>();
        ArrayList <Filme> filmes = new ArrayList<>();
       
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("******CONFIGURACAO INICIAL DA MAQUINA******");
        System.out.println("1. Informe o valor do ingresso para os filmes: ");
        ingresso.setValor(s.nextDouble());
        System.out.println("***************************************************");
        System.out.println("2. Etapa de insercao das salas. ");
        do{
            salaAux = new Sala();
            System.out.println("2.1 Digite o numero da sala: ");
            salaAux.setNumero(s.nextInt());
            System.out.println("2.2 Digite a capacidade da sala: ");
            salaAux.setCapacidade(s.nextInt());
            
            salas.add(aux, salaAux);
            
            System.out.println("-> Deseja adicionar outra sala? (s/n)");
            var = s.next();
            aux++;
        }while (var.equals("s"));
        
        aux = 0;
        
        
        System.out.println("***************************************************");
        
        System.out.println("3. Etapa de insercao de filmes. ");
        cont=0;
        do{
            filmeAux = new Filme();
            System.out.println("3.1 Digite o nome do filme: ");
            filmeAux.setTitulo(s.next());
            System.out.println("3.2 Digite o genero do filme: ");
            filmeAux.setGenero(s.next());
            System.out.println("3.3 Digite o nome do diretor do filme: ");
            filmeAux.setDiretor(s.next());
            System.out.println("3.4 Digite o ano do filme: ");
            filmeAux.setAno(s.nextInt());
            System.out.println("3.5 Digite a sala do filme: ");
            numeroSala = s.nextInt();
            
            while(aux < salas.size()){
                if (salas.get(aux).getNumero() == numeroSala){
                    salaAux = salas.get(aux);
                   
                }
                aux++;
            }
            aux =0;
            filmeAux.setSala(salaAux);
            
            filmes.add(filmeAux);
            
            
            System.out.println("-> Deseja adicionar outro filme? (s/n)");
            var = s.next();
            
        }while (var.equals("s"));
        
        cont = 0;
        
        System.out.println("***************************************************");
        
        System.out.println("Fim da configuração. ");
        
        System.out.println("***************************************************");
        
        System.out.println("->Deseja ver os filmes em exibicao? (s/n)");
        var=s.next();
        if (var.equals("s")){
            System.out.println("Lista de filmes: ");
            aux = 0; 
            while (aux < filmes.size()){
                
                System.out.println("Filme " + (aux+1) + ". " + 
                        filmes.get(aux).getTitulo() + 
                        " | Apresentado na sala " + filmes.get(aux).getSala().getNumero() );
                aux++;
            }
        }
        
        System.out.println("***************************************************");
        
        System.out.println("->Deseja comprar ingressos? (s/n)");
        var=s.next();
        while (var.equals("s")){
            System.out.println("->Qual o numero da sala? ");
            numeroSala = s.nextInt();
            aux=0;
            while(aux < salas.size()){
                
                if (salas.get(aux).getNumero() == numeroSala){
                    System.out.println("->A sala tem " + salas.get(aux).getAssentos().size() + 
                            " assentos tomados, de um total de " + salas.get(aux).getCapacidade() + 
                            " assentos.");
                    System.out.println("->Quantos ingressos voce comprará?");
                    quantidadeIngressos = s.nextInt();
                    
                    if (quantidadeIngressos+salas.get(aux).getAssentos().size() > 
                            salas.get(aux).getCapacidade()){
                        System.out.println("->Quantidade extrapola o numero de assentos disponiveis. Tente novamente");
                        quantidadeIngressos=0;
                    }
                    else{
                        cont = 0;

                        while(cont<quantidadeIngressos){
                            salas.get(aux).adicionaAssento(Integer.toString(cont), ingresso);
                            cont++;
                            numeroAssento++;
                        } 
                        
                    }
                    totalIngressos+=quantidadeIngressos;
                }
                aux++;
            } 
            
            System.out.println("->Deseja comprar mais ingressos? (s/n)");
            var= s.next();

        }
        
        System.out.println("***************************************************");
        System.out.println("->Compra finalizada");
                        double valorTotal=totalIngressos*ingresso.getValor();
                        System.out.println("->Valor total a pagar : " + valorTotal + " reais.");
        System.out.println("***************************************************");
       
    }
}
