public class QuadraticEquation extends Root{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два корня квадратного уравнения: x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Один корень квадратного уравнения: x = " + root);
        } else {
            System.out.println("Нет действительных корней у квадратного уравнения.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Квадратное уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
    }
}
