package day7AbstractClassInterface.TrienKhaiinterfaceComparable;

public class TesRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("While",true,2.9,3.9);
        System.out.println(rectangle);
    }
}
