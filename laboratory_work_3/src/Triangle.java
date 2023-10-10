public class Triangle {
    private Point a,b,c;
    Triangle(Point p1,Point p2,Point p3)
    {
            this.a = p1;
            this.b=p2;
            this.c=p3;

    }
    boolean check(){
        if(getA()+getB()>getC() && getB()+getC()>getA() && getC()+getA()>getB())
            return true;
        return false;
    }
    double getA(){return a.dist(b);}
    double getB(){return b.dist(c);}
    double getC(){return c.dist(a);}
    double perimeter ()
    {
        if(check())
            return (getA()+getB()+getC());
        return 0;
    }
    double square()
    {
        if(check())
        {
            double polu=perimeter()/2;
            return Math.sqrt(polu*(polu-getA())*(polu-getB())*(polu-getC()));
        }
        return 0;
    }
}
