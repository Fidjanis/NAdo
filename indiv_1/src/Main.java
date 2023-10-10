import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write info for car");
        System.out.println("Write Marka");
        String marka=sc.nextLine();
        System.out.println("Write Power");
        int power=sc.nextInt();
        System.out.println("Write Vol");
        double vol=sc.nextDouble();
        Avto a =new Avto(marka,vol,power);
        System.out.println("Info of Avto");
        System.out.println(a.toString());
        System.out.println("Write payload");
        int payload=sc.nextInt();
        Truck t =new Truck(marka,vol,power,payload);
        System.out.println("Write what payload is required");
        int p=sc.nextInt();
        t.prov(p);
        }
    }
