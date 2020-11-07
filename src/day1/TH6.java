package day1;

import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;

        System.out.println("Nhap Nam Cua Ban: ");
        year = scanner.nextInt();

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d La Nam Nhuan", year);
        } else {
            System.out.printf("%d Khong Phai Nam Nhuan", year);
        }
    }
}

