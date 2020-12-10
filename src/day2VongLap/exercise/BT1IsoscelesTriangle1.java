package day2VongLap.exercise;

import java.util.Scanner;

public class BT1IsoscelesTriangle1 {
    public static void main(String[] args) {
        int lef;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Height");
        lef = scanner.nextInt();
        for (int i = 0; i < lef; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
