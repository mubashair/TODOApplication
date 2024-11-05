package com.todo.service;

import java.util.List;
import java.util.Optional;

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
	public void updateTodo(Long id, Todo newTodo) {
		Optional<Todo> todoOldBox = todoRepo.findTodoById(id);
		
		if(todoOldBox.isPresent()) {
			Todo oldTodo=todoOldBox.get();
			oldTodo.setTaskContent(newTodo.getTaskContent());
			oldTodo.setCompletionStatus(newTodo.isCompletionStatus());
			todoRepo.updateTodo(oldTodo);
		}
		
	}
	public void deleteTodo(Long id) {
		todoRepo.deleteTodoById(id);
		
	}

} 
