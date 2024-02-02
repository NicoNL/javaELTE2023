public class DistanceMain 
{
    public static void main(String[] args)
    {
        if (args.length < 2 || (args.length % 2 == 1) )
        {
            System.out.println("Incorrect amount of given arguments");
        }
        else
        {
            double sum = 0;
            Point point1 = new Point(0,0);
            Point point2 = new Point(0,0);
            for(int i = 0; i < args.length-2; i +=2 )
            {
                point1.x = Double.parseDouble(args[i]);
                point1.y = Double.parseDouble(args[i+1]);
                point2.x = Double.parseDouble(args[i+2]);
                point2.y = Double.parseDouble(args[i+3]);

                sum += point1.distance(point2);
            }
            System.out.println("The sum of the distances is: " + sum);
        }
        
    }
}
