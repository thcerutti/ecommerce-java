package com.ecommerce.database;

import java.util.HashMap;

import com.ecommerce.modelos.Produto;

public class RepositorioDeProdutos {
  private HashMap<Integer, Produto> todosOsProdutos = new HashMap<Integer, Produto>() {
    {
      put(1, new Produto(1, "Produto 1", "Descrição do produto 1", 10.0));
      put(2, new Produto(2, "Produto 2", "Descrição do produto 2", 20.0));
      put(3, new Produto(3, "Produto 3", "Descrição do produto 3", 30.0));
      put(4, new Produto(4, "Produto 4", "Descrição do produto 4", 40.0));
      put(5, new Produto(5, "Produto 5", "Descrição do produto 5", 50.0));
    }
  };

  public Produto[] ListarTodos() {
    return todosOsProdutos.values().toArray(new Produto[0]);
  }

  public Produto ObterPorId(int id) {
    return todosOsProdutos.get(id);
  }
}
