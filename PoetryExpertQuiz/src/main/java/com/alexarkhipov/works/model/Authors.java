package com.alexarkhipov.works.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORS")
public class Authors {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String fullname;

	public String getFullname() {
		return fullname;
	}

	@Column
	private String fname;
	@Column
	private String mname;
	@Column
	private String lname;
	@Column
	private Integer byear;
	@Column
	private Integer dyear;
	@Column
	private short sex;

	@Override
	public String toString() {
		return fullname;
	}
}
