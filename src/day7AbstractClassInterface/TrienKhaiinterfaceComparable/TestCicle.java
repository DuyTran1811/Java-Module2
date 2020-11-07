package day7AbstractClassInterface.TrienKhaiinterfaceComparable;

public class TestCicle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.5);
        System.out.println(circle);

        circle = new Circle("Blue",false,3.5);
        System.out.println(circle);
    }
}
