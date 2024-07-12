package Order.OrderModel;

import java.util.ArrayList;

public class OrderModel {

    private ArrayList<String[]> orderdetail;
    private String username;
    public void setUsername() {
        this.username = null; //이부분 username 로그인할시 로 할꺼임
    }
    public void setOrderdetail(ArrayList<String[]> orderdetail) {
        this.orderdetail = orderdetail;
    }

}
