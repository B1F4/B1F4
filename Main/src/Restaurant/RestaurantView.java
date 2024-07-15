package Restaurant;

import Menu.MenuApplication;
import Restaurant.RestaurantController.RestaurantController;
import Restaurant.RestaurantModel.RestaurantModel;
import User.UserModel.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantView {

    public RestaurantView(UserModel loggedInUser) {

        Scanner sc = new Scanner(System.in);
        RestaurantController restaurantController = new RestaurantController();
        ArrayList<String> categoryList = new ArrayList<>(List.of("중식", "일식", "한식", "분식", "양식", "아시안", "패스트푸드"));

        while (true) {
            System.out.println("원하시는 카테고리 이름를 입력해주세요");
            System.out.println("중식 일식 한식 분식 양식 아시안 패스트푸드");
            String category = sc.nextLine().trim();
            List<RestaurantModel> filteredRestaurants = restaurantController.getFilteredRestaurants(category);
            restaurantController.printRestaurants(filteredRestaurants);

            if (categoryList.contains(category)) {
                System.out.println("주문하길 원하는 가게 이름을 입력해주세요. 만약 카테고리를 변경하고 싶다면 돌아가기를 입력해주세요");
                String restaurantName = sc.nextLine();

                if (!restaurantName.trim().equals("돌아가기")) {
                    boolean restaurantExists = filteredRestaurants.stream()
                            .anyMatch(restaurant -> restaurant.getRestaurantName().equalsIgnoreCase(restaurantName));

                    if (!restaurantExists) {
                        System.out.println("잘못된 레스토랑 이름입니다. 다시 입력해주세요.");
                    } else {
                        System.out.println(restaurantName + "을(를) 선택하셨습니다.");
                        int id = restaurantController.getRestaurantId(restaurantName);
                        System.out.println("가게 아이디는 " + id + "입니다");
                        new MenuApplication();

                        break;
                    }
                }
            }
        }
    }
}
