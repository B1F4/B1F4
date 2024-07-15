package Order;

import Order.OrderController.OrderController;
import Order.OrderController.OrderControllerImpl;
import Restaurant.RestaurantController.RestaurantController;
import Review.ReviewView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class OrderView  {



    public OrderView(String RestaurantName,String[] menus) {


        OrderController orderController=new OrderControllerImpl();
        HashMap<Integer,String> selectMap=new HashMap<>();
        selectMap.put(0,"END");
        selectMap.put(1,"RECEIVE");
        selectMap.put(2,"DELETE");
        Scanner sc=new Scanner(System.in);
        ArrayList<String[]> orderDetails=new ArrayList<>();

         System.out.println("환영합니다! " + RestaurantName + "의 주문 시스템입니다.");

        new RestaurantController();

        while(true) {

            System.out.println("주문 완료 및 종료:0,등록:1,(전체)삭제:2");
            int orderSelect=Integer.parseInt(sc.nextLine());
            String controlOrder=selectMap.get(orderSelect);

            if(controlOrder=="END"){
              break;
            }
            if(controlOrder=="RECEIVE") {
                new OrderReceive(orderDetails,RestaurantName,menus);
            }
            if(controlOrder=="DELETE"){
                orderDetails=new ArrayList<>();
               new OrderDelete(orderController);
            }
        }

        String orderResponse=orderController.order(orderDetails,RestaurantName);
        System.out.println(orderResponse);

        new ReviewView();
    }

}