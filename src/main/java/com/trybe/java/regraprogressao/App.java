package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    System.out.println("Digite a quantidade de atividades para cadastrar:");

    Scanner scanner = new Scanner(System.in);
    int numAtividades = Integer.parseInt(scanner.nextLine());
    AtividadesInfo[] notas = new AtividadesInfo[numAtividades];
    int count = 0;
    int atividadeAtual = 1;

    do {
      System.out.println("Digite o nome da atividade " + atividadeAtual + ":");
      String nome = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + atividadeAtual + ":");
      final double peso = scanner.nextDouble();
      scanner.nextLine();
      System.out.println("Digite a nota obtida para " + nome + ":");
      double nota = scanner.nextDouble();
      scanner.nextLine();
      System.out.println();
      AtividadesInfo atividade = new AtividadesInfo(nome, peso, nota);
      notas[count] = atividade;
      count++;
      atividadeAtual++;
    } while (count < numAtividades);

    scanner.close();

    double resultado = Calculadora.calculaMedia(notas);

    if (resultado >= 85) {
      System.out.println("Parabéns! Você alcançou" + resultado
          + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período," + resultado
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}