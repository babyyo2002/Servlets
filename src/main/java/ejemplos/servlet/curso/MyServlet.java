package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Redirige a la página JSP
		request.getRequestDispatcher("formulario.jsp").forward(request, response);


		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();

		// Pagina principal
		//out.println("<html>");
		//out.println("<head><title>Ejemplo HTML con formulario desde Servlet</title></head>");
		//out.println("<body>");
		//out.println("<h1>Formulario de saludo </h1>");
		//out.println("<p>Por favor, rellene los siguientes datos.</p>");

		//Formulario
		//out.println("<form action=\"/myServlet2\" method=\"post\">");
		//out.println("  <label for=\"nombre\">Nombre:</label>");
		//out.println("  <input type=\"text\" id=\"nombre\" name=\"nombre\">");
		//out.println("  <label for=\"apellido\">Apellido:</label>");
		//out.println("  <input type=\"text\" id=\"apellido\" name=\"apellido\">");
		//out.println("  <br>");
		//out.println("  <input type=\"submit\" value=\"Enviar\">");
		//out.println("</form>");

		//out.println("<p><a href=\"/myServlet2\">Enviar</a></p>");
		//out.println("</body></html>");
	}

}
