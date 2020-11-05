package com.in28minutes.todo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	
	private TodoService toDoService = new TodoService();
	
	protected void	doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	
	protected void	doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String category = request.getParameter("category");

		toDoService.addTodo(new Todo(name,category));
		response.sendRedirect("/add-todo.do");
	}
	
}