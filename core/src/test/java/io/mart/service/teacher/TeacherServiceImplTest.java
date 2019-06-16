package io.mart.service.teacher;

import io.mart.model.TeacherDto;
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
		TeacherDto teacher = new TeacherDto();
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.create(any())).thenReturn(teacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		TeacherDto createdTeacher = teacherService.create(teacher);
		
		//Assert
		assertThat(createdTeacher).isEqualTo(teacher);
	}
	
	
	@Test
	public void update_returnsTeacher() {
		// Arrange
		TeacherDto teacher = new TeacherDto();
		TeacherDto updatedTeacher = new TeacherDto().setLastName("updated");
		
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.update(any())).thenReturn(updatedTeacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		TeacherDto receivedTeacher = teacherService.update(teacher);
		
		//Assert
		assertThat(receivedTeacher).isEqualTo(updatedTeacher);
	}
	
	
	@Test
	public void read_returnsTeacher() {
		// Arrange
		long id = 1L;
		TeacherDto teacher = new TeacherDto().setId(id).setFirstName("first");
		
		TeacherRepository teacherRepository = Mockito.mock(TeacherRepository.class);
		when(teacherRepository.read(id)).thenReturn(teacher);
		
		//Act
		TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
		TeacherDto receivedTeacher = teacherService.read(id);
		
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