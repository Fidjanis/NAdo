import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Write quantity");
       int n=sc.nextInt();
       Progress[] p;
       p=new Progress[n];
        System.out.println("Write j");
       int j=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.println("Write type of Progress");
           int s=sc.nextInt();
           if(s==1)
           {
               System.out.println("Write a0,delta for Algebra");
               int a0=sc.nextInt();
               int delta= sc.nextInt();
               String name=sc.nextLine();
               Algebra algebra=new Algebra(a0,delta,"Algebra");
               p[i]=algebra;
           }
           if(s==2) {
               System.out.println("Write a0,delta for Geometry");
               int a0=sc.nextInt();
               int delta= sc.nextInt();
               String name=sc.nextLine();
               Geometry geometry=new Geometry(a0,delta,"Geometry");
               p[i]=geometry;
           }
       }
       for(int i=0;i<n;i++)
       {
           System.out.println("Name of progress="+p[i].name+" Sum of n elements:"+p[i].sum(n)+" j is "+p[i].elem(j));
       }

        }
    }
