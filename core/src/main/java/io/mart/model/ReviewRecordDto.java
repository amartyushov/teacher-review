package io.mart.model;

public class ReviewRecordDto {
	
	private TeacherDto teacher;
	private Rating rating;
	private String pros;
	private String cons;
	private Long id;
	
	
	public TeacherDto getTeacher() {
		return teacher;
	}
	
	
	public ReviewRecordDto setTeacher(TeacherDto teacher) {
		this.teacher = teacher;
		return this;
	}
	
	
	public Rating getRating() {
		return rating;
	}
	
	
	public ReviewRecordDto setRating(Rating rating) {
		this.rating = rating;
		return this;
	}
	
	
	public String getPros() {
		return pros;
	}
	
	
	public ReviewRecordDto setPros(String pros) {
		this.pros = pros;
		return this;
	}
	
	
	public String getCons() {
		return cons;
	}
	
	
	public ReviewRecordDto setCons(String cons) {
		this.cons = cons;
		return this;
	}
	
	
	public Long getId() {
		return id;
	}
	
	
	public ReviewRecordDto setId(Long id) {
		this.id = id;
		return this;
	}
}
