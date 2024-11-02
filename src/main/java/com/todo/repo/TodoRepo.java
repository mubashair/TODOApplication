package com.todo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.todo.entity.Todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class TodoRepo {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void save(Todo todo) {
		entityManager.persist(todo);
		
	}
	public List<Todo> findAll() {
		TypedQuery<Todo> typedQuery= entityManager.createQuery("from Todo", Todo.class);
		return typedQuery.getResultList();
		
	}

}
