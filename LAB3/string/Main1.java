import stringmain.Main;

public class Main1
{
    public static void main(String[] args)
    {
        if(args.length < 4)
        {
            System.out.println("Not enough arguments were given");
        }
        else
        {
            stringmain.Main m = new Main();
            m.main(args);
        }
    }
    
}