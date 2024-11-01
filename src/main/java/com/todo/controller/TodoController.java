package com.todo.controller;

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
	@RequestMapping
	public String loadForm() {
		return "task";
	}
	@RequestMapping(value = "/addtodo", method = RequestMethod.POST)
	@ResponseBody
	public String createTodo(@ModelAttribute Todo todo) {
		todoService.saveTodo(todo);
		return "success";
	}
	@RequestMapping
	public String getAllTodo(Model model) {				
		return "success";
	}
	public String updateTodo() {
		return "success";
	}
	public String deleteTodo() {
		return "success";
	}
	

}
