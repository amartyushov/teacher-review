package io.mart.service;

import io.mart.model.Teacher;
import io.mart.repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService {
	
	private TeacherRepository teacherRepository;
	
	
	TeacherServiceImpl(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}
	
	
	@Override
	public Teacher create(Teacher teacher) {
		return teacherRepository.create(teacher);
	}
	
	
	@Override
	public Teacher update(Teacher teacher) {
		return teacherRepository.update(teacher);
	}
	
	
	@Override
	public Teacher read(Long id) {
		return teacherRepository.read(id);
	}
	
	
	@Override
	public void delete(Long id) {
		teacherRepository.delete(id);
	}
}
