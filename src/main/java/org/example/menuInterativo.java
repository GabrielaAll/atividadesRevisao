package org.example;

import java.util.Scanner;

public class menuInterativo {
    public static void main(String[] args) {

        //Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair
        //Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise.
        // O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Este é o menu interativo! Selecione a opção de produto que deseja visualizar: ");
            System.out.println("1 - Ver Camisas");
            System.out.println("2 - Ver Calças");
            System.out.println("3 - Ver Sapatos");
            System.out.println("4 - Ver Bolsas");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou a opção: Camisas");
                    break;

                case 2:
                    System.out.println("Você selecionou a opção: Calças");
                    break;

                case 3:
                    System.out.println("Você selecionou a opção: Sapatos");
                    break;

                case 4:
                    System.out.println("Você selecionou a opção: Bolsas");
                    break;

                case 5:
                    System.out.println("Você selecionou a opção: Sair");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }
}
