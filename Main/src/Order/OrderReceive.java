package Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrderReceive {

    Scanner sc=new Scanner(System.in);

    public OrderReceive(ArrayList<String[]> OrderDetails) {
        while (true) {
            System.out.println("주문은 메뉴,수량으로 결정됩니다. 주문해주세요! (주문 끝:0번)");
            String order = sc.nextLine();
            if (order.equals("0")) {
                break;
            }
            String[] orderdetail = order.split(" ");

            System.out.println("------------주문 목록------------");
            for (String[] menu : OrderDetails) {
                if (orderdetail[0].equals(menu[0])) {
                    throw new RuntimeException("메뉴가 중복되었습니다!");
                }
                System.out.println(Arrays.toString(menu));
            }
            System.out.println(Arrays.toString(orderdetail)+ "\n");
            OrderDetails.add(orderdetail);
        }
    }
}
