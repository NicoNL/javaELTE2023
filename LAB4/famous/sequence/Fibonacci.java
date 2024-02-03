package famous.sequence;

public class Fibonacci
{
    public static void main(String[] args)
    {
       
    }
    public static int fib(int num)
    {
        return num == 1 ? 0 : num == 2 ? 1 : fib(num-1) + fib(num-2);
    }
}
