package Order.OrderService;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import java.util.ArrayList;

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

        id+=1;

    }
    public void deleteOrder(){
        orderRepository.delete();
        id=1;
    }
}
