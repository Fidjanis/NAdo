import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyList {
    LinkedList<String> list;
    MyList(){
        list=new LinkedList<String>();
    }
    void createlist(){
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        while(!s.equals("")){
            list.addLast(s);
            s=sc.nextLine();
        }
    }
    void print(){
        ListIterator<String>it =list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    void print_reverse(){
        ListIterator<String >it =list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
    void del(String s)
    {
        ListIterator<String>it =list.listIterator();
        while(it.hasNext()){
            if(it.next().equals(s))
                it.remove();
        }
    }
    void symmetry(){
        boolean flag=true;
        ListIterator<String>it1=list.listIterator();
        ListIterator<String>it2=list.listIterator(list.size());
        while(it1.hasNext()& it2.hasPrevious() &flag)
        {
            if(!it1.next().equals(it2.previous())) flag=false;
        }
        if(flag) System.out.println("Symmetry");
        else System.out.println("Not symmetry");
    }
    void delffe(String s)
    {
        ListIterator<String >it=list.listIterator(list.size());
        while(it.hasPrevious()){
            if(it.previous().equals(s)) {
                it.remove();
                break;
            }
        }
    }
    void dubl()
    {
        ListIterator<String>it=list.listIterator();
        while(it.hasNext()){
            it.add(it.next());
        }
    }
    void dubl_con(){
        ListIterator<String >it1=list.listIterator(list.size());
        ListIterator<String >it2=list.listIterator();
        while(it2.hasNext()){
            it1.add(it2.next());
        }
    }
}
