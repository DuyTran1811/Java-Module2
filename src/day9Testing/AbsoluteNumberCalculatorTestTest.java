package day9Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AbsoluteNumberCalculatorTestTest {
    @Test
    public void testFindAbsolute0() {
        int number = 0, expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1(){
        int number = 1, expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsoluteNegative1(){
        int number = 1, expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}