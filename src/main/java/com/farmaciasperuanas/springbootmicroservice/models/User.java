package com.farmaciasperuanas.springbootmicroservice.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	
	private String firstname;
	private String lastname;
	private int age;
	private Date birthdate;
	
	public User() {}
	
	public User(String firstname, String lastname, int age, Date birthdate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", birthdate=" + birthdate
				+ "]";
	}

	
	

	
	
	
	
	
}
