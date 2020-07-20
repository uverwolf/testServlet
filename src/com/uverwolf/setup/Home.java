package com.uverwolf.setup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usuario = request.getParameter("nombre");
		String lang = request.getParameter("lang");
		String lugar = request.getParameter("lugar");
		response.setContentType("text/html");
		PrintWriter resultado= response.getWriter();
		if(usuario == null || usuario=="") {
			usuario="Desconocido";
		}
		if(lang == null || lang=="") {
			lang="Desconocido";
		}
		if(lugar== null || lugar=="") {
			lugar = "Desconocido";
		}
		resultado.write("<h1>Hola,"+usuario+ "</h1> <h2>Tu lenguaje favorito es:"+lang+"</h2><h3>Vives en:"+lugar+"</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
