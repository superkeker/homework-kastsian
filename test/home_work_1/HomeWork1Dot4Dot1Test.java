package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot1Test {
    private final HomeWork1Dot4Dot1 test = new HomeWork1Dot4Dot1();

    @Test
    public void testOddNumber(){
        assertTrue(test.oddNumber(1));
        assertFalse(test.oddNumber(2));
    }
}