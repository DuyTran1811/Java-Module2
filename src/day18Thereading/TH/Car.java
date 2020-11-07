package day18Thereading.TH;

import day18Thereading.TH.Main;

import java.util.InputMismatchException;
import java.util.Random;

public class Car implements Runnable {
    /**
     * Khai báo Tên của xe đua
     */
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        /** Khởi tạo start (hay km ban đầu)*/
        int ruDistance = 0;
        /** Khởi tạo time bắt đầu cuộc đ*/
        long startTime = System.currentTimeMillis();
        /** Kiểm tra chừng nài con xe chưa kết thúc quãng đường đua thì xe vẫn tiếp */
        while (ruDistance < Main.DISTANCE) {
            try {
                /** Random Speed KM/H  */
                int speeds = (new Random().nextInt(20));
                /** Tính quãng đường đã đi */
                ruDistance += speeds;
                String log = "|";
                int percentTravel = (ruDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(Main.DISTANCE, ruDistance) + "KM");
                Thread.sleep(300);
            } catch (InputMismatchException | InterruptedException e) {
                System.out.println("Car " + this.name + "bị hỏng");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
