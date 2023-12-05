import java.util.List;

public class Listitem<Item> {
    private Item data;
    private Listitem<Item>next;
    private Listitem<Item>prev;
    Listitem(Item d)
    {
        data=d;
        next=null;
        prev=null;
    }
    public Item getdata(){
        return data;
    }
    public void setdata(Item d){
        data=d;
    }
    public Listitem<Item> getprev(){
        return prev;
    }
    public Listitem<Item> getnext(){
        return next;
    }
    public void setprev(Listitem<Item>li)
    {
        prev=li;
    }
    public void setnext(Listitem<Item>li)
    {
        next=li;
    }
}
