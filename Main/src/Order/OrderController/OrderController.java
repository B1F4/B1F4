package Order.OrderController;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;

public interface OrderController {

    String order(ArrayList<String[]> orderdetail, HashMap<Integer, OrderModel> db, OrderRepository orderRepository);
    String deleteOrder(HashMap<Integer, OrderModel> db,OrderRepository orderRepository);

}
