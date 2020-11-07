package day3Mang.exercise;

import java.util.Scanner;

public class BT2ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Entering Elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("import an element X");
        int x = scanner.nextInt();
//        SortUp(array);
        System.out.println("Sort up ascending: ");
        Show(array);
        System.out.println("insert Element into array: " + x);
        array = insert(array, x);
        Show(array);

    }

//    public static void SortUp(int[] arr) {
//        int temp;
//        for (int i = 0; i <= arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//    }

    public static int[] insert(int[] arr, int x) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int[] tempArray = new int[tempIndex + 1];
        boolean inserted = false;
        for (int i = arrIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > x) {
                tempArray[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArray[i] = x;
                    inserted = true;
                } else {
                    tempArray[i] = arr[arrIndex--];
                }
            }
        }
        return tempArray;
    }

    public static void Show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
