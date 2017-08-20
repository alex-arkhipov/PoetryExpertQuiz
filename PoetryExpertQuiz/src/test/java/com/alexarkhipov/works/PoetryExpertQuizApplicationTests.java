package com.alexarkhipov.works;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alexarkhipov.poetryexpertquiz.controller.AuthorsController;
import com.alexarkhipov.poetryexpertquiz.controller.PlayersController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PoetryExpertQuizApplicationTests {

	@Autowired
	private PlayersController pController;

	@Autowired
	private AuthorsController aController;

	@Test
	public void contextLoads() {
		assertThat(aController).isNotNull();
		assertThat(pController).isNotNull();
	}

}
