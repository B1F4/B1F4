package Review.ReviewModel;

import Order.OrderModel.OrderModel;
import Restaurant.RestaurantModel.RestaurantModel;
import User.UserModel.UserModel;

public class ReviewModel {
    private int reviewId;
    private String comment;
    private int rating;

    //User와 Restaurant 객체를 참조하여 foreign key 가져오기
    private UserModel user; // -> userId, nickName
    private RestaurantModel restaurant; //-> restId
    private OrderModel order; // -> orderDetail

    public void setOrder(OrderModel order) {
        this.order = order;
    }

    public void setRestaurant(RestaurantModel restaurant) {
        this.restaurant = restaurant;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public ReviewModel(int id, int rating, String comment) {
        this.reviewId = id;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return reviewId;
    }

    public void setId(int reviewId) {
        this.reviewId = reviewId;
    }
}
