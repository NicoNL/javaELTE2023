public class Circle 
{
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void enlarge(double f)
    {
        this.radius *= 2;
    }
    
    void getArea()
    {
        double area = Math.PI * this.radius * this.radius;
        System.out.println("The area is: " + area);
    }
}
