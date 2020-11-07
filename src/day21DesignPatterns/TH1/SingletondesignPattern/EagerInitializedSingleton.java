package day21DesignPatterns.TH1.SingletondesignPattern;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    class Test1{
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
    }
}
