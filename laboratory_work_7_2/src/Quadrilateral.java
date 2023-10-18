import static java.lang.Math.sqrt;

public class Quadrilateral extends Rect implements Figure{
    double c,d;
    Quadrilateral(double a, double b,double c,double d) {
        super(a, b);
        this.c=c;
        this.d=d;
    }
    public double P(){
        return a+b+c+d;
    }
    public double S()
    {
        double p=(this.a+this.b+this.c+this.d)/2;
        return sqrt((p-a)*(p-b)*(p-c)*(p-d));
    }
    public void print(){
        System.out.println("Quadrilateral= "+a+" "+b+" "+c+" "+d);
    }
}
