package Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrderReceive {

    Scanner sc=new Scanner(System.in);

    public OrderReceive(ArrayList<String[]> OrderDetails,String restaurantName,String[] menus) {
        while (true) {
            displayMenu(restaurantName,menus);
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

    private void displayMenu(String restaurantName,String[] menus) {
        System.out.println("\n===== " + restaurantName + " 메뉴 =====");
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i]);
        }
        System.out.println("========================");
    }
}
