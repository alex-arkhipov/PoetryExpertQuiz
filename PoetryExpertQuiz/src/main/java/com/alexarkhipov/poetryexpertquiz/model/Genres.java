package com.alexarkhipov.poetryexpertquiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRES")
public class Genres {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Genre", nullable = false)
	private String genre;

	public String getGenre() {
		return genre;
	}

}
