package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot5.sleepIn;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot5Test {

    @Test
    public void testSleepIn() {
        boolean weekday = false;
        boolean vacation = false;
        assertTrue(sleepIn(weekday, vacation));
        weekday = false;
        vacation = true;
        assertTrue(sleepIn(weekday, vacation));
        weekday = true;
        vacation = true;
        assertTrue(sleepIn(weekday, vacation));
    }
}