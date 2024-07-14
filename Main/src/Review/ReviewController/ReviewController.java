package Review.ReviewController;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import User.UserModel.UserModel;

import java.util.List;

public interface ReviewController {
    void processInitialInput(String choice, UserModel user, OrderModel order);
    void saveReview(UserModel user, OrderModel order, int rating, String comment);
    List<ReviewModel> getReviews(UserModel user);
    void deleteReview(String choice, int id);

    void printAllReviews();
}
