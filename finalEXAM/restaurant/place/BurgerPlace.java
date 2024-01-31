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
        for (Map.Entry<Integer, Order> entry : this.orders.entrySet()) {
            if (entry.getValue().isDone() == false) 
            {
                entry.getValue().make();
                return true;
            }
            System.out.println("hola");
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().item);
        }
        return false;
    }

    public int order(OrderType type, String item, boolean isInMenu)
    {
        Order o1 = new Order(type, item, isInMenu);
        orders.put(o1.orderNumber, o1);
        return o1.orderNumber;
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
