package com.ecommerce.utils;

import jakarta.servlet.http.HttpServletResponse;

public class AccessControllHeaders {
  public static void addAccessControllHeaders(HttpServletResponse response) {
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Headers", "*");
    response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
  }
}
