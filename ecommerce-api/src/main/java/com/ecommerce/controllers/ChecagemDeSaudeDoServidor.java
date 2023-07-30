package com.ecommerce.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChecagemDeSaudeDoServidor extends BaseHttpController {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/json");
    response.setStatus(HttpServletResponse.SC_OK);

    HashMap<String, String> statusDoServidor = new HashMap<String, String>();
    statusDoServidor.put("status_servidor", "ok");
    statusDoServidor.put("nome", "davi");
    statusDoServidor.put("data_hora_servidor", new Date().toString());
    response.getWriter().println(new Gson().toJson(statusDoServidor));
  }
}
