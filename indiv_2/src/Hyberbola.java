public class Hyberbola extends Ellipse implements Function  {
    Hyberbola(double x,double y,double a,double b)
    {
        super(x, y, a, b);
    }
    public double calc()
    {
        return ((x*x)/(a*a)-(y*y)/(b*b))-1;
    }
    public void print()
    {
        System.out.println(calc());
    }
}
