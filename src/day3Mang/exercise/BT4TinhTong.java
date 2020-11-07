package day3Mang.exercise;

import java.util.Arrays;

public class BT4TinhTong {
    public static void main(String[] args) {
        int[][] array = {{5, 1, 7}, {2, 4, 6}, {20, 15, 12}};
        System.out.println("The Elements of The Array: " + Arrays.deepToString(array));
        System.out.println("Total Values Per Column" + Arrays.toString(sum(array)));
    }

    public static int[] sum(int[][] array) {
        int[] result = new int[array.length];
        int total;
        for (int i = 0; i < array.length; i++) {
            total = 0;
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            result[i] = total;
        }
        return result;
    }
}

