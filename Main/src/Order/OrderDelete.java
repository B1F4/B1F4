package Order;

import Order.OrderController.OrderController;
import Order.OrderModel.OrderModel;
import java.util.HashMap;

public class OrderDelete {
    public OrderDelete(OrderController orderController){
        String DeleteResponse=orderController.deleteOrder();
        System.out.println(DeleteResponse+"\n");
    }
}
