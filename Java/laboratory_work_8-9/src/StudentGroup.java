import java.util.ArrayList;
import java.util.Comparator;

public class StudentGroup {
    ArrayList<Student> a;
    StudentGroup(){
        a=new ArrayList<Student>();
    }
    void add(Student s){
        a.add(s);
    }
    /*void del(String fio){
        int p=-1;
        for(int i=0;i<a.size();i++)
            if(fio.equalsIgnoreCase(a.get(i).getFio()))p=i;
        if(p>-1){
            a.remove(p);
            System.out.println("Del Student "+fio);
        }
        else
            System.out.println("Takogo Studenta nema");
    }*/
    Student search(String fio){
        int p=-1;
        for(int i=0;i<a.size();i++)
            if(fio.equalsIgnoreCase(a.get(i).getFio()))p=i;
        if(p>-1){
            System.out.println("Student naiden "+fio);
            Student s=a.get(p);
            return s;
        }

        else {
            System.out.println("Takogo Studenta nema");
            return null;
        }
    }
    void print(){
        for(int i=0;i<a.size();i++)
            a.get(i).ToString();
    }
    void sortByName(){
        Student s=new Student();
        a.sort(Student.NameComparator);
    }
    void sortByKurs(){
        Student s=new Student();
        a.sort(Student.KursComparator);
    }
}
