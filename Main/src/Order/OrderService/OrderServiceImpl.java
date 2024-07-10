package Order.OrderService;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService{
    int id=1;
    OrderRepository orderRepository;
    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    public void save(ArrayList<String[]> orderdetails){


        OrderModel orderModel=new OrderModel();
        orderModel.setOrderdetail(orderdetails);
        orderModel.setUsername();


        orderRepository.save(id,orderModel);

        Map<Integer, OrderModel> db=orderRepository.getDb();

        id+=1;



    }
}
