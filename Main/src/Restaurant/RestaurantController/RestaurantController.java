package Restaurant.RestaurantController;

import Restaurant.RestaurantModel.RestaurantModel;
import Restaurant.RestaurantRepository.RestaurantRepository;
import Restaurant.RestaurantService.RestaurantService;

import java.util.List;

public class RestaurantController {
    RestaurantRepository repository = new RestaurantRepository();
    RestaurantService service = new RestaurantService(repository);

    public List<RestaurantModel> getFilteredRestaurants(String category) {
        List<RestaurantModel> filteredRestaurants = service.getRestaurants(category);
        return  filteredRestaurants;
    }

    public void printRestaurants(List<RestaurantModel> filteredRestaurants) {
        service.printRestaurantList(filteredRestaurants);

    }

    public int getRestaurantId(String restaurantName) {
        int id = service.findRestaurantIdByName(restaurantName);
        return id;
    }
}
