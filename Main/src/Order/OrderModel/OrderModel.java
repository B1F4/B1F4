package Order.OrderModel;

import User.UserModel.UserModel;

import java.util.ArrayList;

public class OrderModel {

    private ArrayList<String[]> orderdetail;


    private String restaurantname;



    public void setOrderdetail(ArrayList<String[]> orderdetail) {
        this.orderdetail = orderdetail;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public ArrayList<String[]> getOrderdetail() {
        return orderdetail;
    }


    public String getRestaurantname() {
        return restaurantname;
    }
}
