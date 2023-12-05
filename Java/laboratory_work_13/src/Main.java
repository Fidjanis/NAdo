import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyList l =new MyList();
        l.createlist();
        System.out.println("List: ");
        l.print();
        System.out.println();
        System.out.println("List reverse: ");
        l.print_reverse();
        //l.del("111");
        System.out.println("List: ");
        l.print();
        System.out.println();
        //l.delffe("5");
        //l.dubl();
        l.dubl_con();
        l.print();
    }
}