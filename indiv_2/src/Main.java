import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Function[]f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Write quantity");
        int n=sc.nextInt();
        f=new Function[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Write type");
            int flag=sc.nextInt();
            if(flag==1)
            {
                System.out.println("Write x");
                double x=sc.nextDouble();
                System.out.println("Write y");
                double y=sc.nextDouble();
                System.out.println("Write a");
                double a=sc.nextDouble();
                System.out.println("Write b");
                double b=sc.nextDouble();
                Ellipse ellipse=new Ellipse(x,y,a,b);
                f[i]=ellipse;
            }
            if(flag==2)
            {
                System.out.println("Write x");
                double x=sc.nextDouble();
                System.out.println("Write y");
                double y=sc.nextDouble();
                System.out.println("Write a");
                double a=sc.nextDouble();
                System.out.println("Write b");
                double b=sc.nextDouble();
                Hyberbola hyberbola=new Hyberbola(x,y,a,b);
                f[i]=hyberbola;
            }

        }
        for(int i=0;i<n;i++)
        {
            f[i].print();
        }
    }
}