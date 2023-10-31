import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner scl=new Scanner(System.in);
        System.out.println("Write quantity");
        int n=sc.nextInt();
        StudentGroup sg=new StudentGroup();
        for(int j=0;j<n;j++)
        {
            System.out.println("Write fio");
            String fio=scl.nextLine();
            System.out.println("Write adress");
            String adress=scl.nextLine();
            System.out.println("write kurs");
            int kurs=sc.nextInt();
            System.out.println("write fakulty");
            String fakulty=scl.nextLine();
            System.out.println("Write quantity of marks");
            int k= sc.nextInt();
            int[]arr=new int[k];
            System.out.println("write marks");
            for(int i=0;i<k;i++)
                arr[i]=sc.nextInt();
            Student st=new Student(fio,adress,kurs,fakulty,arr);
            sg.add(st);
        }
        System.out.println("Who is our goal?");
        String f=scl.nextLine();
        sg.del(f);
        sg.print();

    }
}