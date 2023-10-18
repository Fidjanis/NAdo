abstract class Progress {
   abstract double sum(int n);
   abstract double elem(int j);
    int a0,delta;
    String name;
    Progress(int a0,int delta,String name)
    {
        this.a0=a0;
        this.delta=delta;
        this.name=name;
    }

}
