package day7AbstractClassInterface.ResizeableInterface;

public class Square extends Rectangle implements Resizeable{
    public Square() {}

    public Square(double side) {super(side, side);}

    public double getSide() {return getWidth();}

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {setSide(width);}

    @Override
    public void setLength(double length) {setSide(length);}

    @Override
    public String toString() {
        return "A Square with Side = "
                + getSide()
                + ", Area = "
                + super.getArea();
    }
}