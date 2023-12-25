package restaurant.order;

public class Order 
{
    public OrderType type;
    public String item;
    public final boolean isInMenu;
    private final int price = 2490;
    private final int orderNumber = 1;
    static private int nextOrderNumber = 1;
    private boolean isDone = false;

    public Order(OrderType type, String item, boolean isInMenu)
    {
        this.type = type;
        this.item = item;
        this.isInMenu = isInMenu;
        nextOrderNumber++;
        int finalPrice = getPrice();
    }

    public void make()
    {
        isDone = true;
    }

    public boolean isDone()
    {
        if(isDone == true)
        {
            throw new IllegalStateException("Hamburger is Done");
        }
        else
        {
            return isDone;
        }
    }

    // GETTERS AND SETTER

    public int getPrice()
    {
        int finalPrice = this.price;
        if(isInMenu == true)
        {
            finalPrice += 590;
        }
        if(type == OrderType.DELIVERY)
        {
            finalPrice += 990;
        }
        return finalPrice;
    }
    
}
