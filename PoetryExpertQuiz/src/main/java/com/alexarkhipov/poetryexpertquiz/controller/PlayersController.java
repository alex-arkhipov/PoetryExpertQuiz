package com.alexarkhipov.poetryexpertquiz.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alexarkhipov.poetryexpertquiz.model.Players;
import com.alexarkhipov.poetryexpertquiz.service.PlayersService;
import com.alexarkhipov.poetryexpertquiz.utils.NeoCrypt;

@Controller
@RequestMapping(value = "/player")
public class PlayersController {

	public static final String NEW_PLAYER = "newplayer";

	@Autowired
	private PlayersService playersService;

	@Autowired
	private NeoCrypt neoCrypt;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Players>> players() {

		List<Players> a = playersService.getPlayers();
		return new ResponseEntity<>(a, HttpStatus.OK);
	}

	// @RequestMapping(value = "/" + NEW_PLAYER, method = RequestMethod.GET)
	// public String newplayer() {
	// return NEW_PLAYER;
	// }

	@RequestMapping(value = "/" + NEW_PLAYER, method = RequestMethod.GET)
	public ModelAndView newPlayer(final Players player) {

		return new ModelAndView(NEW_PLAYER, "player", player);
	}

	@RequestMapping(value = "/" + NEW_PLAYER, method = RequestMethod.POST)
	public String newplayerProcess(@ModelAttribute Players player, @RequestParam("password") String pass) {
		player.setHash(neoCrypt.generatePasswordHash(pass));
		playersService.savePlayer(player);
		return "redirect:/player/" + player.getNickname();
	}

	@RequestMapping(value = "/{playernickname}", method = RequestMethod.GET)
	public String showPlayerProfile(@PathVariable String playernickname, Model model) {
		// TODO: get player infoSpitter spitter =
		// spitterRepository.findByUsername(username);
		// Players pl = mock(Players.class);
		// when(pl.getName()).thenReturn("Alex Arkhipov");
		Players pl = playersService.getPlayer(playernickname);
		model.addAttribute("p", pl);
		return "profile";
	}
}
