package day21DesignPatterns.TH1.SingletondesignPattern;

public class BillPughSingleton {
    private BillPughSingleton instance;

    private static class SingleOnHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingleOnHelper.INSTANCE;
    }
}

