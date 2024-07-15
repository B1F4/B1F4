package Order.OrderController;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import Order.OrderRepository.OrderRepositoryImpl;
import Order.OrderService.OrderService;
import Order.OrderService.OrderServiceImpl;
import Order.OrderView;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderControllerImpl implements OrderController {

    HashMap<Integer, OrderModel> Orderdb=new HashMap<>();


    public String order(ArrayList<String[]> orderdetail,String restaurantname){

        StringBuilder stringBuilder=new StringBuilder();
        OrderRepository orderRepository=new OrderRepositoryImpl(Orderdb);
        OrderModel orderModel=new OrderModel();
        OrderService orderService=new OrderServiceImpl(orderRepository,orderModel);

        orderService.save(orderdetail,restaurantname);

        return stringBuilder.append("주문이 완료되었습니다!").toString();
    }
    public String deleteOrder() {

        StringBuilder stringBuilder=new StringBuilder();
        OrderRepository orderRepository=new OrderRepositoryImpl(Orderdb);
        OrderModel orderModel=new OrderModel();
        OrderService orderService=new OrderServiceImpl(orderRepository,orderModel);

        orderService.deleteOrder();

        return stringBuilder.append("삭제가 완료되었습니다!").toString();

    }

}
