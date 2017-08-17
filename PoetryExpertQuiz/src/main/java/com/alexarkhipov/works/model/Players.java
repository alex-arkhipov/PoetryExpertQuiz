package com.alexarkhipov.works.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PLAYERS")
public class Players {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(nullable = false, length = 20)
	private String nickname;

	@Column(nullable = false, length = 255)
	private String name;

	public String getFullname() {
		return name;
	}

	@Column(nullable = false, length = 100)
	private String hash;

	@Column
	private Integer age;

	@Column(nullable = false, length = 100)
	private String email;

	@Column
	private Integer scores;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dyear;

	@Column(nullable = false)
	private short sex;

}
