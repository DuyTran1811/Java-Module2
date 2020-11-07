package day2VongLap.exercise;

import java.util.Scanner;

public class BT1IsoscelesTriangle2 {
    public static void main(String[] args) {
        int rows;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Height");
        rows = scanner.nextInt();
        for (int i = rows; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
