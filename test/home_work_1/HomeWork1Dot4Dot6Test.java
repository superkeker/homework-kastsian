package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot4Dot6.isLeapYear;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot6Test {

    @Test
    public void testLeapYear() {
        assertFalse(isLeapYear(2022));
        assertTrue(isLeapYear(2024));
    }
}