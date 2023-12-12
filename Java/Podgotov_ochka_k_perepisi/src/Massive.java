import java.util.Random;

public class Massive {
    int []a;
    Massive(int n){
        a=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++)
            a[i]=r.nextInt(50);
    }
    boolean poryadok(){
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
                return false;
        }
        return true;
    }
    double sred(){
        double k=0,s=0;
        for(int i=0;i<a.length;i++)
        {
            if(!Function.simple(a[i])){
                k++;
                s+=a[i];
            }
        }
        return s/k;
    }
    void print(){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
