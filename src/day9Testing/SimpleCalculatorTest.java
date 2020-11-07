package day9Testing;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test @DisplayName("Testing add 0 + 0")
    public void testAdd0And0(){
        int first = 0 ,second = 0, expected = 0;
        int result = SimpleCalculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test @DisplayName("Testing Sud 0 - 0 ")
    public void test0And0(){
        int fist = 2,second = 2, expected = 0;
        int result = SimpleCalculator.sud(fist,second);
        assertEquals(expected,result);
    }
}
