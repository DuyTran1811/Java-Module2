package day1;

import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Import A:");
        a = scanner.nextDouble();
        System.out.println("Import B:");
        b = scanner.nextDouble();
        System.out.println("Import C:");
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else{
            if (b == 0){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }
    }
}
