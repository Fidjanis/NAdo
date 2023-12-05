public class Data {
    int d,m,y;
    final int arr[]={1, 31,28,31,30,31,30,31,31,30,31,30,31};
    Data(int d,int m,int y) throws MyException
    {
        if(y<0 || m<0 || d<0 ||  m>12 || arr[m]<d) throw new MyException("Very bad",d,m,y);
        this.d=d;
        this.m=m;
        this.y=y;

    }
    void print(){
        System.out.println(d+"."+m+"."+y);
    }
    /*String plus_days(int days)
    {

    }*/
}
