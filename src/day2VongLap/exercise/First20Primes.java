package day2VongLap.exercise;

import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        int count = 0, n = 2, numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So N");
        numbers = scanner.nextInt();
        while (count < numbers) {
            if (isPrimes(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }


    public static boolean isPrimes(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}

