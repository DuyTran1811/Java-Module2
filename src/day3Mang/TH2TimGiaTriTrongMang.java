package day3Mang;

import java.util.Scanner;

public class TH2TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian",
                "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah",
                "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Name's Student");
        String input = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Position of the students in the list" + input + "is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found" + input + " in the list.");
        }
    }
}
