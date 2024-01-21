
public class PerfectNumber 
{
    public static void main(String []args)
    {
        if(args.length < 1)
        {
            System.out.println("Not enough arguments given");
        }
        else
        {
            int x = Integer.parseInt(args[0]);
            for(int i = 1; i <= x; i++)
            {
                if(Pnumber(i) || i == 1)
                {
                    System.out.println(i + " is a perfect number");
                }
            }
        }
    }
    public static boolean Pnumber(int x)
    {
        boolean p = false;
        int Sum = 0;
        for(int i = 1;i <= x/2;i++)
        {
                
            if(x % i == 0)
            {
                Sum += i;
            }
        }
        if( x == Sum)
        {
            p = true;
        }
        return p;  
    }

    
}
