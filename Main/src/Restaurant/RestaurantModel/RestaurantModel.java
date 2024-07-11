package Restaurant.RestaurantModel;

public class RestaurantModel {
    private int id;
    private String restaurantName;
    private String category;
    private String location;
    private String phoneNum;

    public RestaurantModel(int id, String restaurantName, String category, String location, String phoneNum) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.category = category;
        this.location = location;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
}
