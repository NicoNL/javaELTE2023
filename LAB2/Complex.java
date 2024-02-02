public class Complex 
{
    public double re;
    public double im;

    public Complex(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    double Abs()
    {
        double re2 = this.re * this.re;
        double im2 = this.im * this.im;
        return Math.sqrt(re2+im2);
    }

    void Add(Complex complex)
    {
        System.out.println("alpha.re == "  + (complex.re + this.re) + " && alpha.im == " + (complex.im + this.im) + " && beta.re == " + complex.re + " beta.im == " + complex.im);

    }
    void Sub(Complex complex)
    {
        System.out.println("alpha.re == "  + (this.re - complex.re) + " && alpha.im == " + (this.im - complex.im) + " && beta.re == " + complex.re + " beta.im == " + complex.im);
    }
    void Mul(Complex complex)
    {
        System.out.println("alpha.re == "  + (this.re * complex.re) + " && alpha.im == " + (this.im * complex.im) + " && beta.re == " + complex.re + " beta.im == " + complex.im);
    }
    

    
}
