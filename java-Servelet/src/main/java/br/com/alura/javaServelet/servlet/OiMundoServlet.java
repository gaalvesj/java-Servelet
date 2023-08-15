package br.com.alura.javaServelet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException{
		
		PrintWriter out = arg1.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo com class, /oi");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundo esta no ar");
	}

}
