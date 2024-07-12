package Order;

import Order.OrderController.OrderController;
import Order.OrderController.OrderControllerImpl;
import Order.OrderModel.OrderModel;
import Order.OrderRepository.OrderRepository;
import Order.OrderRepository.OrderRepositoryImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OrderView  {

    public OrderView( HashMap<Integer, OrderModel> Orderdb) {

        OrderController orderController=new OrderControllerImpl();
        OrderRepository orderRepository=new OrderRepositoryImpl(Orderdb);
        Scanner sc=new Scanner(System.in);
        ArrayList<String[]> orderDetails=new ArrayList<>();

        while(true) {

            System.out.println("주문 완료 및 종료:0,등록:1,(전체)삭제:2");
            String select=sc.nextLine();

            if(select.equals("0")){
                break;
            }
            if(select.equals("1")) {
                new OrderReceive(orderDetails);
            }
            if(select.equals("2")){
                orderDetails=new ArrayList<>();
               new OrderDelete(orderController,Orderdb,orderRepository,orderDetails);
            }
        }

        String orderResponse=orderController.order(orderDetails,Orderdb,orderRepository);
        System.out.println(orderResponse);
    }
}
