package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot4Dot2.meanNumber;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot2Test {

    @Test
    public void testMeanNumber() {
        int a = 1, b = 2, c = 3;
        assertEquals(b, meanNumber(a, b, c));
    }
}