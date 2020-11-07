package day18Thereading.Test.Test2;

public class ShareMemory {
    public synchronized void printData(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
        }
    }
}
