package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {

		// Obtener el valor del parámetro "nombre y apellido" del formulario
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Pagina principal
		out.println("<html>");
		out.println("<head><title>Saludo desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Hola, " + nombre + " " + apellido +"!</h1>");
		out.println("</body></html>");
	}

}
