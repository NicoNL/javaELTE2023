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
        
        int o1Num = bp.order(OrderType.TAKEAWAY, "Bacon Burger", false);
        assertEquals(false,bp.isDone(o1Num));

        int o2Num = bp.order(OrderType.DINE_IN, "Double Cheeseburger", true);
        assertEquals(o2Num,o1Num+1);
        assertEquals(false,bp.isDone(o2Num));

        boolean b1 = bp.makeNextOrder();
        assertEquals(true,bp.isDone(o1Num));
        assertEquals(false,bp.isDone(o2Num));
        assertEquals(0,bp.getProfit());

        Order o1 = bp.takeOrder(o1Num);
        assertEquals(2490, bp.getProfit());

        boolean b2 = bp.makeNextOrder();
        assertEquals(true,bp.isDone(o2Num));

        Order o2 = bp.takeOrder(o2Num);
        assertEquals(5570, bp.getProfit());

        assertEquals(false,bp.makeNextOrder());




  



    }
    
}
