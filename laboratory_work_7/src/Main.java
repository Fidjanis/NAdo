import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Body[]f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Write quantity");
        int k=sc.nextInt();
        f=new Body[k];
        for(int i=0;i<k;i++)
        {
            System.out.println("Write type");
            int p=sc.nextInt();
            if(p==1)
            {
                System.out.println("Write r");
                double r=sc.nextDouble();
                Shar shar =new Shar(r);
                f[i]=shar;
            }
            if(p==2)
            {
                System.out.println("Write a,b,c");
                double a=sc.nextDouble();
                double b1=sc.nextDouble();
                double c=sc.nextDouble();
                Paral paral =new Paral(a,b1,c);
                f[i]=paral;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.println("S= "+f[i].S()+" "+"V="+f[i].V());
        }
    }
}