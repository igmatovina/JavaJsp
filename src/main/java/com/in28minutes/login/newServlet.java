package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/newServlet.do")
public class newServlet extends HttpServlet {
	protected void	doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("WEB-INF/views/NewServlet.jsp").forward(request, response);
	}

}
