package io.mart.service.review;

import io.mart.model.ReviewRecordDto;
import io.mart.model.TeacherDto;
import io.mart.repository.ReviewRepository;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReviewServiceImplTest {
	
	
	private static final String CONS_STRING = "There is a cons string";
	private static final String PROS_STRING = "There is a pros string";
	
	
	@Test
	public void canCreateReviewForTeacher() {
		// Arrange
		TeacherDto teacher = simpleTeacher();
		ReviewRecordDto review = new ReviewRecordDto()
				.setId(1L)
				.setCons(CONS_STRING)
				.setPros(PROS_STRING)
				.setTeacher(teacher);
		
		ReviewRepository reviewRepository = mock(ReviewRepository.class);
		when(reviewRepository.create(any())).thenReturn(review);
		
		ReviewService service = new ReviewServiceImpl(reviewRepository);
		
		// Act
		ReviewRecordDto createdReview = service.create(review);
		
		// Assert
		assertThat(createdReview).isEqualTo(review);
	}
	
	
	@Test
	public void canUpdateReview() {
		// Arrange
		TeacherDto teacher = simpleTeacher();
		ReviewRecordDto review = new ReviewRecordDto()
				.setId(1L)
				.setCons(CONS_STRING)
				.setPros(PROS_STRING)
				.setTeacher(teacher);
		
		ReviewRepository reviewRepository = mock(ReviewRepository.class);
		when(reviewRepository.update(any())).thenReturn(review);
		
		ReviewService service = new ReviewServiceImpl(reviewRepository);
		
		// Act
		ReviewRecordDto updatedReview = service.update(review);
		
		// Assert
		assertThat(updatedReview).isEqualTo(review);
	}
	
	
	@Test
	public void canReadReview() {
		TeacherDto teacher = simpleTeacher();
		ReviewRecordDto review = new ReviewRecordDto()
				.setId(1L)
				.setCons(CONS_STRING)
				.setPros(PROS_STRING)
				.setTeacher(teacher);
		
		ReviewRepository reviewRepository = mock(ReviewRepository.class);
		when(reviewRepository.read(any())).thenReturn(review);
		
		ReviewService service = new ReviewServiceImpl(reviewRepository);
		
		// Act
		ReviewRecordDto readReview = service.read(1L);
		
		// Assert
		assertThat(readReview).isEqualTo(review);
	}
	
	
	@Test
	public void deleteReview_doesNotThrowException() {
		// Arrange
		ReviewRepository repository = mock(ReviewRepository.class);
		doNothing().when(repository).delete(any());
		
		ReviewService service = new ReviewServiceImpl(repository);
		
		// Act
		Throwable throwable = catchThrowable(() -> service.delete(1L));
		
		//Assert
		assertThat(throwable).doesNotThrowAnyException();
	}
	
	
	private TeacherDto simpleTeacher() {
		return new TeacherDto()
				.setId(1L);
	}
}