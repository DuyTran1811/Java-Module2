package day7AbstractClassInterface.ResizeableInterface;

public class Rectangle implements Resizeable {
    private double width = 3.0;
    private double length = 5.0;
    public Rectangle(){}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {return width;}

    public void setWidth(double width) {this.width = width;}

    public double getLength() {return length;}

    public void setLength(double length) {this.length = length;}
    public double getArea() {return width * this.length;}

    public double getPerimeter() {return 2 * (width + this.length);}

    @Override
    public void resize(double percent) {
        percent = Math.random() * 100;
        setLength(getLength() + getLength() * percent / 100);
        setWidth(getWidth() + getWidth() * percent / 100);
    }
}
