package Order.OrderService;

import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import java.util.ArrayList;

public class OrderServiceImpl implements OrderService{
    int id=1;
    OrderRepository orderRepository;
    OrderModel orderModel;
    public OrderServiceImpl(OrderRepository orderRepository,OrderModel orderModel){
        this.orderRepository=orderRepository;
        this.orderModel=orderModel;
    }
    public void  save(ArrayList<String[]> orderdetails){

        orderModel.setOrderdetail(orderdetails);
        orderRepository.save(id,orderModel);
        id+=1;


    }
    public void deleteOrder(){
        orderRepository.delete();
        id=1;
    }

}
