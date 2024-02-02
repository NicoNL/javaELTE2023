public class ComplexMain 
{
    public static void main(String[] args)
    {
        Complex complex1 = new Complex (4,3);
        Complex complex2 = new Complex (1,1);

        System.out.println("The absolute value of alpha is: " + complex1.Abs());
        complex1.Add(complex2);
        complex1.Sub(complex2);
        complex1.Mul(complex2);
    }

}
