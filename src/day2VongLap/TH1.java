package day2VongLap;

import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int prime = 2;
            boolean check = true;
            while (prime <= Math.sqrt(number)) {
                if (number % prime == 0) {
                    check = false;
                    break;
                }
                prime++;
            }
            if (check) {
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
