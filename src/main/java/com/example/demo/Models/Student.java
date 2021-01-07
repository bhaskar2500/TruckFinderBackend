package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.utilities.Javautitlity;

import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "passport_number", nullable = true)
	private String passportNumber;

	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Student(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		// return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
		return Javautitlity.getJsonFromObject(this);
	}
	// @Bean
	// public Student getStudentObject(){
	// 	return  new Student();
	// }



}
