package com.ecommerce.controllers.produtos;

import java.io.IOException;

import com.ecommerce.modelos.Produto;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListarTodos extends HttpServlet {

  private static final long serialVersionUID = 1L;

  private Produto[] ListarTodosProdutos() {
    return new Produto[] { new Produto(1, "Produto 1", "Descrição do produto 1", 10.0),
        new Produto(2, "Produto 2", "Descrição do produto 2", 20.0),
        new Produto(3, "Produto 3", "Descrição do produto 3", 30.0),
        new Produto(4, "Produto 4", "Descrição do produto 4", 40.0),
        new Produto(5, "Produto 5", "Descrição do produto 5", 50.0) };
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    Produto[] todosOsProdutos = ListarTodosProdutos();
    String listaEmFormatoJson = new Gson().toJson(todosOsProdutos);

    response.setContentType("application/json");
    response.setStatus(HttpServletResponse.SC_OK);
    response.getWriter().println(listaEmFormatoJson);
  }
}
