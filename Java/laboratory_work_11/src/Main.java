import djen.Mass;

public class Main {
    public static void main(String[] args) {
        Integer[]m1={1,2,3,4,5};
        Mass<Integer>mi=new Mass<>(m1);
        try{
            System.out.println(mi.elemByInd(3));
            mi.print();
            mi.chast(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getMessage();
        }
        Double []m2={1.1,2.2,3.3,4.4,5.5};
        Mass<Double>md=new Mass<>(m2);
        try{
            System.out.println(md.elemByInd(3));
            md.print();
            md.chast(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getMessage();
        }
        String []m3={"123","234","345"};
        Mass<String>ms=new Mass<>(m3);
        try{
            System.out.println(ms.elemByInd(3));
            ms.print();
            ms.chast(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getMessage();
        }

    }
}