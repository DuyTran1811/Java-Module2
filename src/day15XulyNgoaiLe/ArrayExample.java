package day15XulyNgoaiLe;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("\nVui Long Nhap Chi So Cua Mot Phan Tu Bat Ky");
        int x = Integer.parseInt(input.nextLine());
        try {
            System.out.println("Gia Tri Cua Phan Tu Co Chi So 5 " + x + "La");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chi So Vuot Qua Chi So Cua Mang");
        }
    }

    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh Sach Phan Tu Cua Mang: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "\t");
        }
        return array;
    }
}
