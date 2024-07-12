package Order.OrderRepository;

import Order.OrderModel.OrderModel;

import java.util.HashMap;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

    private Map<Integer, OrderModel> db;

    public OrderRepositoryImpl(Map<Integer, OrderModel> db){
        this.db=db;
    }

    public void save(int id,OrderModel orderModel){
        db.put(id,orderModel);
    }

    public void delete(){
        this.db=new HashMap<>();
    }
}
