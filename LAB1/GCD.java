import java.util.Arrays;

public class GCD 
{
    public static void main(String[] args)
    {
        if(args.length < 1)
        {

            System.out.println( args.length + "Not enough arguments given");
        }
        else
        {
            long[] number = new long[args.length];
            for(int i =0; i < args.length;i++)
            {
                number[i] = Long.parseLong(args[i]);
            }
            Arrays.sort(number);
            long divisor= GCDproducer(number);
            System.out.println(divisor + " is the GCD");

        }
    }
    public static long GCDproducer(long[] arr)
    {
        long x= 0;
        for(int i = (int)(arr[arr.length-1])/2;i >=1;i--)
        {
            boolean GCDchecker = true;
            for(int j=0; j < arr.length && GCDchecker;j++)
            {
                if(arr[j] % i != 0)
                {
                    GCDchecker =false;
                }
            }
            if(GCDchecker)
            {
                    x = i;
                    return x;
            }
                
        }
        return x;
    }
}
