package com.alexarkhipov.poetryexpertquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexarkhipov.poetryexpertquiz.dao.PlayersDao;
import com.alexarkhipov.poetryexpertquiz.model.Players;
import com.alexarkhipov.poetryexpertquiz.service.PlayersService;

@Service
public class PlayersServiceImpl implements PlayersService {

	@Autowired
	private PlayersDao playersDao;

	public List<Players> getPlayers() {
		return playersDao.getPlayers();
	}

	public void savePlayer(Players p) {
		playersDao.savePlayer(p);
	}

	public Players getPlayer(String nickname) {
		return playersDao.getPlayer(nickname);
	}

}
