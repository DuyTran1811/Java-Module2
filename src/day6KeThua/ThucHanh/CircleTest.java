package day6KeThua.ThucHanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(6);
        System.out.println(circle);
        circle = new Circle(" indigo", false, 10);
        System.out.println(circle);
    }
}
