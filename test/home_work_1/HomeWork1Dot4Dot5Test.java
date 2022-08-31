package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot4Dot5.isThisLetter;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot5Test {

    @Test
    public void testIsThisLetter() {
        assertTrue(isThisLetter('e'));
        assertFalse(isThisLetter('6'));
    }
}