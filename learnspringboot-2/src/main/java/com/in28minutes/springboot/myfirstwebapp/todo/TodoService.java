package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;


@Service
public class TodoService 
{
	private static List<Todo> todos=
			new ArrayList();
	private static int todosCount=0;
	
	//we dont want to access from outsde directly thats why made as static.
	static {
		todos.add(new Todo(++todosCount,"in28minutes","Learn Aws",
				LocalDate.now().plusYears(1),false));
		
		todos.add(new Todo(++todosCount,"in28minutes","Learn Azure",
				LocalDate.now().plusYears(2),false));
		
		
		todos.add(new Todo(++todosCount,"in28minutes","Learn Devops",
				LocalDate.now().plusYears(3),false));
		
		
	}
	
	public List<Todo> findByUsername(String username)
	{
		return todos;
	}
	public void addTodo(String username,String description,LocalDate targetDate,boolean done)
	
	{
		Todo todo=new Todo(++todosCount,username,description,targetDate,done);
		todos.add(todo);
		
	}
	
}
