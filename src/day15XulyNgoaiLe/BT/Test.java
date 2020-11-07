package day15XulyNgoaiLe.BT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(" === Triangle Checker ===");
            System.out.println("Input size 1: ");
            double firstSide = input.nextDouble();
            System.out.println("Input size 2: ");
            double secondSide = input.nextDouble();
            System.out.println("Input size 3: ");
            double thirdSide = input.nextDouble();
            double sum1 = firstSide + secondSide;
            double sum2 = secondSide + thirdSide;
            double sum3 = firstSide + thirdSide;
            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0
                    || sum1 <= thirdSide || sum2 <= firstSide || sum3 <= secondSide){
                throw new IllegalTriangleException();
            }else {
                System.out.println(" Ba Mat Da Kiem Tra");
            }

        } catch (InputMismatchException e) {
            System.out.println("Sai Kieu");
        }catch (IllegalTriangleException e){
            System.out.println("Ban Nhap Sai");
        }
    }
}
