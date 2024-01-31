package restaurant.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params .ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


import restaurant.order.Order;
import restaurant.order.OrderType;
import restaurant.place.Restaurant;
import restaurant.place.BurgerPlace;



public class BurgerPlaceTest 
{
    @Test
    public void testOrderProcess()
    {
        //Order order1 = new Order(OrderType.DINE_IN, "Hamburguer", false);
        BurgerPlace bp = new BurgerPlace();

        assertEquals(0,bp.getProfit());
    }
    
}
