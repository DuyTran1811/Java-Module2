package day7AbstractClassInterface.TrienKhaiinterfaceComparable;

public class TestSquere {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square("biu",true,5.8,32);
        System.out.println(square);
    }
}
