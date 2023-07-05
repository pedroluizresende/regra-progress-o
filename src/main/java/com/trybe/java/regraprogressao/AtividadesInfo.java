package com.trybe.java.regraprogressao;

public class AtividadesInfo {

  private String nome;
  private double peso;
  private double nota;

  /**
   * Métodos e atributos.
   **/
  public AtividadesInfo(String nome, double peso, double nota) {
    this.nome = nome;
    this.peso = peso;
    this.nota = nota;
  }

  /**
   * Getters and Setters.
   */

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getNota() {
    return this.nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}
