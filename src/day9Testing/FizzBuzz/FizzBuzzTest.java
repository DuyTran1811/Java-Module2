package day9Testing.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    public void checkFizzBuzzTest(){
        int number = 2;
        assertEquals("2",FizzBuzz.CheckFizzBuzz(number));
    }
    @Test
    public void check(){
        int number = 2;
        assertEquals("two",FizzBuzz.FizzBuzzTranslate(number));
    }
}