package Review.ReviewService;

import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;

public class ReviewServiceImpl implements ReviewService{
    private ReviewRepository reviewRepo;

    public ReviewServiceImpl(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void saveReview(int rating, String comment){
        ReviewModel review = new ReviewModel(0,rating,comment);
        reviewRepo.save(review);
    }

}
