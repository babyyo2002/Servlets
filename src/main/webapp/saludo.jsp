<!-- webapp/saludo.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saludo desde Servlet</title>
</head>
<body>
    <h1>Hola, <%= request.getParameter("nombre") %>
              <%= request.getParameter("apellido") %>!</h1>
    <h1>El acceso es correcto

     <!-- Agregar mensajes de depuración -->
        <p>Valor de "nombre" (directo): <%= request.getParameter("nombre") %></p>
        <p>Valor de "apellido" (directo): <%= request.getParameter("apellido") %></p>
</body>
</html>
