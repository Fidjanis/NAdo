public class Rect extends Square implements Figure{
    double b;
    Rect(double b,double a){
        super(a);
        this.b=b;
    }
    public double P()
    {
        return 2*(a+b);
    }
    public double S() {
        return a*b;
    }
    public void print() {
        System.out.println("Rect ="+a+" "+b);
    }
}
