package org.example;

import java.util.Scanner;

public class desafioAluna {
    public static void main(String[] args) {

        /*2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble(). O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().

        3. Use while para manter o programa rodando até a pessoa escolher sair.

        4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.

        5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova. (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada na próxima iteração do loop.)

        6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.

        7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false. O programa decide sozinho — não pergunte isso para a pessoa.

        8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).

        Exemplo de execução:
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        1
        Nota 1:
        8.0
        Nota 2:
        7.0
        Nome da Aluna:
        Maria Silva
        O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0,
        e sua média final foi 7.5. Aluna aprovada: true
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        5
        Opção inválida.
        Deseja iniciar? Pressione 1 continuar, 2 para sair
        2
        Encerrando o sistema. Até logo!

        Bônus:
        Se terminar e quiser ir além
        Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
        Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
        Não deixe cadastrar nota menor que 0 ou maior que 10

        ⚠️ Dica: Você vai precisar de um scanner.nextLine() sozinho. Lembram do bug do scanner.nextLine?  Ler número e depois texto tem uma armadilha: sobra um Enter no caminho e o programa pula a pergunta do nome. É ai que entra o sc.nextLine() sozinho pra limpar antes de ler o nome. Descubra onde ele vai.
         */

        Scanner sc = new Scanner(System.in);
        int opcao;
        int totalCads = 0;

        do {
            System.out.println("\nDeseja iniciar? Pressione 1 para continuar, 2 para sair, 3 para ver total cadastradas");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();


                    do {
                        System.out.println("Nota 1 (entre 0 e 10):");
                        aluna.nota1 = sc.nextDouble();
                        if (aluna.nota1 < 0 || aluna.nota1 > 10) {
                            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        }
                    }

                    while (aluna.nota1 < 0 || aluna.nota1 > 10);


                    do {
                        System.out.println("Nota 2 (entre 0 e 10):");
                        aluna.nota2 = sc.nextDouble();
                        if (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        }
                    }

                    while (aluna.nota2 < 0 || aluna.nota2 > 10);

                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    // Cálculo da média dentro do programa
                    aluna.media = (aluna.nota1 + aluna.nota2) / 2.0;

                    // Regra de aprovação automática (média >= 6)
                    if (aluna.media >= 6.0) {
                        aluna.passou = true;
                    }

                    else {
                        aluna.passou = false;
                    }

                    totalCads++;

                    String statusAprovacao = aluna.passou ? "Aprovada" : "Reprovada";

                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Status: %s\n",
                            aluna.nome, aluna.nota1, aluna.nota2, aluna.media, statusAprovacao);
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                case 3: // Opção extra do bônus para ver quantas foram cadastradas
                    System.out.println("Total de alunas cadastradas nesta sessão: " + totalCads);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 2);

    }

}
