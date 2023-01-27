import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    private long yearNumber;
    private boolean result;
    private LeapYear year = new LeapYear();

    @Test
    void trueLeap() {
        yearNumber = 2024;
        result = year.leap(yearNumber);
        assertEquals(true, result);
    }

    @Test
    void falseLeap() {
        yearNumber = 2023;
        result = year.leap(yearNumber);
        assertEquals(false, result);
    }
}