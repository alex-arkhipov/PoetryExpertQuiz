package com.alexarkhipov.works.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alexarkhipov.works.dao.AuthorsDao;
import com.alexarkhipov.works.model.Authors;

@Component
public class AuthorsDaoImpl implements AuthorsDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Authors> getAuthors() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Authors.class);
		criteria.add(Restrictions.isNull("byear"));
		return criteria.list();
	}

}
