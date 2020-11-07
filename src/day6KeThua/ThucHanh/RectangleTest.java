package day6KeThua.ThucHanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5,8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange",false,10,20);
        System.out.println(rectangle);
    }
}
