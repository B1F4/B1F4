package Order.OrderController;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import Order.OrderService.OrderServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderController {
    public String order(ArrayList<String[]> orderdetail,HashMap<Integer, OrderModel> db){

        StringBuilder stringBuilder=new StringBuilder();
        OrderRepository orderRepository=new OrderRepository(db);
        OrderServiceImpl orderService=new OrderServiceImpl(orderRepository);

        orderService.save(orderdetail);

        return stringBuilder.append("주문이 완료되었습니다!").toString();
    }
}
