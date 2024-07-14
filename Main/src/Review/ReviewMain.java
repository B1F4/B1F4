package Review;

import Order.OrderModel.OrderModel;
import Review.ReviewController.ReviewController;
import Review.ReviewController.ReviewControllerImpl;
import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;
import Review.ReviewService.ReviewService;
import Review.ReviewService.ReviewServiceImpl;
import User.UserModel.UserModel;

public class ReviewMain {
    public static void main(String[] args) {
        //모델 초기화
        ReviewRepository reviewRepo = new ReviewRepository();
        ReviewService reviewService = new ReviewServiceImpl(reviewRepo);

        //뷰 초기화
        ReviewView reviewView = new ReviewView();

        //컨트롤러로 모델, 뷰 주입
        ReviewController reviewController = new ReviewControllerImpl(reviewService, reviewView);
        reviewView.setController(reviewController);

        //Start application
        //테스트를 위한, 유저 정보와 주문 정보 임의 생성
        UserModel user = new UserModel(0,"cr0036","1234","coldegg","부흥로 102");
        OrderModel order = new OrderModel();
        reviewView.afterOrderDisplay(user,order); //리뷰 등록 -> 주문 후 화면에서 display
//        reviewView.userReviewsDisplay(user); //리뷰 관리 -> 유저 화면에서 display

    }
}
