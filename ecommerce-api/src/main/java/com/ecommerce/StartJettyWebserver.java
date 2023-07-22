package com.ecommerce;

import java.io.Console;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import com.ecommerce.controllers.HealthCheck;
import com.ecommerce.controllers.produtos.ListarTodos;

public class StartJettyWebserver {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8082);
        System.out.println("Servidor iniciado em http://localhost:8082");

        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(HealthCheck.class, "/");
        handler.addServletWithMapping(ExampleServlet.class, "/teste");
        handler.addServletWithMapping(ExampleServlet2.class, "/teste2");
        handler.addServletWithMapping(ListarTodos.class, "/produtos/listar-todos");

        server.start();
        server.join();
    }
}
