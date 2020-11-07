package day9Testing.BTTinhNgayTiepTheo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    void testFindNextDay1() {
        int day = 29, month = 2, year = 2020, expectedDay = 1, expectedMonth = 3,expectedYear = 2020;
        int resultDay = NextDayCalculator.findNextDay(day, month, year);
        int resultMonth = NextDayCalculator.findNextMonth(day, month, year);
        int resultYear = NextDayCalculator.findNextYear(day, month, year);
        assertEquals(expectedDay,resultDay);
        assertEquals(expectedMonth, resultMonth);
        assertEquals(expectedYear, resultYear);
        System.out.print("Case Test "+day + " " +month+" "+year+" ==> ");
        System.out.print(" Result "+resultDay + " " +resultMonth+" "+resultYear);
        System.out.println();
    }
}
