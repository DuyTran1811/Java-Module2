package day6KeThua.ThucHanh.LayerCircle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 =new Circle(5.5,"Blue");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder(111);
        System.out.println(cylinder);
    }
}
