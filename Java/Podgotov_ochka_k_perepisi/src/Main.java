import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        Massive a=new Massive(n);
        boolean f=a.poryadok();
        double s=a.sred();
        a.print();
        System.out.println(s);*/
        Root[] equations = new Root[2];
        equations[0] = new LinearEquation(2, -3);
        equations[1] = new QuadraticEquation(1, -5, 6);

        for (Root equation : equations) {
            equation.displayInfo();
            equation.calculateRoots();
            System.out.println();
        }
    }
}