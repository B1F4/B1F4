package Review.ReviewService;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import Review.ReviewView;
import User.UserModel.UserModel;

import java.util.List;

public class ReviewServiceImpl implements ReviewService{
    private ReviewRepository reviewRepo;
    private ReviewModel review;

    public ReviewServiceImpl(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void setUserAndOrder(UserModel user, OrderModel order){
        ReviewModel review = new ReviewModel(0, user, order);
    }

    @Override
    public void saveReview(int rating, String comment){
        review.setRating(rating);
        review.setComment(comment);
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewModel> getReviewsByUser(UserModel user) {
        return List.of();
    }

}
