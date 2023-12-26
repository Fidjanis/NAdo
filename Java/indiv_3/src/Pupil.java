import java.util.Comparator;

public class Pupil{
    String Fio;
    int klass;
    Pupil(String Fio,int klass)
    {
        this.Fio=Fio;
        this.klass=klass;
    }
    Pupil(){
        Fio="Z";
        klass=3;
    }
    public int getKlass() {
        return klass;
    }
    public String getFio() {
        return Fio;
    }
    public void setFio(String fio) {
        Fio = fio;
    }

    public void setKlass(int kurs) {
        this.klass = klass;
    }
    void ToString()
    {
        System.out.println("Pupil: "+Fio+" "+"Klass: "+klass);

    }
    /*public int compare(Pupil s1,Pupil s2)
    {
        return s1.getKurs()-s2.getKurs();
    }*/
    public static Comparator<Pupil> NameComparator=new Comparator<Pupil>() {
        @Override
        public int compare(Pupil s1, Pupil s2) {
            return s1.getFio().compareTo(s2.getFio());
        }
    };
    public static Comparator<Pupil> KlassComparator=new Comparator<Pupil>() {
        @Override
        public int compare(Pupil o1, Pupil o2) {
            return o1.getKlass()-o2.getKlass();
        }
    };
}
