package com.alexarkhipov.poetryexpertquiz.dao;

import java.util.List;

import com.alexarkhipov.poetryexpertquiz.model.Players;

public interface PlayersDao {
	List<Players> getPlayers();

	void savePlayer(Players p);

	Players getPlayer(String Nickname);
}
