package day18Thereading.BT2;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);

        thread2.join();
        thread1.start();
        thread2.start();

    }
}
