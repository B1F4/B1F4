package Order;

import Order.OrderController.OrderController;
import Order.OrderModel.OrderModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OrderView {

    public OrderView( HashMap<Integer, OrderModel> Orderdb) {

        OrderController orderController=new OrderController();
        Scanner sc=new Scanner(System.in);

        System.out.println("주문해주세요! 주문은 1번  주문완료나 종료하실려면 0번 눌러주세요 \n");
        ArrayList<String[]> OrderDetails=new ArrayList<>();

        while(true) {
            System.out.println("주문은 메뉴,수량으로 결정됩니다. 주문해주세요!");
            String order=sc.nextLine();
            if(order.equals("0")){
                break;
            }
            String[] orderdetail=order.split(" ");
            OrderDetails.add(orderdetail);
        }

        String orderresponse=orderController.order(OrderDetails,Orderdb);

        System.out.println(orderresponse);
    }
}
