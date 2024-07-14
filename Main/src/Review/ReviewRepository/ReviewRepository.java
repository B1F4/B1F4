package Review.ReviewRepository;

import Review.ReviewModel.ReviewModel;
import java.util.HashMap;

public class ReviewRepository {
    HashMap<Integer, ReviewModel> db=new HashMap<>();
    private int nextId = 1;
    
    //Review 등록
    //review객체를 받아서 db에 추가
    public void save(ReviewModel review){
        review.setId(nextId++);
        db.put(review.getId(),review);
    }


}
