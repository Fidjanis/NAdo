import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Myset {
    TreeSet<Integer>set;
    Myset(TreeSet<Integer>set)
    {
        this.set=set;
    }
    TreeSet<Integer>getSet()
    {
        return set;
    }
    void fillSet(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Write el");
        int x =sc.nextInt();
        while(x!=0)
        {
            set.add(x);
            x= sc.nextInt();
        }
    }
    void print(){
        Iterator it=set.iterator();
        System.out.println("My set: ");
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }
        System.out.println();
    }
    Myset notsimple() {
        TreeSet<Integer> set1 = set;
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            int k = 0;
            Integer x = (Integer) it.next();
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    k++;
            if (k == 2)
                it.remove();
        }
        return new Myset(set1);
    }
    Myset union(Myset a){
        TreeSet<Integer>set1=a.getSet();
        TreeSet<Integer>res=set;
        Iterator it=set1.iterator();
        while(it.hasNext())
            res.add((Integer)it.next());
        return new Myset(res);
    }
    Myset simple() {
        TreeSet<Integer> set1 = set;
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            int k = 0;
            Integer x = (Integer) it.next();
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    k++;
            if (k>2 || x==1)
                it.remove();
        }
        return new Myset(set1);
    }
    Myset intersection(Myset a)
    {
        TreeSet<Integer>set1=a.getSet();
        TreeSet<Integer>set2=set;
        Iterator it1=set1.iterator();
        Iterator it2=set2.iterator();
        while(it1.hasNext()& it2.hasNext()){
            if(it1.next()==it2.next())
            {
                it1.remove();
            }
        }
        return new Myset(set1);
    }
}
