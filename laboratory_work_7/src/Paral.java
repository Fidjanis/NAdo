public class Paral implements Body {
    double a,b,c;
    Paral(double a, double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double V(){
        return a*b*c;
    }
    public double S(){
        return 2*(a*b*c+a*c);
    }
    public void print(){
        System.out.println("Paral = "+a+" "+b+" "+c);
    }

}
