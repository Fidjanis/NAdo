public class Function {
    public static boolean simple(int a){
        int k=0;
        for(int i=2;i<a;i++)
            if(a%i==0)
                k++;
        if(k==0 & a!=1)
            return true;
        return false;
    }

}
