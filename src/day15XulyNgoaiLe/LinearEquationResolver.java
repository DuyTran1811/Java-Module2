package day15XulyNgoaiLe;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        double a = scanner.nextDouble();

        System.out.print("B: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Giải Pháp Là: %f!", solution);
        } else {
            if (b == 0) {   
                System.out.print("Giải pháp là tất cả x!");
            } else {
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
