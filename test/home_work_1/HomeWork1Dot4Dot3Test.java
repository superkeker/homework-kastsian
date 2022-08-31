package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot4Dot3.divisibilityCheck;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot3Test {
    @Test
    public void testDivisibilityCheck(){
        assertTrue(divisibilityCheck(2, 2));
        assertFalse(divisibilityCheck(1, 2));
    }
}