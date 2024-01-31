package restaurant.place;

import java.util.HashMap;
import java.util.Map;
import restaurant.order.OrderType;
import restaurant.order.Order;


public class BurgerPlace implements Restaurant
{
    private Map<Integer,Order>orders;
    private int profit;

    public BurgerPlace()
    {
        this.profit = 0;
        this.orders = new HashMap<>();
    }


    public boolean isDone(int orderNumber)
    {
        return orders.containsKey(orderNumber) && orders.get(orderNumber).isDone();
    }
    
    public boolean makeNextOrder()
    {
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            if (!entry.getValue().isDone()) {
                entry.getValue().isDone();
                return true;
            }
        }
        return false;
    }

    public int order(OrderType type, String item, boolean isInMenu)
    {
        return 0;
    }

    public Order takeOrder(int order)
    {
        if(!orders.containsKey(order))
        {
            throw new IllegalArgumentException();
        }
        else if(orders.get(order).type == OrderType.DELIVERY)
        {
            throw new IllegalArgumentException();
        }
        else if(!orders.get(order).isDone())
        {
            throw new IllegalStateException();
        }
        else
        {
            Order returnOrder = orders.get(order);
            this.profit += orders.get(order).getPrice();
            orders.remove(order);
            return returnOrder;
        }

    }
    
    //GETTERS AND SETTERS

    public int getProfit()
    {
        return profit;
    }
}
