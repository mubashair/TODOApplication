package com.todo.repo;

import org.springframework.stereotype.Repository;

import com.todo.entity.Todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
public class TodoRepo {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void save(Todo todo) {
		entityManager.persist(todo);
		
	}

}
