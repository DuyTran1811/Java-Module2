package day4classinjava;

import java.util.Scanner;

public class StopWatch {
    private long startTime, endTime;
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.startTime + this.endTime;
    }
}

class RunStopWatch {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhan 0 de bat dau");
        String value = scanner.nextLine();
        int a = Integer.parseInt(value);
        if (a == 0) {
            clock.start();
        }
        System.out.println("nhan 1 de dung lai");
        String value1 = scanner.nextLine();
        int b = Integer.parseInt(value1);
        if (b == 1) {
            clock.stop();
            System.out.println("thoi gian chay la: " + clock.getElapsedTime() + " milliseconds");
        }
    }
}

