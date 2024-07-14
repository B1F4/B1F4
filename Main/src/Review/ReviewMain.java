package Review;

import Review.ReviewController.ReviewController;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import Review.ReviewService.ReviewService;

public class ReviewMain {
    public static void main(String[] args) {
        //모델 초기화
        ReviewRepository reviewRepo = new ReviewRepository();
        ReviewService reviewService = new ReviewService(reviewRepo);

        //뷰 초기화
        ReviewView reviewView = new ReviewView();

        //컨트롤러로 모델, 뷰 주입
        ReviewController reviewController = new ReviewController(reviewService, reviewView);
        reviewView.setController(reviewController);

        //Start application
        reviewView.start();
    }
}
