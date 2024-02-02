public class LineMain
{
    public static void main(String[] args)
    {
        Point point1 = new Point(1,1);
        Line line1 = new Line(6,2,8);
        Line line2 = new Line(12,4,5);
        Line line3 = new Line(2,-6,6);

        line1.contains(point1);
        line1.isParallelWith(line2);
        line1.isOrthogonalTo(line3);
    }
    
}