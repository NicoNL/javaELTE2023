public class SegmentMain 
{
    public static void main(String[] args)
    {
        Segment segment1 = new Segment(2, 2, 3, 3);
        Point point1 = new Point(1,1);
        segment1.contains(point1);
        segment1.orientation(point1);
    }
    
}
