package day7AbstractClassInterface.ResizeableInterface;

public class Circle implements Resizeable {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {this.radius = radius;}

    public double getRadius() { return radius; }

    public void setRadius(double radius) {this.radius = radius;}

    public double getArea() {return radius * radius * Math.PI;}

    public double getPerimeter() {return 2 * radius * Math.PI;}

    @Override
    public String toString() {return "A Circle with radius = "
                + getRadius()
                + ", Area = "
                + getArea();}

    @Override
    public void resize(double percent) {
        percent = Math.random() * 100;
        setRadius(getRadius() + getRadius() * percent/100);
    }
}