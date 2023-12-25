package restaurant.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import restaurant.order.*;


public class OrderTest 
{
    @Test
    public void testOrder()
    {
        Order order1 = new Order(OrderType.DINE_IN, "Hamburguer", false);
        assertEquals(2450,order1.getPrice());

    }

    
}
