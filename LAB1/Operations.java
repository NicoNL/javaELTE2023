
public class Operations 
{
    public static void main(String[]args)
    {
       try
       {
            if (args.length < 2) 
            {
                throw new IllegalArgumentException("System.err");
            }

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("Sum: " + (x + y));
            System.out.println("Difference: " + (x - y));
            System.out.println("Product: " + (x * y));
            if( y == 0)
            {
                System.out.println("Division and Remainder cannot be performmed because second number is 0");
            }
            else
            {
                double dx = x;
                double dy = y;
                System.out.println("Division: " + (dx / dy));
                System.out.println("Remainder: " + (dx % dy));
            }
       }
       catch(IllegalArgumentException e)
       {
            System.err.println(e.getMessage());
       }
        
    }
    
}
