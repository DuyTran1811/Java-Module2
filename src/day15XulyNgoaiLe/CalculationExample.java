package day15XulyNgoaiLe;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Enter Y: ");
        int y = Integer.parseInt(input.nextLine());
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println(" Tổng  X + Y " + a);
            System.out.println(" Hiệu  X - Y " + b);
            System.out.println(" Tích   X * Y " + c);
            System.out.println(" Thương  X / Y " + d);
        } catch (Exception e) {
            System.out.println("Lỗi Ngoại Lệ "+ e.getMessage());
        }
    }
}
