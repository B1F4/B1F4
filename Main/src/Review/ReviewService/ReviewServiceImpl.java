package Review.ReviewService;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import User.UserModel.UserModel;

import java.util.List;

public class ReviewServiceImpl implements ReviewService{
    private ReviewModel review = new ReviewModel(0);
    private ReviewRepository reviewRepo = new ReviewRepository();

    @Override
    public void saveReview(UserModel user, OrderModel order, int rating, String comment){
        ReviewModel review = new ReviewModel(0);
        review.setUser(user);
        review.setOrder(order);
        review.setRating(rating);
        review.setComment(comment);
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewModel> getReviewsByUser(UserModel user) {
        return reviewRepo.findReviewsByUser(user); //사용자 id와 일치하는 review가 담긴 reviews List
    }

    @Override
    public void deleteReview(int reviewId) {
        reviewRepo.deleteById(reviewId);
    }

    @Override
    public void printAllReviews() {
        reviewRepo.printAllReviews();
    }
}
