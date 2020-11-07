package day3Mang.exercise;

import java.util.Scanner;

public class BT5TongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col, sum = 0;
        System.out.println("Enter the number of rows:");
        row = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.printf("A[%d] = ", i);
            for (int j = 0; j < col; j++) {
                System.out.printf("B[%d] = ", j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    sum = sum + array[i][j];
            }
        }
        System.out.println("sum of cross values in array: " + sum);
    }
}
