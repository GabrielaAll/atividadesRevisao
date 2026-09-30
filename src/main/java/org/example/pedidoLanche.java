package org.example;

import java.util.Scanner;

public class pedidoLanche {
    public static void main(String[] args) {
        //Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
         //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome do seu lanche: ");
        String nomelanche = sc.nextLine();

        System.out.print("Digite o Valor do seu lanche: ");
        double valorlanche = sc.nextDouble();

        if (valorlanche > 30.00) {
            valorlanche -= 5.00; // Aplica o desconto de R$ 5,00
        }

        System.out.printf("O lanche %s custa R$ %.2f\n", nomelanche, valorlanche);

        sc.close();
    }
}
