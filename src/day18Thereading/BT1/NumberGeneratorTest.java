package day18Thereading.BT1;

public class NumberGeneratorTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(new NumberGenerator());
        Thread t2 = new Thread(new NumberGenerator());
        t1.start();
        t2.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
    }
}
