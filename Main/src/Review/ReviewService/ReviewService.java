package Review.ReviewService;

import Review.ReviewModel.ReviewModel;
import Review.ReviewRepository.ReviewRepository;

public class ReviewService {
    // 컨트롤러는 사용자 입력을 처리하고,
    // 서비스 계층은 Repo에 접근하여 비즈니스 로직을 처리

    private ReviewRepository reviewRepo;

    public ReviewService(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public void saveReview(int rating, String comment){
        ReviewModel review = new ReviewModel(0,rating,comment);
        reviewRepo.save(review);
    }

}
