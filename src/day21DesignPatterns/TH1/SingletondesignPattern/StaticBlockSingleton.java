package day21DesignPatterns.TH1.SingletondesignPattern;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    class Test2{
        StaticBlockSingleton instances = StaticBlockSingleton.getInstance();
    }
}
