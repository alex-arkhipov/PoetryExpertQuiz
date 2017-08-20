package com.alexarkhipov.poetryexpertquiz.dao;

import java.util.List;

import com.alexarkhipov.poetryexpertquiz.model.Authors;

public interface AuthorsDao {
	List<Authors> getAuthors();
}
