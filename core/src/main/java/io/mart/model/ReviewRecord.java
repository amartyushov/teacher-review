package io.mart.model;

public class ReviewRecord {
	
	private Teacher teacher;
	private Rating rating;
	private String pros;
	private String cons;
	
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	
	public ReviewRecord setTeacher(Teacher teacher) {
		this.teacher = teacher;
		return this;
	}
	
	
	public Rating getRating() {
		return rating;
	}
	
	
	public ReviewRecord setRating(Rating rating) {
		this.rating = rating;
		return this;
	}
	
	
	public String getPros() {
		return pros;
	}
	
	
	public ReviewRecord setPros(String pros) {
		this.pros = pros;
		return this;
	}
	
	
	public String getCons() {
		return cons;
	}
	
	
	public ReviewRecord setCons(String cons) {
		this.cons = cons;
		return this;
	}
}
