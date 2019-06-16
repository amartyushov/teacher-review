package io.mart.service.review;

import io.mart.model.ReviewRecordDto;
import io.mart.repository.ReviewRepository;

public class ReviewServiceImpl implements ReviewService {
	
	private ReviewRepository reviewRepository;
	
	
	public ReviewServiceImpl(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
	
	@Override
	public ReviewRecordDto create(ReviewRecordDto review) {
		return reviewRepository.create(review);
	}
	
	
	@Override
	public ReviewRecordDto update(ReviewRecordDto review) {
		return reviewRepository.update(review);
	}
	
	
	@Override
	public ReviewRecordDto read(Long id) {
		return reviewRepository.read(id);
	}
	
	
	@Override
	public void delete(Long id) {
		reviewRepository.delete(id);
	}
}
