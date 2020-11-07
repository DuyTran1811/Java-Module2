package day3Mang.exercise;

import java.util.Scanner;

public class BT6DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Character");
        String str = scanner.nextLine();
        System.out.println("Enter The Word You Want To Find");
        char tex = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tex) {
                count++;
            }
        }
        System.out.println("The number of occurrences: "+tex+"is: "+count);
    }
}
