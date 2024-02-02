public class CircleMain 
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1,1,3);
        circle.enlarge(2);
        System.out.println("The new radius is: " + circle.radius);

        circle.getArea();

    }
     
}
