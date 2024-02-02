public class Segment 
{
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public Segment(double x1,double y1,double x2,double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    Line line()
    {
        double m =(this.y2-this.y1)/(this.x2-this.x1);
        double a= this.x2 - this.x1;
        double b= this.y2 - this.y1;
        double c = a+b;
        Line line = new Line(a,b,c);
        return line;
    }
    boolean contains(Point p)
    {
        Line lin = line();
        boolean segment = false;
        double sum = (lin.a * p.x) + (lin.b * p.y);
        if(sum == lin.c)
        {
            System.out.println("Yes, this point is on the segment");
            segment = true;
            return segment;
        }
        else
        {
            System.out.println("No, this point is not on the segment");
            return segment;
        }
    }
    double orientation(Point p)
    {
        double left= (this.y2 - this.y1)*(p.x -this.x2);
        double right=(p.y -this.y2)*(this.x2-this.x1);
        double orientation = left-right;
        System.out.println("The orientation is: " + orientation);
        return orientation;
    }


}
