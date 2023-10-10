public class Avto {
    private String marka;
    private int power;
    private double vol;

    Avto(String marka, double vol, int power) {
        this.marka = marka;
        this.power = power;
        this.vol = vol;
    }

    public String toString() {
        return "Marka: " + marka + "\n Power: " + power + "\n Vol: " + vol;
    }

    void setmarka() {
        this.marka = marka;
    }

    void setpower() {
        this.power = power;
    }

    void setvol() {
        this.vol = vol;
    }
}