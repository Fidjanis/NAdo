package djen;
import java.util.*;
public class Mass<T> {
    T[]a;
    public Mass(T[] a){
        this.a=a.clone();
    }
    public void print()
    {
        System.out.println("Massiv:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public T elemByInd(int i) throws ArrayIndexOutOfBoundsException
    {
        if(i<0 || i>a.length)
            throw new ArrayIndexOutOfBoundsException("Vihod za granizi indexa");
        return a[i];
    }
    public void chast(int p) throws ArrayIndexOutOfBoundsException
    {
        if(p<0 || p>a.length)
            throw new ArrayIndexOutOfBoundsException("Vihod za granizi indexa");
        for(int i=0;i<p;i++)
            System.out.print(a[i]+" ");
    }
}
