package day18Thereading.TH;

public class ThreadDemo extends Thread {
    private Thread thread;
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                /** Để Luồng Ngủ Một Lúc*/
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + "" + "interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
