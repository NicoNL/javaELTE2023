
public class GreetingName
{
    public static void main(String []aStrings)
    {
        System.out.println("Please write your name");
        String name = System.console().readLine();
        System.out.println("Hello " + name);
    }
}