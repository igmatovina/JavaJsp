package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn web app development","Study"));
		todos.add(new Todo("Learn spring MVC","Study"));
		todos.add(new Todo("Learn Spring rest Services","Study"));
	}
	
	public List<Todo> retriveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
