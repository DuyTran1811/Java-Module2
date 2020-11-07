package day11StackQueue.TH1.BTStack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter Character");
        String str = scanner.nextLine();
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            str1.append(stack.pop());
        }
        System.out.println(str1);
    }
}
