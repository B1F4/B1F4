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

    // Review 삭제
    // reviewId와 일치하는 review 객체를 삭제
    public void deleteById(int id) {
        if (db.containsKey(id)) {
            db.remove(id);
        }
    }

    // DB 상태 출력
    public void printAllReviews() {
        if (db.isEmpty()) {
            System.out.println("저장된 리뷰가 없습니다.");
        } else {
            System.out.println("<DB 상태>");
            for (Map.Entry<Integer, ReviewModel> entry : db.entrySet()) {
                System.out.println("Review ID: " + entry.getKey());
                System.out.println("User PID: "+entry.getValue().getUser().getId());
                System.out.println("작성자: "+entry.getValue().getUser().getNickname());
                System.out.println("리뷰 평점: "+entry.getValue().getRating());
                System.out.println("리뷰 내용: "+entry.getValue().getComment());
                System.out.println("------------------------------");
            }
        }
    }
}
