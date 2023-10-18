import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[]f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Write quantity");
        int n=sc.nextInt();
        f=new Figure[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Write type");
            int flag=sc.nextInt();
            if(flag==1)
            {
                System.out.println("Write a");
                double a=sc.nextDouble();
                Square square=new Square(a);
                f[i]=square;
            }
            if(flag==2)
            {
                System.out.println("Write a,b");
                double a= sc.nextDouble();
                double b = sc.nextDouble();
                Rect rect =new Rect(a,b);
                f[i]=rect;
            }
            if(flag==3)
            {
                System.out.println("Write a,b,c,d");
                double a=sc.nextDouble();
                double b= sc.nextDouble();
                double c=sc.nextDouble();
                double d =sc.nextDouble();
                Quadrilateral quadrilateral=new Quadrilateral(a,b,c,d);
                f[i]=quadrilateral;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("S= "+f[i].S()+" "+"P= "+f[i].P());
        }
    }
}