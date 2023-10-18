import static java.lang.Math.pow;

class Geometry extends Progress {
    Geometry(int a0,int delta, String name) {
        super(a0, delta, name);
    }

    @Override
    double sum(int n) {
        return (a0*(pow(delta,n)-1))/(delta-1);
    }

    @Override
    double elem(int j) {
        return a0*(pow(delta,j-1));
    }
}
