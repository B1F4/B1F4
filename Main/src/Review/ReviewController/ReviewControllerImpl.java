package Review.ReviewController;

import Order.OrderModel.OrderModel;
import Review.ReviewModel.ReviewModel;
import Review.ReviewService.ReviewService;
import Review.ReviewView;
import User.UserModel.UserModel;
import java.util.List;

public class ReviewControllerImpl implements ReviewController{
    private ReviewService service;
    private ReviewView view;
    private ReviewModel model;

    public ReviewControllerImpl(ReviewService service, ReviewView view) {
        this.service = service;
        this.view = view;
    }

    @Override
    // 리뷰 등록여부 사용자 입력 처리
    public void processInitialInput(String choice, UserModel user, OrderModel order){
        switch (choice) {
            case "y":
                view.addReview(user,order);
                break;
            case "n":
                System.out.println("저희 서비스를 이용해주셔서 감사합니다.");
                break;
            default:
            System.out.println("y 혹은 n을 입력해주세요.");
        }
    }

    @Override
    // 리뷰 등록 입력 처리
    public void saveReview(UserModel user, OrderModel order, int rating, String comment){
        service.saveReview(user, order, rating, comment);
    }

    @Override
    // 사용자 리뷰들 출력 처리
    public List<ReviewModel> getReviews(UserModel user) {
        return service.getReviewsByUser(user);
    }

    @Override
    public void deleteReview(String choice, int reviewId) {
        switch (choice) {
            case "y":
                service.deleteReview(reviewId);
                System.out.println("리뷰가 정상적으로 삭제되었습니다.");
                break;
            case "n":
                break;
            default:
                System.out.println("y 혹은 n을 입력해주세요.");
        }
    }

    @Override
    public void printAllReviews(){
        service.printAllReviews();
    }
}
