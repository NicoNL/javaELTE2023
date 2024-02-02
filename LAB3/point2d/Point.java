package point2d;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(double dx,double dy)
    {
       this.x += dx;
       this.y += dy;
    }
    public void mirror(double cx,double cy)
    {
        this.x = 2* cx - x;
        this.x = 2* cy - y;
    }
    public void move(Point point)
    {
        this.x += point.x;
        this.y += point.y;
    }
    public void mirror(Point point)
    {
        this.x = 2 * point.x - x;
        this.y = 2 * point.y - y;
    }
    public double distance(Point point1)
    {
        double xdiff = this.x-point1.x;
        double ydiff = this.y-point1.y;
        double distance = (xdiff * xdiff) + (ydiff * ydiff);
        return Math.sqrt(distance);
    }

}
