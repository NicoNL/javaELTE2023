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
        int o1 =bc.order(OrderType.TAKEAWAY, "Bacon Burger", false);
        int o2 = bc.order(OrderType.DINE_IN, "Double Cheeseburger", true);

        boolean oo1 = bc.makeNextOrder();
        boolean oo2 = bc.makeNextOrder();
        Order oc1 = bc.takeOrder(o1);
        Order oc2 = bc.takeOrder(o2);

        bc.saveData();
    }

    @Test
    public void testTwoPlaces()
    {
       BurgerChain bc1 = new BurgerChain("H-burger");
       BurgerChain bc2 = new BurgerChain("H-burger");

       int o1 = bc1.order(OrderType.TAKEAWAY, "Bacon Burger", false);
       int o2 = bc2.order(OrderType.DINE_IN, "Double Cheeseburger", true);

       boolean oo1 = bc1.makeNextOrder();
       boolean oo2 = bc2.makeNextOrder();

       Order oc1 = bc1.takeOrder(o1);
       Order oc2 = bc2.takeOrder(o2);

       assertEquals(bc1,bc2);
    }
}
