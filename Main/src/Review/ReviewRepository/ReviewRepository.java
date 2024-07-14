package Review.ReviewRepository;

import Review.ReviewModel.ReviewModel;
import User.UserModel.UserModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewRepository {
    HashMap<Integer, ReviewModel> db=new HashMap<>();
    private int nextId = 1;
    
    //Review 등록
    //review객체를 받아서 db에 추가
    public void save(ReviewModel review){
        review.setId(nextId++);
        db.put(review.getId(),review);
    }

    //Reviews 출력
    //사용자 id와 일치하는 review들을 새로운 리스트에 담아서 출력
    public List<ReviewModel> findReviewsByUser(UserModel user) {
        List<ReviewModel> userReviews = new ArrayList<>();
        for (Map.Entry<Integer, ReviewModel> entry : db.entrySet()) {
            ReviewModel review = entry.getValue();
            if (review.getUser().getId() == user.getId()) {
                userReviews.add(review);
            }
        }
        return userReviews;
    }

}
