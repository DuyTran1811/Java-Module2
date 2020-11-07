package day7AbstractClassInterface;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Chick Chick";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
