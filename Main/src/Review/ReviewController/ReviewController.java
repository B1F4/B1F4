package Review.ReviewController;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewService.ReviewService;
import Review.ReviewView;
import User.UserModel.UserModel;

public interface ReviewController {
    void setUserAndOrder(UserModel user, OrderModel order);
    void processInitialInput(String choice);
    void saveReview(int rating, String comment);

}
