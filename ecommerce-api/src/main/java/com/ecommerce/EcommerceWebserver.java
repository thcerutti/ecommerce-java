	package com.ecommerce;
	
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import com.ecommerce.controllers.ChecagemDeSaudeDoServidor;
import com.ecommerce.controllers.produtos.ProdutoDetalhes;
import com.ecommerce.controllers.produtos.ProdutosListarTodos;

public class EcommerceWebserver {
	final static int portaOndeServidorInicia = 8084;

	public static void main(String[] args) throws Exception {
		Server servidorWeb = new Server(portaOndeServidorInicia);
		System.out.printf(">> Servidor iniciado em http://localhost:%s", portaOndeServidorInicia);

		ServletHandler definicoesDoServidor = new ServletHandler();
		servidorWeb.setHandler(definicoesDoServidor);
		definicoesDoServidor.addServletWithMapping(ChecagemDeSaudeDoServidor.class, "/");
		definicoesDoServidor.addServletWithMapping(ProdutosListarTodos.class, "/produtos/listar-todos");
		definicoesDoServidor.addServletWithMapping(ProdutoDetalhes.class, "/produtos/detalhes");


		servidorWeb.start();
		servidorWeb.join();
	}
}
