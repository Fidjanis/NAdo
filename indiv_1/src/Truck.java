class Truck extends Avto{
    private int payload;
    Truck (String marka, double vol, int power, int payload) {
        super(marka,vol,power);
        this.payload=payload;
    }
    int setpayload(){
        return this.payload=payload;
    }
    public String toString() {
        return super.toString()+"\n Payload: " + payload ;
    }

    void prov(int a) {
        if(payload>a)
            System.out.println("Payload is OK");
        else System.out.println(("Payload is not OK"));
    }


}
