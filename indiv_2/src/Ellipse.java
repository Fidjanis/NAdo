public class Ellipse implements Function {
    double x;
    double y;
    double a;
    double b;
    Ellipse(double x,double y,double a,double b)
    {
        this.x=x;
        this.y=y;
        this.a=a;
        this.b=b;
    }
    public double calc()
    {
        return ((x*x)/(a*a)+(y*y)/(b*b))-1;
    }
    public void print()
    {
        System.out.println(calc());
    }
}
