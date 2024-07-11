package Order;

import Order.OrderController.OrderController;
import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderDelete {
    public OrderDelete(OrderController orderController, HashMap<Integer, OrderModel> Orderdb, OrderRepository orderRepository,ArrayList<String[]> OrderDetails){
        String DeleteResponse=orderController.deleteOrder(Orderdb,orderRepository);
        System.out.println(DeleteResponse+"\n");
    }
}
