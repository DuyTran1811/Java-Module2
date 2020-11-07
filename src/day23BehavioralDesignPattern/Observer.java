package day23BehavioralDesignPattern;

public interface Observer {
    default void update(String message) {
    }
}
