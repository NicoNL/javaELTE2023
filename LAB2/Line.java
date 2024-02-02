public class Line
{
    public double a;
    public double b;
    public double c;

    public Line(double a,double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean contains(Point p)
    {
        boolean segment = false;
        double sum = (this.a * p.x) + (this.b * p.y);
        if(sum == this.c)
        {
            System.out.println("Yes, this point is on the line");
            segment = true;
            return segment;
        }
        else
        {
            System.out.println("No, this point is not on the line");
            return segment;
        }
    }
    boolean isParallelWith(Line l)
    {
        boolean pChecker = false;
        double co1 = this.a / this.b;
        double co2 = l.a / l.b;
        if(co1 == co2)
        {
            pChecker = true;
            System.out.println("Yes, the lines are Parallel to each other");
            return pChecker;
        }
        else
        {
            System.out.println("No, the lines are not Parallel to each other");
            return pChecker;
        }
    }
    boolean isOrthogonalTo(Line l)
    {
        boolean oChecker = false;
        double aa = this.a * l.a;
        double bb = this.b * l.b;
        if((aa + bb) == 0)
        {
            oChecker = true;
            System.out.println("Yes, the lines are Orthogonal to each other");
            return oChecker;
        }
        else
        {
            System.out.println("No, the lines are not Orthogonal to each other");
            return oChecker;
        }
    }
    
}
