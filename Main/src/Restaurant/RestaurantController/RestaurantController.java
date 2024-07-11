package Restaurant.RestaurantController;

import Restaurant.RestaurantModel.RestaurantModel;
import Restaurant.RestaurantRepository.RestaurantRepository;
import Restaurant.RestaurantService.RestaurantService;

import java.util.List;

public class RestaurantController {

    public RestaurantController(String category) {
        RestaurantRepository repository = new RestaurantRepository();
        RestaurantService service = new RestaurantService(repository);

        List<RestaurantModel> filteredRestaurants = service.getRestaurants(category);

        service.printRestaurantList(filteredRestaurants);

    }


}
