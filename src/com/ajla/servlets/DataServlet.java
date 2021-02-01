package com.ajla.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String datumRodjenja = request.getParameter("datumRodjenja");
		String email = request.getParameter("email");
		String adresa = request.getParameter("adresa");

		request.setAttribute("ime", ime);
		request.setAttribute("prezime", prezime);
		request.setAttribute("datumRodjenja", datumRodjenja);
		request.setAttribute("email", email);
		request.setAttribute("adresa", adresa);

		request.getRequestDispatcher("/forma.jsp").forward(request, response);
	}

}
