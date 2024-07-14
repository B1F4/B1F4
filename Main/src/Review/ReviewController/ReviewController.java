package Review.ReviewController;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import User.UserModel.UserModel;

import java.util.List;

public interface ReviewController {
    void setUserAndOrder(UserModel user, OrderModel order);
    void processInitialInput(String choice);
    void saveReview(int rating, String comment);
    List<ReviewModel> getReviews(UserModel user);
}
