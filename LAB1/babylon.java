
public class babylon 
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        double x= Double.parseDouble(System.console().readLine());
        System.out.println("Please enter a precission number");
        double p= Double.parseDouble(System.console().readLine());

        double guess = x/2.0;

        while(Math.abs(x - guess * guess) > p )
        {
            int i = 0;
            guess = 0.5 * (guess + x/guess);
            i++;
            System.out.println("Iteration: " + i + "root: " +  guess);
        }

        System.out.printf("The square root of %.6f is %.6f with a precision of %.6f\n", x, guess, p);

    }
    
}
