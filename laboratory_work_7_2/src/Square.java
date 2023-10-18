class Square implements Figure{
    double a;
    Square(double a){
        this.a=a;
    }
    public double S(){
        return a*a;
    }
    public double P()
    {
        return 4*a;
    }
    public void print()
    {
        System.out.println("Square= "+a);
    }
}
