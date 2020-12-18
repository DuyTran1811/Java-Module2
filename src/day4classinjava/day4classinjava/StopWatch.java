package day4classinjava;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date start() {
        return startTime = new Date();
    }

    public Date end() {
        return endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}

class RunStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] array = new int[200000];
        for (int i = 0; i < 2000000; i++) {
            array[i] = i + 1;
        }
        Arrays.sort(array);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}

