package restaurant.place;

import java.util.Map;
import restaurant.order.Order;


public class BurgerPlace implements Restaurant
{
    private Map<Integer,Order>orders;
    private int profit;


    public boolean isDone(int OrderNumber)
    {
        return true;
    }
    
    public boolean makeNextOrder()
    {
        return true;
    }

    public int order(Order type, String item, boolean isInMenu)
    {
        return 0;
    }

    public Order takeOrder(int order)
    {
        return null;
    }
    
    //GETTERS AND SETTERS

    public int getProfit()
    {
        return profit;
    }
}
