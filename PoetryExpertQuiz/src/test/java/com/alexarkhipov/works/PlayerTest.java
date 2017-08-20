package com.alexarkhipov.works;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.alexarkhipov.poetryexpertquiz.controller.PlayersController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlayerTest {

	@Test
	public void testNewPlayer() throws Exception {
		PlayersController pController = new PlayersController();
		MockMvc mockMvc = standaloneSetup(pController).build();
		mockMvc.perform(get("/" + PlayersController.NEW_PLAYER)).andExpect(view().name(PlayersController.NEW_PLAYER));
	}

}
