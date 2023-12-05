import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write coordinates p1");
        int a1=sc.nextInt();
        int b1= sc.nextInt();
        Point p1=new Point(a1,b1);
        System.out.println("Write coordinates p2");
        a1= sc.nextInt();
        b1= sc.nextInt();
        Point p2=new Point(a1,b1);
        System.out.println("Write coordinates p3");
        a1= sc.nextInt();
        b1= sc.nextInt();
        Point p3=new Point(a1,b1);
        Triangle t1= new Triangle(p1,p2,p3);
        double p=t1.perimeter();
        System.out.println(p);
        double s=t1.square();
        System.out.println(s);
    }
}