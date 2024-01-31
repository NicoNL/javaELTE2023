package restaurant.place;

import static org.junit.jupiter.api.Assertions.assertEquals;

import restaurant.order.OrderType;

public class BpMain 
{
    public static void main(String[] args) 
    {
        System.out.println("True");

        BurgerPlace bp1 = new BurgerPlace();
        int o1 = bp1.order(OrderType.TAKEAWAY, "Bacon Burger", false);
        int o2 = bp1.order(OrderType.DINE_IN, "Double Cheeseburger", true);
        
        boolean hola = bp1.makeNextOrder();
        if(hola)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    
}
