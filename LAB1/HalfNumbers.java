
import java.util.Scanner;

public class HalfNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        if(args.length <= 1)
        {
            System.out.println("Please enter two numbers:");
            System.out.println("Please enter the first number:");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter the second one:");
            int y = Integer.parseInt(scanner.nextLine());
            for(int i = x; i <= y; i++)
            {
                System.out.println(i/2);
            }

        }
        else
        {
            double x = Integer.parseInt(args[0]);
            double y = Integer.parseInt(args[1]);
            for(double i = x; i <= y; i++)
            {
                System.out.println(i/2);
            }
        }
        scanner.close();
    }
}
