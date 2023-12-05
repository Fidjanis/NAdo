import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input quantity:");
        int n=sc.nextInt();
        List<Integer>l=new List<>();
        for(int i=0;i<n;i++)
        {
            int el=sc.nextInt();
            l.add(el);
        }
        l.remove(2);
        l.print();

    }
}