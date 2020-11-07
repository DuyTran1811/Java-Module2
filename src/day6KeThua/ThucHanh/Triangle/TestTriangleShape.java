package day6KeThua.ThucHanh.Triangle;

import java.util.Scanner;

public class TestTriangleShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side 1");
        double side1 = input.nextDouble();
        System.out.println("Enter Side 2");
        double sider2 = input.nextDouble();
        System.out.println("Enter Side 3");
        double sider3 = input.nextDouble();

        System.out.println("Enter Color");
        input.nextLine();
        String color = input.nextLine();

        Shape shape = new Shape();
        shape.setColor(color);

        Triangle triangle = new Triangle(side1,sider2,sider3);
        triangle.setColor(color);
        System.out.println(triangle);

    }
}
