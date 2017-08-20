package com.alexarkhipov.poetryexpertquiz.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alexarkhipov.poetryexpertquiz.dao.AuthorsDao;
import com.alexarkhipov.poetryexpertquiz.model.Authors;

@Component
public class AuthorsDaoImpl implements AuthorsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Authors> getAuthors() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Authors.class);
		return criteria.list();
	}

}
