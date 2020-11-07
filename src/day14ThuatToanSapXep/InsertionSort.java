package day14ThuatToanSapXep;

public class InsertionSort {
    void sort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            /*Di chuyển các phần tử của arr [0..i-1],
             * lớn hơn key, đến một vị trí phía trước vị trí hiện tại*/
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 10, 6, 1, 3, 2, 5, 7, 9, 8};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        for (Integer i : arr) {
            System.out.print(i + "\t");
        }
    }
}
