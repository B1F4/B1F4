package Restaurant.RestaurantRepository;

import Restaurant.RestaurantModel.RestaurantModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestaurantRepository {
    // 여기가 Map
    private static List<RestaurantModel> restaurantRepo = new ArrayList<>(
            Arrays.asList(
                    new RestaurantModel(1, "홍콩반점", "중식", "서울", "123"),
                    new RestaurantModel(2, "성수다락", "양식", "서울", "432"),
                    new RestaurantModel(3, "동대문엽기떡볶이", "분식", "서울", "3215"),
                    new RestaurantModel(4, "자금성", "중식", "서울", "6545")
            )
    );

    public List<RestaurantModel> getRestaurantList() {
        return restaurantRepo;
    }
}
