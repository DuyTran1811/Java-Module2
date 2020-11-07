package day7AbstractClassInterface.TrienKhaiinterfaceComparable;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square("black",true,20,45);
        System.out.println(square);
    }
}
