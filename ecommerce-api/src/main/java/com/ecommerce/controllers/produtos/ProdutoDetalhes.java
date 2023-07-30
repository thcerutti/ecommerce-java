package com.ecommerce.controllers.produtos;

import java.io.IOException;

import com.ecommerce.database.RepositorioDeProdutos;
import com.ecommerce.modelos.Produto;
import com.ecommerce.utils.AccessControllHeaders;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProdutoDetalhes extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Produto produto = new RepositorioDeProdutos().ListarTodos()[0];
		String detalheProduto = new Gson().toJson(produto);
		AccessControllHeaders.addAccessControllHeaders(response);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(detalheProduto);
	}
}
