package org.example;

import java.util.Scanner;

public class testesProduto {
    public static void main(String[] args) {

        //Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        //Na classe principal, faça um laço for que repita 3 vezes.
        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        //Instancie um novo Produto e guarde nele os valores digitados.
        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
        // Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nProduto " + i + ":");
            Produto prod = new Produto();

            System.out.print("Nome: ");
            sc.nextLine();
            prod.nome = sc.nextLine();

            System.out.print("Preço: ");
            prod.preco = sc.nextDouble();

            if (prod.preco > 100) {
                System.out.println("Produto caro!");
            }

            else {
                System.out.println("Produto com preço acessível!");
            }

        }
    }
}