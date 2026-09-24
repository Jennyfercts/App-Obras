package br.dev.jenny.appobras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sesi2dia
 */
public class AppObras {

    public static void main(String[] args) {
        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoTexto = new Scanner(System.in);
        
        // Entrada de dados
        Obra minhaObra = new Obra();
        
        System.out.printf("-".repeat(20));
        System.out.printf("App Obra\n");
        System.out.printf("-".repeat(20));
        
        System.out.printf("Informe o proprietario: ");
        minhaObra.proprietario = tecladoTexto.nextLine();
        
        System.out.printf("Informe o local: ");
        minhaObra.local = tecladoTexto.nextLine();
        
        System.out.printf("Informe a cidade: ");
        minhaObra.cidade = tecladoTexto.nextLine();
        
        System.out.printf("Informe o UF: ");
        minhaObra.uf = tecladoTexto.nextLine();
        
        List<Comodo> listaComodos = new ArrayList<>();
        
        Comodo comodoAtual;
        
        System.out.println("--- Comodos ---");
        
        do{
            
            System.out.printf("Informe o nome do comodo: ");
            comodoAtual = new Comodo();

            comodoAtual.nome = tecladoTexto.nextLine();

            if(comodoAtual.nome.isBlank()){
               break;
            }

            System.out.printf("Informe a largura do comodo: ");
            comodoAtual.largura = tecladoNumerico.nextDouble();

            System.out.printf("Informe o comprimento do comodo: ");
            comodoAtual.comprimento = tecladoNumerico.nextDouble();
            
            minhaObra.listaComodos.add(comodoAtual);
        
        } while (comodoAtual.nome != "");
        
        
        // saída de dados
        System.out.printf("----------------------- Dados da obra ------------------------\n");
        System.out.printf("+------------------------------------------------------------+\n");
        System.out.printf("| proprietario|       local|           cidade| UF | Area Total|\n");
        System.out.printf(minhaObra.toString());
        System.out.printf("+------------------------------------------------------------+\n");
        
//        for (int i = 0; i < minhaObra.listaComodos.size(); i++){
//           
//            Comodo c = minhaObra.listaComodos.get(i);
//            
//            System.out.println(c.toString());
//           
//        }
//        
        System.out.printf("\n\n------------- Dados dos comodos --------------\n");
        System.out.printf("+--------------------------------------------+\n");
        System.out.printf("|       nome | largura | comprimento |  area |\n");
        for (Comodo c : minhaObra.listaComodos) {
            System.out.println(c.toString());
        }
        
        System.out.printf("+--------------------------------------------+\n");
        
    }
}