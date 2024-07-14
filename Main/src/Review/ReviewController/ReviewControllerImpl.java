package Review.ReviewController;

import Order.OrderModel.OrderModel;
import Review.ReviewService.ReviewService;
import Review.ReviewView;
import User.UserModel.UserModel;

public class ReviewControllerImpl implements ReviewController{
    private ReviewService service;
    private ReviewView view;
    private UserModel user;
    private OrderModel order;

    public ReviewControllerImpl(ReviewService service, ReviewView view) {
        this.service = service;
        this.view = view;
    }

    @Override
    public void setUserAndOrder(UserModel user, OrderModel order) {
        this.user = user;
        this.order =order;
    }

    @Override
    // 리뷰 등록여부 사용자 입력 처리
    public void processInitialInput(String choice){
        switch (choice) {
            case "y":
                view.addReview();
                break;
            case "n":
                System.exit(0);
            default:
                System.out.println("y 혹은 n을 입력해주세요.");
        }
    }

    @Override
    // 리뷰 등록 입력 처리
    public void saveReview(int rating, String comment){
        service.saveReview(rating, comment);
    }
}
