package Order.OrderRepository;

import Order.OrderModel.OrderModel;

import java.util.Map;

public class OrderRepository  {

    private Map<Integer, OrderModel> db;

    public OrderRepository(Map<Integer, OrderModel> db){
        this.db=db;
    }

    public void save(int id,OrderModel orderModel){
        db.put(id,orderModel);
    }

    public Map<Integer, OrderModel> getDb() {
        return db;
    }
}
