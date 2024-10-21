
package com.example.demo.RestaurantExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // Create or update a review
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    // Get all reviews
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    // Get a review by ID
    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElseThrow(() -> new RuntimeException("Review not found"));
    }

    // Delete a review by ID
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}

