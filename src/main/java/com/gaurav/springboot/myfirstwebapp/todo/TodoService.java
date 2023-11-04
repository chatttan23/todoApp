package com.gaurav.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static int todosCount=0;
	
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(++todosCount, "gaurav", "Learn AWs", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "gaurav", "Learn DEvOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "gaurav", "Learn FullStack", LocalDate.now().plusYears(3), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
	}
}
