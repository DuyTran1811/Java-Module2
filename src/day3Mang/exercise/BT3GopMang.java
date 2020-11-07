package day3Mang.exercise;

import java.util.Scanner;

public class BT3GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Entering Elements in the array 1:");
        for (int i = 0; i < size; i++) {
            System.out.printf("A[%d] = ", i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Entering Elements in the array 2:");
        for (int i = 0; i < size; i++) {
            System.out.printf("B[%d] = ", i);
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr2.length] = arr2[i];
        }
        System.out.println("Array 3 is");
        for (int j : arr3) {
            System.out.print(j + "\t");
        }
    }
}
