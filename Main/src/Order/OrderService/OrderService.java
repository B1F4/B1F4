package Order.OrderService;

import Order.OrderRepository.OrderRepository;

import java.util.ArrayList;

public interface OrderService{

    void save(ArrayList<String[]> orderdetails,String restaurantname);
    void deleteOrder();

}
