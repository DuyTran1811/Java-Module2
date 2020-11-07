package day14ThuatToanSapXep;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter List Size");
        int size = Integer.parseInt(input.nextLine());
        int[] lists = new int[size];
        System.out.println("Enter " + lists.length + " Value:");
        for (int i = 0; i < lists.length; i++) {
            System.out.println("Nhập Phần Tử " + (i + 1) + ": ");
            lists[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println(" Danh sách đầu vào của bạn: ");
        for (int list : lists) {
            System.out.print(list + "\t");
        }
        System.out.println("\n Bắt đầu xử lý sắp xếp...");
        bubbleSortByStep(lists);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    /** Hoan Doi list[i] Voi list[i + 1] */
                    System.out.println("Hoán Đổi " + list[j] + " Với " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;  /** Thẻ tiếp theo vẫn cần */
                }
            }
            /** Mảng có thể được sắp xếp và không cần chuyển tiếp */
            if (!needNextPass) {
                System.out.println("Mảng Có Thể Được Sắp Xếp và Không Cần Chuyển Tiếp");
                break;
            }
            /** Hiển thị danh sách sau khi sắp xếp */
            System.out.println("Liệt kê sau" + i + "' Sắp Xếp: ");
            for (int k : list) {
                System.out.print(k + "\t");
            }
        }
    }
}
