package day4classinjava;

public class QuadraticEquation {
    private double a;
    private double b;
    private double delta;
    private double x1, x2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.delta = b * b - 4 * a * c;
    }

    public void calculate() {
        if (this.delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Equation has two solutions: \nx1 = " + x1 + "\nx2" + x2);
        } else if (delta ==0) {
            x1 = (-b +Math.sqrt(delta)/ (2*a));
            System.out.println("the equation only have one  solutions: \nx1: "+ x1);
        }else {
            System.out.println("The equation has no solution!");
        }
    }
    public static void main(String[] args) {
        QuadraticEquation bac1 = new QuadraticEquation(8,-6,1);
        QuadraticEquation bac2 = new QuadraticEquation(1,-4,4);
        bac1.calculate();
        bac2.calculate();

    }
}
