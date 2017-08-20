package com.alexarkhipov.poetryexpertquiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexarkhipov.poetryexpertquiz.dao.AuthorsDao;
import com.alexarkhipov.poetryexpertquiz.model.Authors;
import com.alexarkhipov.poetryexpertquiz.service.AuthorsService;

@Service
public class AuthorsServiceImpl implements AuthorsService {

	@Autowired
	private AuthorsDao authorsDao;

	@Override
	public List<Authors> getAuthors() {
		return authorsDao.getAuthors();
	}

}
