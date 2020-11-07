package day11StackQueue.TH1.BTStack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int size;
        int[] array;
        do {
            System.out.println("Enter Number");
            size = Integer.parseInt(input.nextLine());
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        for (int k : array) {
            stack.push(k);
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = stack.pop();
        }
        System.out.printf("%-20s%s", "Elemental Island: ", "");
        for (int k : array) {
            System.out.print(k + "\t");
        }
    }
}
