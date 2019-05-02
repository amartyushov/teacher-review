package io.mart.model;

import java.util.Date;

public class Teacher {
	
	private String firstName;
	private String lastName;
	
	private Date dateOfBirth;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public Teacher setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public Teacher setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	
	public Teacher setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}
}
