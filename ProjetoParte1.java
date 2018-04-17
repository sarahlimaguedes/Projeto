package projetoparte1;

import java.util.Scanner;

public class ProjetoParte1 {

    public static void main(String[] args) {
        // Declarando as váriaveis//
        // Utilizadas em Faixa etária, opção 4 do menu//
        double mediaG = 0;
        double mediaM = 0;
        double contadorM = 0;
        int contadorF = 0;
        int mediaF = 0;
        int mediafinal = 0;

        // Declarando a classe Scanner para receber os resultados//
        Scanner sc = new Scanner(System.in);

        int opcoes;
        do {
            //Imprimindo as opções do Menu//
            System.out.println(" (1) - SOMA ");
            System.out.println(" (2) - SUBITRAÇÃO ");
            System.out.println(" (3) - DIVISÃO ");
            System.out.println(" (4) - FAIXA ETÁRIA ");
            System.out.println(" (5) - NÚMEROS PRIMOS ");
            System.out.println(" (6) - MUDANÇA DE BASE ");
            System.out.println(" (7) - SAIR ");
            opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    // Opção 1 do MENU - Soma//

                    System.out.println(" Soma ");
                    System.out.println(" Digite um número");
                    int num1 = sc.nextInt();
                    System.out.println(" Digite o segundo número");
                    int num2 = sc.nextInt();
                    System.out.println(" Resultado:" + (num1 + num2));
                    // Opção para voltar ao Menu //
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da opção de voltar ao Menu //

                case 2:
                    // Opção do MENU - Subtração//
                    System.out.println(" Subtração ");
                    System.out.println(" Digite um número");
                    int num3 = sc.nextInt();
                    System.out.println(" Digite o segundo número");
                    int num4 = sc.nextInt();
                    System.out.println(" Resultado:" + (num3 - num4));
                    // Opção para voltar ao Menu //
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da opção de voltar ao Menu //
                case 3:
                    // Opção do MENU - Divisão//
                    System.out.println(" Divisão ");
                    System.out.println(" Digite um número");
                    int num5 = sc.nextInt();
                    System.out.println(" Digite o segundo número");
                    int num6 = sc.nextInt();
                    System.out.println(" Resultado:" + (num5 / num6));
                    //Opção para voltar ao Menu//
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da oção de voltar ao MENU //

                case 4:
                    //Opção do MENU - Faixa Etária//
                    System.out.println("Faixa Etaria");
                    // Declaração de variáveis //
                    int mediaT = 0;
                    double mediamsc = 0;
                    double mediafem = 0;
                    //Recebendo número de pessoas //
                    System.out.println(" Informe o número de pessoas");
                    int numeropessoas = sc.nextInt();
                    for (int i = 0; i < numeropessoas; i++) {
                        System.out.println(" Informe sua idade ");
                        int idade = sc.nextInt();
                        System.out.println(" Informe o seu sexo: (1) Masculino (2)Feminino ");
                        int sexo = sc.nextInt();
                        // Média Geral //
                        mediaG = mediaG + idade;

                        if (sexo == 1) {

                            contadorM++;

                            mediaM = mediaM + idade;
                            mediamsc = mediaM / contadorM;

                        } else if (sexo == 2) {

                            contadorF++;

                            mediaF = mediaF + idade;
                            mediafem = mediaF / contadorF;

                        }

                    }
                    // Imprimindo as médias//
                    System.out.println(" Media Geral: " + mediaG / numeropessoas);
                    System.out.println(" Media Masculina: " + mediamsc);
                    System.out.println(" Media Feminina: " + mediafem);

                    // Opção para voltar ao Menu//
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da opção de voltar ao MENU //
                case 5:

                    // declarando as variáveis //
                    int soma = 0;

                    //Imprimindo a variavel num0 //
                    System.out.println("Digite um número: ");
                    int num0 = sc.nextInt();
                    // Contando os números primos //
                    for (int j = 1; j <= num0; j++) {
                        int contador = 0;
                        // testando os números primos //    
                        for (int i = 1; i <= num0; i++) {
                            if (j % i == 0) {
                                contador++;
                            }

                        }

                        if (contador == 2) {
                            soma = soma + j;

                        }
                    }
                    System.out.println(" A soma de todos os números primos é " + soma);

                    //Opção para voltar ao Menu//
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da opção voltar ao Menu //
                case 6:

                    System.out.println(" Digite [1] para informar um número binário e [2] para informar um número decimal: ");
                    int opcao1 = sc.nextInt(); // Recebendo opção //

                    switch (opcao1) {

                        // Conversão de binário para decimal //
                        case 1:

                            System.out.println(" Digite o valor em binário ");
                            String entrada = sc.next();
                            // Declarando as variáveis//
                            int potencia = 0;
                            // Variável para guardar a soma do número decimal //
                            int numdecimal = 0;
                            // int recebendo o ultimo indice da Strring//
                            for (int i = entrada.length() - 1; i >= 0; i--) {
                                numdecimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                                // incremento da potência //
                                potencia++;

                            }
                            // Imprimindo o decimal //
                            System.out.println(" O número informado em decimal é: " + numdecimal);
                            break;

                        // Conversão de decimal para binário //
                        case 2:
                            int decimal,
                             modulo;
                            String binario = "";

                            System.out.println(" Digite um número em decimal ");
                            decimal = sc.nextInt();
                            // Operação para conversão de decimal para binário //
                            while (decimal > 0) {
                                modulo = (decimal % 2);
                                binario = modulo + binario;
                                decimal = decimal / 2;
                            }
                            // Imprimindo o numero binário //
                            System.out.println(" O valor do número informado em binário é " + binario);

                    }
                    // Opção para voltar ao Menu //
                    while (opcoes != 0) {
                        System.out.println(" Digite 0 para voltar ao MENU inicial");
                        opcoes = sc.nextInt();

                        if (opcoes == 0) {
                            opcoes = 0;

                        } else {
                            System.out.println(" Opção inválida.");
                        }
                    }
                    break;
                // Fim da opção de voltar ao Menu //       

            }
            if (opcoes > 7) {
                // enquanto opcao for diferente de 7  pedirá para digitar outra opção //
                while (opcoes > 7) {
                    System.out.println("Digite 7 para sair ou 0 para voltar ao menu : ");
                    opcoes = sc.nextInt();
                    // Se 7 o programa para //
                    if (opcoes == 7) {
                        opcoes = 7;
                    } else // se 0 volta ao menu //
                    if (opcoes == 0) {
                        opcoes = 0;
                    }
                }

            }

        } while (opcoes == 0);

    }
}
