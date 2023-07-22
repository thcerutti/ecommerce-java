package com.ecommerce.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HealthCheck extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("application/json");
    response.setStatus(HttpServletResponse.SC_OK);

    HashMap<String, String> status = new HashMap<String, String>();
    status.put("server_status", "ok");
    status.put("server_time", String.valueOf(new Date().toString()));

    response.getWriter().println(new Gson().toJson(status));
  }
}
