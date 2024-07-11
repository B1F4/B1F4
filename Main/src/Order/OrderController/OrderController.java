package Order.OrderController;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import Order.OrderService.OrderServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderController {
    public String order(ArrayList<String[]> orderdetail,HashMap<Integer, OrderModel> db,OrderRepository orderRepository){

        StringBuilder stringBuilder=new StringBuilder();
        OrderServiceImpl orderService=new OrderServiceImpl(orderRepository);
        orderService.save(orderdetail);

        return stringBuilder.append("주문이 완료되었습니다!").toString();
    }
    public String deleteOrder(HashMap<Integer, OrderModel> db,OrderRepository orderRepository) {

        StringBuilder stringBuilder=new StringBuilder();
        OrderServiceImpl orderService=new OrderServiceImpl(orderRepository);
        orderService.deleteOrder();

        return stringBuilder.append("삭제가 완료되었습니다!").toString();

    }

}
