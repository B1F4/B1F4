package Review.ReviewModel;

import Order.OrderModel.OrderModel;
import Restaurant.RestaurantModel.RestaurantModel;
import User.UserModel.UserModel;

public class ReviewModel {
    private int reviewId;
    private String comment;
    private int rating;

    //User와 Order 객체를 참조하여 foreign key 가져오기
    //유저 정보, 주문한 가게와 메뉴가 존재해야 함.
    private UserModel user; // -> userId, nickName
    private OrderModel order; // -> orderDetail

    public ReviewModel(int id, UserModel user, OrderModel order) {
        this.reviewId = id;
        this.user = user;
        this.order = order;
    }

    public int getId() {
        return reviewId;
    }

    public void setId(int reviewId) {
        this.reviewId = reviewId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
