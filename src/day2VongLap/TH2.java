package day2VongLap;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        double money;
        int month;
        double interest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i <= month; i++) {
            totalInterest += money * (interest / 100) / 12 * month;
        }
        System.out.println("Total interset: " + totalInterest);
    }
}
