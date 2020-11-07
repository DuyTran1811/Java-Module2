package day3Mang.exercise;

import java.util.Scanner;

public class BT1XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int size, j, c;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Your Number");
            size = scanner.nextInt();
        } while (size <= 0);
        int[] array = new int[size];
        System.out.print("Enter Element in Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element" + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter The integer X: ");
        int x = scanner.nextInt();
        for (c = j = 0; j < size; j++) {
            if (array[j] != x) {
                array[c] = array[j];
                c++;
            }
        }
        size = c;
        System.out.println("Array remaining after the element is deleted: " + x + " :");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "\t");
        }
    }
}
