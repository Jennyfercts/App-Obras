package br.dev.jenny.appobras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Faz o cadastro e relatório de obras
 * @author sesi2dia
 */
public class AppObras {

    public static void main(String[] args) {
        Scanner tecladoNumerico = new Scanner(System.in);
        Scanner tecladoTexto = new Scanner(System.in);
        Obra minhaObra = new Obra();

        // Entrada de dados
        
        do{
        System.out.printf("-------Menu-------\n");
        System.out.printf("1 - Fazer cadastro\n2 - Ver relatorio\n3 - Sair\n");
        System.out.printf("Escolha uma opcao: ");
        int resposta = tecladoNumerico.nextInt();

        List<Comodo> listaComodos = new ArrayList<>();
        
        switch (resposta){
        case 1:

            System.out.printf("-".repeat(20));
            System.out.printf("App Obra");
            System.out.printf("-".repeat(20));
            System.out.printf("\n");

            System.out.printf("Informe o proprietario: ");
            minhaObra.proprietario = tecladoTexto.nextLine();

            System.out.printf("Informe o local: ");
            minhaObra.local = tecladoTexto.nextLine();

            System.out.printf("Informe a cidade: ");
            minhaObra.cidade = tecladoTexto.nextLine();

            System.out.printf("Informe o UF: ");
            minhaObra.uf = tecladoTexto.nextLine();

            

            Comodo comodoAtual;

            System.out.println("------- Comodos -------");

            do {

                System.out.printf("Informe o nome do comodo: ");
                comodoAtual = new Comodo();

                comodoAtual.nome = tecladoTexto.nextLine();

                if (comodoAtual.nome.isBlank()) {
                    break;
                }

                System.out.printf("Informe a largura do comodo: ");
                comodoAtual.largura = tecladoNumerico.nextDouble();

                System.out.printf("Informe o comprimento do comodo: ");
                comodoAtual.comprimento = tecladoNumerico.nextDouble();

                minhaObra.listaComodos.add(comodoAtual);

            } while (comodoAtual.nome != "");

            System.out.printf("-------Menu-------\n");
            System.out.printf("1 - Fazer cadastro\n2 - Ver relatorio\n3 - Sair");
            resposta = tecladoNumerico.nextInt();
        
        

        if (resposta == 2 && !listaComodos.isEmpty()) {

        // saída de dados
                System.out.printf("----------------------- Dados da obra -------------------------\n");
        System.out.printf("+-------------------------------------------------------------+\n");
        System.out.printf("| proprietario|       local|           cidade| UF | Area Total|\n");
        System.out.printf(minhaObra.toString());
        System.out.printf("+-------------------------------------------------------------+\n");
        }

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

    

        if (resposta == 2 && listaComodos.isEmpty()) {
            System.out.printf("Não há nenhuma obra cadastrada! Deseja retornar ao menu?\n");
            System.out.printf("1 - Sim\n2 - Não");
            int respostaErro = tecladoNumerico.nextInt();
            
            if(respostaErro == 1){
                
            }
            
        }
        if(resposta == 3){
            
        }
        
        } while (resposta != 3);
        }    
}
}
    
    