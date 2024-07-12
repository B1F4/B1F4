package Order.OrderRepository;

import Order.OrderModel.OrderModel;

public interface OrderRepository {

    public void save(int id, OrderModel orderModel);
    public void delete();
}
