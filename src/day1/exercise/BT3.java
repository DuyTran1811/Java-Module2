package day1.exercise;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD");
        usd = scanner.nextDouble();
        double convert = usd * vnd;
        System.out.println("VND: " + convert);
    }
}
