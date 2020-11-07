package day1;

import java.util.Scanner;

public class TH7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height, bmi;
        System.out.println("Nhap Chieu Cao Cua Ban");
        width = scanner.nextDouble();
        System.out.println("Nhap Can Nang Cua Ban");
        height = scanner.nextDouble();
        bmi = width / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}