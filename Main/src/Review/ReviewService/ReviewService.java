package Review.ReviewService;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import User.UserModel.UserModel;
import java.util.List;

public interface ReviewService {
    // 컨트롤러는 사용자 입력을 처리하고,
    // 서비스 계층은 Repo에 접근하여 비즈니스 로직을 처리

    void saveReview(UserModel user, OrderModel order, int rating, String comment);
    List<ReviewModel> getReviewsByUser(UserModel user);
    void deleteReview(int reviewId);

    void printAllReviews();
}
