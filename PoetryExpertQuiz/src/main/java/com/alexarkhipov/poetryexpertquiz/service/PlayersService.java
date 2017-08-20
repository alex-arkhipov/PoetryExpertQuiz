package com.alexarkhipov.poetryexpertquiz.service;

import java.util.List;

import com.alexarkhipov.poetryexpertquiz.model.Players;

public interface PlayersService {
	List<Players> getPlayers();

	public void savePlayer(Players p);

	public Players getPlayer(String nickname);
}
