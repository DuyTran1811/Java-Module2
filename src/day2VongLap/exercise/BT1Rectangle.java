package day2VongLap.exercise;

import java.util.Scanner;

public class BT1Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, width;
        System.out.println("Enter The Height");
        height = scanner.nextInt();
        System.out.println("Enter The Width");
        width = scanner.nextInt();
        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <width ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
