package plane;

public class Circle 
{
    private double x;
    private double y;
    private double radious;

    public Circle(double x, double y, double radious)
    {
        if(radious <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.radious = radious;
    }
    public double getX() 
    {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadious() {
        return radious;
    }
    public void setRadious(double radious) {
        if(radious <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.radious = radious;
    }
    

}
