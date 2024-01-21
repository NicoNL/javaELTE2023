
public class ArgumentName 
{
    public class Point{
        int x,y;
        void move (int dx,int dy)
        {
            x += dx;
            y += dy;
        }
    }
    public static void main(String []args)
    {
        if(args.length == 0 )
        {
           System.out.println("No argument");
        }
        else
        {
            System.out.println("Hello "+ args[0]);

        }
    }

}
