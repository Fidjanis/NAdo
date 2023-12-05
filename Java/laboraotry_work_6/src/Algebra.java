class Algebra extends Progress {
    Algebra(int a0,int delta, String name) {
        super(a0, delta, name);
    }

    @Override
    double sum(int n) {
        return ((2*a0+(n-1)*delta)/2)*n;
    }

    @Override
    double elem(int j) {
        return (a0+(j-1)*delta);
    }
}
