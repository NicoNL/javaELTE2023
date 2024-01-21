
public class HelloGoodbye
{
    public static void main(String[]args)
    {
        if(args.length == 0)
        {
            System.out.println("No arguments were given");
        }
        else
        {
            System.out.println("Hello " + args[0] + " and " + args[1]);
            System.out.println("Goodbye " + args[0] + " and " + args[1]);


        }
    }
}