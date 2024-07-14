package Review.ReviewController;

import Review.ReviewService.ReviewService;
import Review.ReviewView;

public class ReviewControllerImpl implements ReviewController{
    private ReviewService service;
    private ReviewView view;

    public ReviewControllerImpl(ReviewService service, ReviewView view) {
        this.service = service;
        this.view = view;
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
