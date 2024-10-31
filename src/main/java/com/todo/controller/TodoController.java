package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.todo.entity.Todo;
import com.todo.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	TodoService todoService; 
	
	@RequestMapping(value = "/addtodo", method = RequestMethod.POST)
	@ResponseBody
	public String createTodo(@ModelAttribute Todo todo) {
		todoService.saveTodo(todo);
		return "success";
	}
	@RequestMapping
	public String getAllTodos(Model model) {
		List<Todo> listOfTodos=todoService.getAllTodos();
		model.addAttribute("allTodos", listOfTodos);
		return "task";
	}
	public String updateTodo() {
		return "success";
	}
	public String deleteTodo() {
		return "success";
	}
	

}
