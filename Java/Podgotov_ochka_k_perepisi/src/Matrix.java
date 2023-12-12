import java.util.Random;

public class Matrix {
    int [][]a;
    Matrix(int n){
        a=new int[n][n];
        Random r=new Random();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=r.nextInt(50);
    }
    boolean poryadok(){
        for(int i=0;i<a.length-1;i++)
            for(int j=0;j<a.length;j++)
        {
            if(a[i][j]<a[i+1][j])
                return false;
        }
        return true;
    }
    double sred(){
        double k=0,s=0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
        {
            if(!Function.simple(a[i][j])){
                k++;
                s+=a[i][j];
            }
        }
        return s/k;
    }
    void print(){
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
