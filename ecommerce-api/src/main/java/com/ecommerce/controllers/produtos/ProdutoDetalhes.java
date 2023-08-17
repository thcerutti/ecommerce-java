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
		
		RepositorioDeProdutos repositorioDeProdutos = new RepositorioDeProdutos();
		int parametroId = Integer.parseInt(request.getParameter("id"));
		
		System.out.printf("ID: %s", parametroId);
		
		Produto produto = repositorioDeProdutos.ObterPorId(parametroId);
		String detalheProduto = new Gson().toJson(produto);
		
		
		response.setContentType("application/json");
		int status = produto.getId() == 0 ? HttpServletResponse.SC_NOT_FOUND : HttpServletResponse.SC_OK; 
		response.setStatus(status);
		response.getWriter().println(detalheProduto);
	}
}
