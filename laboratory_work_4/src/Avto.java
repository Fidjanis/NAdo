import java.util.*;
public class Avto {
    private String marka;
    private String number;
    private String vin;
    private int year;
    private double vol;
    private int price;
    private int km;
    Avto (String marka,String number, String vin, int year, double vol, int price, int km)
    {
        this.marka=marka;
        this.number=number;
        this.vin=vin;
        this.year=year;
        this.vol=vol;
        this.price=price;
        this.km=km;
    }
    public String toString(){
        return "Marka: "+marka+"\n Nomer: "+number+"\n Vin: "+vin+"\n God: "+year+"\n Obiom dvigatelya: "+vol+"\n Cena: "+price+"\n Probeg: "+km;
    }
}
