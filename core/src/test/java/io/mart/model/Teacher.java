package io.mart.model;

public class Teacher {
	
	private Long id;
	private String name;
	private String lastName;
	
	private Integer age;
	private String subject;
	
	
	public String getName() {
		return name;
	}
	
	
	public Teacher setName(String name) {
		this.name = name;
		return this;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public Teacher setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	
	public Integer getAge() {
		return age;
	}
	
	
	public Teacher setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	
	public String getSubject() {
		return subject;
	}
	
	
	public Teacher setSubject(String subject) {
		this.subject = subject;
		return this;
	}
	
	
	public Long getId() {
		return id;
	}
	
	
	public Teacher setId(Long id) {
		this.id = id;
		return this;
	}
}
