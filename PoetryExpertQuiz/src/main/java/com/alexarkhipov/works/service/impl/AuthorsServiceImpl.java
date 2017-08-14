package com.alexarkhipov.works.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexarkhipov.works.dao.AuthorsDao;
import com.alexarkhipov.works.model.Authors;
import com.alexarkhipov.works.service.AuthorsService;

@Service
public class AuthorsServiceImpl implements AuthorsService {

	@Autowired
	private AuthorsDao authorsDao;

	@Override
	public List<Authors> getAuthors() {
		return authorsDao.getAuthors();
	}

}
