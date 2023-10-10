import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Wtite info for car");
        System.out.println("Write mark");
        String marka=sc.nextLine();
        System.out.println("Write Number");
        String number=sc.nextLine();
        System.out.println("Write vin");
        String vin=sc.nextLine();
        System.out.println("Write year");
        int year=sc.nextInt();
        System.out.println("Write Vol");
        double vol=sc.nextDouble();
        System.out.println("Write price");
        int price=sc.nextInt();
        System.out.println("Write probeg");
        int km= sc.nextInt();
        Avto a =new Avto(marka,number,vin,year,vol,price,km);
        System.out.println("Info of Avto");
        System.out.println(a.toString());

        String q=sc.nextLine();
        System.out.println("Write FIO of driver");
        String f=sc.nextLine();
        System.out.println("Write cost of one km");
        int pricekm=sc.nextInt();
        Taxi t=new Taxi(marka,number,vin,year,vol,price,km,f,pricekm);
        System.out.println("Write range");
        double km1= sc.nextDouble();
        System.out.println("Cost of trip"+t.stoim(km1));
        System.out.println("Info of taxi");
        System.out.println(t.toString());
    }
}