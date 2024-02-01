package restaurant.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params .ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;

import restaurant.order.Order;
import restaurant.order.OrderType;
import restaurant.place.BurgerChain;

public class BurgerChainTest 
{
    @Test
    public void testOrderProcess()
    {
        BurgerChain bc = new BurgerChain("Best Burgers");
        bc.order(OrderType.TAKEAWAY, "Bacon Burger", false);
        bc.order(OrderType.DINE_IN, "Double Cheeseburger", true);
        bc.saveData();
    }

    
}
