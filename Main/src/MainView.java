import Order.OrderModel.OrderModel;
import Order.OrderView;

import java.util.HashMap;

public class MainView {
    public static void main(String[] args) {

        HashMap<Integer, OrderModel> Orderdb=new HashMap<>();
        OrderView orderView=new OrderView(Orderdb);
    }


}