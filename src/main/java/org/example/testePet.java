package org.example;

public class testePet {
    public static void main(String[] args) {

        //Crie uma classe chamada Pet.
        //Dê a ela três atributos: nome (String), raca (String) e peso (double).
        //Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        //Atribua valores para os atributos de cada um deles.
        //Imprima os dados dos dois pets concatenando textos e variáveis.

        Pet pet1 = new Pet();
        pet1.nome = "Lulu";
        pet1.raca = "Golden Retriever";
        pet1.peso = 30.5;

        // Criando o segundo pet (Gato)
        Pet pet2 = new Pet();
        pet2.nome = "Safira";
        pet2.raca = "Siamês";
        pet2.peso = 4.2;

        // Imprimindo os dados na tela
        System.out.println("Pet 1: " + pet1.nome + " é da raça " + pet1.raca + " e pesa " + pet1.peso + "kg.");
        System.out.println("Pet 2: " + pet2.nome + " é da raça " + pet2.raca + " e pesa " + pet2.peso + "kg.");
    }
}
