package org.example;

public class Aluna {

    /*DESAFIO — Sistema de Cadastro de Alunas
        Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.

        Este desafio tem regras de construção obrigatórias. Não é só fazer funcionar, é fazer funcionando do jeito pedido. Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.

        O que o programa faz:
        Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
        Se escolher 1:
        pede a primeira nota
        pede a segunda nota
        calcula a média
        pede o nome da aluna
        decide se ela foi aprovada (média 6 ou mais)
        mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        volta pro menu
        Se escolher 2: mostra uma mensagem de despedida e encerra
        Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu


        Regras obrigatórias:
        1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).*/


    String nome;
    double nota1;
    double nota2;
    double media;
    boolean passou;
}