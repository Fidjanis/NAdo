public class LinearEquation extends Root{
    private double a;
    private double b;

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateRoots() {
        if (a == 0) {
            System.out.println("Это не линейное уравнение.");
        } else {
            double root = -b / a;
            System.out.println("Корень линейного уравнения: x = " + root);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Линейное уравнение: " + a + "x + " + b + " = 0");
    }
}


