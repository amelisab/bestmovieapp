package com.tct.bestMovieApp.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

public class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
	protected EntityManager entityManager;
	
	private Class<T> type;
	
	GenericDaoImpl(){
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	
	@Override
	@Transactional
	public void create(T domain) {
	     entityManager.persist(domain);
	}

	@Override
	@Transactional
	public T update(T data) {
		return entityManager.merge(data);
	}

	@Override
	public T find(Object id) {
		return entityManager.find(type, id);
	}

	@Override
	@Transactional
	public void delete(Object id) {
		entityManager.remove(find(id));	
	}

	@Override
	public List<T> listAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery cq = cb.createQuery(type);
		Root<T> root = cq.from(type);
		
		cq.select(root);	
		
		return entityManager.createQuery(cq).getResultList();	 
	}

}
