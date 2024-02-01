package restaurant.place;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

import java.util.List;
import restaurant.order.Order;

public class BurgerChain extends BurgerPlace
{
    private String name;
    private List<Order> pastOrders;

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BurgerChain bc = (BurgerChain) obj;
        return name.equals(bc.name) && pastOrders.equals(bc.pastOrders);
    }
    public BurgerChain(String name)
    {
        super();
        this.name = name;
        this.pastOrders = new ArrayList<>();
    }

    public void saveData()
    {
        String filePath = "data-" + this.name + ".txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            writer.write(this.name+"\n");
            for(int i = 0; i < pastOrders.size(); i++)
            {
                String item = pastOrders.get(i).item;
                String menu;
                String type = pastOrders.get(i).type.name();
                if(pastOrders.get(i).isInMenu)
                {
                    menu = "without a menu";
                }
                else
                {
                    menu = "in a menu";
                }
                writer.write("#" + i+1 + ". " + item + " - " + menu + " (" + type + ")\n"); 
            }
        }
        catch(IOException e)
        {

        }
    }
    @Override
    public Order takeOrder(int order)
    {
        Order orderClass =super.takeOrder(order);
        pastOrders.add(orderClass);
        return orderClass;
    }
}
