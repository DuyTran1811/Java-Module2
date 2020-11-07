package day1;

import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chieu Rong: ");
        width = scanner.nextFloat();
        System.out.println("Nhap Chieu Cao");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Dien Tich Hinh Chu Nhat: " + area);
    }
}
