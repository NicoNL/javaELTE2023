package pointless;

import point2d.Point;

public class AnotherMain 
{
    public static void main(String[] args)
    {
        point2d.Point point1 = new Point(1,1);
        //point2d.Point point2 = new Point(2,2);
        point1.move(1, 1);
        System.out.println("The x is: " + point1.x + ", and the y is " + point1.y);
    }
    
}
