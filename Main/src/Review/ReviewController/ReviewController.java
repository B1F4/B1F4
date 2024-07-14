package Review.ReviewController;

import Review.ReviewModel.ReviewModel;
import Review.ReviewService.ReviewService;
import Review.ReviewView;

public interface ReviewController {
    void processInitialInput(String choice);
    void saveReview(int rating, String comment);
}
