package day8Refactoring;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0 && number % 5 == 0;
        boolean isBuzz = number % 5 == 0 && number % 3 == 0;
        if (isFizz && isBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";
        return number + "";
    }
}
