package com.java.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "This is a servlet for testing", urlPatterns = { "/servlets/simpleServlet.do" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/indexNew.jsp");
	      dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = req.getParameter("action");
        req.setAttribute("action", action);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/servlets/redirect.do");
        dispatcher.forward(req, response);
	}
}
