package day6KeThua.ThucHanh.LayerCircle;

public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return getRadius() * getRadius() * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder" +
                " height = " + getHeight()
                + " Color " + getColor()
                + " radius " + getRadius()
                +" Volume " + volume()
                + ' ';
    }
}
