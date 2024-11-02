package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.entity.Todo;
import com.todo.repo.TodoRepo;

@Service
public class TodoService {
	@Autowired
	TodoRepo todoRepo;
	public void saveTodo(Todo todo) {
		
		todoRepo.save(todo);
		
		
	}
	public List<Todo> getAllTodos() {
		return todoRepo.findAll();
		
	}

}
