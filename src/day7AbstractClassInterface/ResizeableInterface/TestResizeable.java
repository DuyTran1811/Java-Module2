package day7AbstractClassInterface.ResizeableInterface;

public class TestResizeable {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Before: " + circle);
        circle.resize(50);
        System.out.println("After: " + circle);

        Rectangle rectangle = new Rectangle();
        System.out.println("Before: " + rectangle);
        rectangle.resize(60);
        System.out.println("After: " + rectangle);

        Square square = new Square();
        System.out.println("Before: " + square);
        square.resize(20);
        System.out.println("After: " + square);
    }
}
