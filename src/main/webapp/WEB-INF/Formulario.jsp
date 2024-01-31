<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejemplo HTML con formulario desde Servlet</title>
</head>
<body>
    <h1>Formulario de saludo</h1>
    <p>Por favor, rellene los siguientes datos.</p>

    <form action="/myServlet2" method="post">
        <label for="nombreJSP">Nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido">
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
