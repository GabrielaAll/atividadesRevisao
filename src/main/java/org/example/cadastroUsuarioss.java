package org.example;

import java.util.Scanner;

public class cadastroUsuarioss {
    public static void main(String[] args) {

        //Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        //Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        //Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        //Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite seu Nome Completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("\nO usuário " + nomeCompleto + " nasceu em " + anoNascimento + ".");

        sc.close();

    }
}
