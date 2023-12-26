import java.util.ArrayList;
import java.util.Comparator;

public class School {
    ArrayList<Pupil> a;
    School(){
        a=new ArrayList<Pupil>();
    }
    void add(Pupil s){
        a.add(s);
    }
    void del(String fio,int klass){
        int p=-1;
        for(int i=0;i<a.size();i++)
            if(fio.equalsIgnoreCase(a.get(i).getFio())& klass==a.get(i).getKlass())p=i;
        if(p>-1){
            a.remove(p);
            System.out.println("Del Pupil "+fio);
        }
        else
            System.out.println("Takogo Pupila nema");
    }
    Pupil search(String fio,int klass){
        int p=-1;
        for(int i=0;i<a.size();i++)
            if(fio.equalsIgnoreCase(a.get(i).getFio())& klass==a.get(i).getKlass())p=i;
        if(p>-1){
            System.out.println("Pupil naiden "+fio);
            Pupil s=a.get(p);
            return s;
        }

        else {
            System.out.println("Takogo Pupila nema");
            return null;
        }
    }
    void print(){
        for(int i=0;i<a.size();i++)
            a.get(i).ToString();
    }
    void sortByName(){
        Pupil s=new Pupil();
        a.sort(Pupil.NameComparator);
    }
    void sortByKlass(){
        Pupil s=new Pupil();
        a.sort(Pupil.KlassComparator);
    }
}
