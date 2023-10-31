import java.util.ArrayList;

public class StudentGroup {
    ArrayList<Student> a;
    StudentGroup(){
        a=new ArrayList<Student>();
    }
    void add(Student s){
        a.add(s);
    }
    void del(String fio){
        int p=-1;
        for(int i=0;i<a.size();i++)
            if(fio.equalsIgnoreCase(a.get(i).getFio()))p=i;
        if(p>-1){
            a.remove(p);
            System.out.println("Del Student "+fio);
        }
        else
            System.out.println("Takogo Studenta nema");
    }
    void print(){
        for(int i=0;i<a.size();i++)
            a.get(i).ToString();
    }
}
