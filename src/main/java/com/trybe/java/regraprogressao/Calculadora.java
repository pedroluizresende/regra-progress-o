package com.trybe.java.regraprogressao;

public class Calculadora {

  /**
   * Método calculaMedia.
   */
  public static double calculaMedia(AtividadesInfo[] atividades) {
    int dividendo = 0;
    int divisor = 0;

    for (int i = 0; i < atividades.length; i++) {
      dividendo += (atividades[i].getPeso() * atividades[i].getNota());
      divisor += atividades[i].getPeso();
    }

    return dividendo / divisor;
  }
}
