package day2VongLap.exercise;

import java.util.Scanner;

public class BT3First100Primes {
    public static void main(String[] args) {
        int count = 0, num, n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");
        num = scanner.nextInt();
        while (count < num) {
            if (First20Primes.isPrimes(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}

