public class Student {
    String Fio;
    String adress;
    int kurs;
    String fakulty;
    int[] arr=new int [4];
    Student(String Fio, String adress,int kurs,String fakulty, int[]arr)
    {
        this.Fio=Fio;
        this.adress=adress;
        this.kurs=kurs;
        this.fakulty=fakulty;
        this.arr=arr;
    }

    public int getKurs() {
        return kurs;
    }

    public int[] getArr() {
        return arr;
    }

    public String getFio() {
        return Fio;
    }

    public String getAdress() {
        return adress;
    }

    public String getFakulty() {
        return fakulty;
    }

    public void setFio(String fio) {
        Fio = fio;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setFakulty(String fakulty) {
        this.fakulty = fakulty;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    void ToString()
    {
        System.out.println("Student: "+Fio+" "+"Kurs: "+kurs+" "+"adress: "+adress+" "+"fakulty: "+fakulty+"Marks: ");
        for(int a:arr)
        {
            System.out.println(a +" ");
        }
    }
}
