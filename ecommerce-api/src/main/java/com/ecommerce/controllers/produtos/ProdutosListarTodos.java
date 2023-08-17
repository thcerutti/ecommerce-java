package com.ecommerce.controllers.produtos;

import java.io.IOException;

import com.ecommerce.controllers.BaseHttpController;
import com.ecommerce.database.RepositorioDeProdutos;
import com.ecommerce.modelos.Produto;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProdutosListarTodos extends BaseHttpController {

	private static final long serialVersionUID = -8698255883407321663L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);

		RepositorioDeProdutos repositorio = new RepositorioDeProdutos();
		
		Produto[] todosOsProdutos = repositorio.ListarTodos();
		String listaEmFormatoJson = new Gson().toJson(todosOsProdutos);

		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(listaEmFormatoJson);
	}
}
