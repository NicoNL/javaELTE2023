package restaurant.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params .ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;


import restaurant.order.Order;
import restaurant.order.OrderType;
import restaurant.place.Restaurant;
import restaurant.place.BurgerPlace;



public class BurgerPlaceTest 
{
    @Test
    public void testOrderProcess()
    {
        BurgerPlace bp = new BurgerPlace();

        assertEquals(0,bp.getProfit());
        
        int o1 = bp.order(OrderType.TAKEAWAY, "Bacon Burger", false);
        assertEquals(false,bp.isDone(o1));

        int o2 = bp.order(OrderType.DINE_IN, "Double Cheeseburger", true);
        assertEquals(o2,o1+1);
        assertEquals(false,bp.isDone(o2));


        assertEquals(true,bp.makeNextOrder());
        assertEquals(false,bp.isDone(o2));
        assertEquals(0,bp.getProfit());
  



    }
    
}
