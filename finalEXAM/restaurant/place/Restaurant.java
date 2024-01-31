package restaurant.place;

import restaurant.order.OrderType;
import restaurant.order.Order;


public interface Restaurant 
{
    public boolean isDone(int orderNumber);
    public int order(OrderType type, String item, boolean isMenu);
    public Order takeOrder(int orderNumber);
}
