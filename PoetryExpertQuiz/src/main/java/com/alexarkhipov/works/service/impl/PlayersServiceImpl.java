package com.alexarkhipov.works.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexarkhipov.works.dao.PlayersDao;
import com.alexarkhipov.works.model.Players;
import com.alexarkhipov.works.service.PlayersService;

@Service
public class PlayersServiceImpl implements PlayersService {

	@Autowired
	private PlayersDao playersDao;

	@Override
	public List<Players> getPlayers() {
		return playersDao.getPlayers();
	}

}
