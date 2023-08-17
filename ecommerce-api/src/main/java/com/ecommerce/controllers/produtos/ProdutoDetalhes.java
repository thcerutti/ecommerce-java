package com.ecommerce.controllers.produtos;

import java.io.IOException;

import com.ecommerce.controllers.BaseHttpController;
import com.ecommerce.database.RepositorioDeProdutos;
import com.ecommerce.modelos.Produto;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProdutoDetalhes extends BaseHttpController {

	private static final long serialVersionUID = -3822258864806551199L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);

		Produto produto = new RepositorioDeProdutos().ListarTodos()[0];
		String detalheProduto = new Gson().toJson(produto);
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(detalheProduto);
	}
}
