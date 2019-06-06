package io.mart.service;

import io.mart.model.Teacher;
import io.mart.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(BlockJUnit4ClassRunner.class)
public class TeacherServiceImplTest {
	
	@Test
	public void create_returnsTeacher() {
		// Arrange
		Teacher teacher = new Teacher();
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.create(any())).thenReturn(teacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		Teacher createdTeacher = teacherService.create(teacher);
		
		//Assert
		assertThat(createdTeacher).isEqualTo(teacher);
	}
	
	
	@Test
	public void update_returnsTeacher() {
		// Arrange
		Teacher teacher = new Teacher();
		Teacher updatedTeacher = new Teacher().setLastName("updated");
		
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.update(any())).thenReturn(updatedTeacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		Teacher receivedTeacher = teacherService.update(teacher);
		
		//Assert
		assertThat(receivedTeacher).isEqualTo(updatedTeacher);
	}
	
	
	@Test
	public void read_returnsTeacher() {
		// Arrange
		long id = 1L;
		Teacher teacher = new Teacher().setId(id).setName("first");
		
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.read(id)).thenReturn(teacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		Teacher receivedTeacher = teacherService.read(id);
		
		//Assert
		assertThat(receivedTeacher).isEqualTo(teacher);
	}
	
	
	@Test
	public void delete_returnsTeacher() {
		// Arrange
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		doNothing().when(teacherRepository).delete(any());
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		teacherService.delete(1L);
		Throwable throwable = catchThrowable(() -> teacherService.delete(1L));
		
		//Assert
		assertThat(throwable).doesNotThrowAnyException();
	}
}