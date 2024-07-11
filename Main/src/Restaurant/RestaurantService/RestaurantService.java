package Restaurant.RestaurantService;

import Restaurant.RestaurantModel.RestaurantModel;
import Restaurant.RestaurantRepository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private RestaurantRepository restaurantRepo;

    public RestaurantService(RestaurantRepository restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    public ArrayList<RestaurantModel> getRestaurants(String category) {
        ArrayList<RestaurantModel> filteredRestaurants = new ArrayList<>();

        for (RestaurantModel restaurant : restaurantRepo.getRestaurantList()) {
            if (restaurant.getCategory().equalsIgnoreCase(category)) {
                filteredRestaurants.add(restaurant);
            }
        }
        return filteredRestaurants;
    }

    public void printRestaurantList(List<RestaurantModel> restaurantList) {
        for (RestaurantModel restaurant : restaurantList) {
            System.out.println(restaurant.getRestaurantName());
        }
    }
}
