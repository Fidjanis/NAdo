import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       TreeSet<Integer> set=new TreeSet<Integer>();
       Myset myset=new Myset(set);
       myset.fillSet();
       myset.print();
       Myset simple=myset.simple();
       System.out.println("New set");
       simple.print();
       TreeSet<Integer>s=new TreeSet<Integer>();
       Myset ms =new Myset(s);
       ms.fillSet();
       Myset union=myset.intersection(ms);
       System.out.println("Union: ");
       union.print();
    }
}