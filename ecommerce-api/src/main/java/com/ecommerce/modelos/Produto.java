package com.ecommerce.modelos;

public class Produto {
  private int id;
  private String nome;
  private String descricao;
  private double preco;
  private String tamanho;
  private String urlImagemProduto;

  public Produto(int id, String nome, String descricao, double preco, String tamanho, String urlImagemProduto) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.tamanho = tamanho;
    this.urlImagemProduto = urlImagemProduto;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }
  public String getTamanho() {
	  return tamanho;
  }
  public String getImagemProduto() {
	  return urlImagemProduto;
  }
}
