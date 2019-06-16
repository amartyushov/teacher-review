package io.mart.service.teacher;

import io.mart.model.TeacherDto;
import io.mart.repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService {
	
	private TeacherRepository teacherRepository;
	
	
	TeacherServiceImpl(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}
	
	
	@Override
	public TeacherDto create(TeacherDto teacher) {
		return teacherRepository.create(teacher);
	}
	
	
	@Override
	public TeacherDto update(TeacherDto teacher) {
		return teacherRepository.update(teacher);
	}
	
	
	@Override
	public TeacherDto read(Long id) {
		return teacherRepository.read(id);
	}
	
	
	@Override
	public void delete(Long id) {
		teacherRepository.delete(id);
	}
}
