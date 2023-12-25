package restaurant.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params .ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


import restaurant.order.Order;
import restaurant.order.OrderType;;


public class OrderTest 
{
    @Test
    public void testOrder()
    {
        Order order1 = new Order(OrderType.DINE_IN, "Hamburguer", false);
        Order order2 = new Order(OrderType.DINE_IN, "Hamburguer", true);
        Order order3 = new Order(OrderType.DELIVERY, "Hamburguer", false);
        Order order4 = new Order(OrderType.DELIVERY, "Hamburguer", true);
     
        assertEquals(2490,order1.getPrice());
        assertEquals(3080,order2.getPrice());
        assertEquals(3480,order3.getPrice());
        assertEquals(4070,order4.getPrice());
    }

    @Test
    public void testMake()
    {
        Order order1 = new Order(OrderType.DINE_IN, "Hamburguer", false);
        assertEquals(false,order1.isDone());
        order1.make();
        try
        {
            assertEquals(true,order1.isDone());
        }
        catch(IllegalStateException e)
        {

        }
    }
    
}
