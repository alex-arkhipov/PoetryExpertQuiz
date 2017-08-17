package com.alexarkhipov.works.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alexarkhipov.works.model.Players;
import com.alexarkhipov.works.service.PlayersService;

@Controller
public class PlayersController {

	@Autowired
	private PlayersService playersService;

	@RequestMapping(value = "/playerslist", method = RequestMethod.GET)
	public ResponseEntity<List<Players>> players() {

		List<Players> a = playersService.getPlayers();
		return new ResponseEntity<>(a, HttpStatus.OK);
	}

}
