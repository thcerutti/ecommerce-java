package com.ecommerce.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import com.ecommerce.utils.AccessControllHeaders;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChecagemDeSaudeDoServidor extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/json");
    response.setStatus(HttpServletResponse.SC_OK);

    HashMap<String, String> statusDoServidor = new HashMap<String, String>();
    statusDoServidor.put("status_servidor", "ok");
    statusDoServidor.put("nome", "davi");
    statusDoServidor.put("data_hora_servidor", new Date().toString());
    AccessControllHeaders.addAccessControllHeaders(response);
    response.getWriter().println(new Gson().toJson(statusDoServidor));
  }
}
