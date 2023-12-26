import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner scl=new Scanner(System.in);
        System.out.println("Write quantity");
        int n=sc.nextInt();
        School sg=new School();
        for(int j=0;j<n;j++)
        {
            System.out.println("Write fio");
            String fio=scl.nextLine();
            System.out.println("write klass");
            int klass=sc.nextInt();
            Pupil pu=new Pupil(fio,klass);
            sg.add(pu);
        }
        System.out.println("Who is our goal?");
        String f=scl.nextLine();
        int kl=sc.nextInt();
        sg.del(f,kl);
        sg.sortByName();
        sg.print();
        System.out.println();
        sg.sortByKlass();
        sg.print();
    }
}