
public class factNumber 
{
    public static void main(String []args)
    {
       if(args.length < 1)
       {
            System.out.println("No arguments was given");
       } 
       else
       {
            int x = Integer.parseInt(args[0]);
            int factorial = x;
            for(int i = 2; i < x; i++)
            {
                factorial *= i;
            }
            System.out.println(factorial);
       }
    }
}

//please change the names of all your files to something meaningful that 
