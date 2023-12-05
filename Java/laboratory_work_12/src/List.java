import java.lang.invoke.CallSite;

public class List<Item> {
    private int kol;
    private Listitem<Item> first;
    private Listitem<Item> last;
    List(){
        kol=0;
        first=null;
        last=null;
    }
    List(Item data){
        first=last=new Listitem<Item>(data);
        kol=1;
    }
    public void add(Item data){
        Listitem<Item>li=new Listitem<Item>(data);
        li.setnext(null);
        if(kol>0){
            li.setprev(last);
            last.setnext(li);
        }
        else{
            first=li;
        }
        last=li;
        kol++;
    }
    public Listitem<Item> getfirst(){
        return first;
    }
    public Listitem<Item>getlast(){
        return last;
    }
    public int getquan(){
        return kol;
    }
    public Listitem<Item> get(int i){
        if(i>kol){
            return null;
        }
        else {
            Listitem<Item>li=first;
            for(int j=1;j<i;j++){
                li=li.getnext();
            }
            return li;
        }
    }
    void print(){
        Listitem<Item>li=first;
        while (li!=null)
        {
            System.out.print(li.getdata());
            li=li.getnext();
        }
        System.out.println();
    }
    public void remove(int i){
        if(i<=kol){
            Listitem<Item>li=get(i);
            Listitem<Item>prev=li.getprev();
            Listitem<Item>next=li.getnext();
            if(prev!=null)
            {
                prev.setnext(next);
            }
            if(next!=null)
            {
                next.setprev(prev);
                if(i==1){
                    first=next;
                }
            }
            kol--;
        }
    }
}
