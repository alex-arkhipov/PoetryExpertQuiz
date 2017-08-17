package com.alexarkhipov.works.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alexarkhipov.works.dao.PlayersDao;
import com.alexarkhipov.works.model.Players;

@Component
public class PlayersDaoImpl implements PlayersDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Players> getPlayers() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Players.class);
		return criteria.list();
	}

}
