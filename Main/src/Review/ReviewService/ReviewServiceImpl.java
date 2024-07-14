package Review.ReviewService;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import Review.ReviewView;
import User.UserModel.UserModel;

import java.util.List;

public class ReviewServiceImpl implements ReviewService{
    private ReviewRepository reviewRepo;
    private ReviewModel review = new ReviewModel(0);

    public ReviewServiceImpl(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void setUserAndOrder(UserModel user, OrderModel order){
        review.setUser(user);
        review.setOrder(order);
    }

    @Override
    public void saveReview(int rating, String comment){
        review.setRating(rating);
        review.setComment(comment);
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewModel> getReviewsByUser(UserModel user) {
        return reviewRepo.findReviewsByUser(user); //사용자 id와 일치하는 review가 담긴 reviews List
    }

}
