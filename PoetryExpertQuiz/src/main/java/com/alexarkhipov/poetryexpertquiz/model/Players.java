package com.alexarkhipov.poetryexpertquiz.model;

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(nullable = false, length = 255)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = false, length = 100)
	private String hash;

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Column
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(String age) {
		if(age.length() == 0) {
			return;
		}
		try {
			this.age = Integer.parseInt(age);	
		}
		catch(NumberFormatException e) {
			// Do nothings
		}
		
	}
	@Column(nullable = false, length = 100)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	private Integer scores;

	@Column
	@Temporal(TemporalType.DATE)
	private Date lastaccess;

	public Date getLastAccess() {
		return lastaccess;
	}

	@Column(nullable = false)
	private short sex;

	public short getSex() {
		return sex;
	}

	public void getSex(short sex) {
		this.sex = sex;
	}
}
