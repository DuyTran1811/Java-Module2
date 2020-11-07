package day6KeThua.ThucHanh.LayerCircle;

public class Circle {
    private double radius = 1.0;
    private String color = " While ";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with Radius " +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ' ';
    }
}
