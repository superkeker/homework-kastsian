package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static home_work_2.loops.HomeWork1Dot1Dot1.multiplyTo;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot1Dot2Test {

    @Test
    public void testRecursionMultiplyTo() {
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", multiplyTo(5));
        assertEquals("1 * 2 * 3 * 4 * 5 * 6 = 720", multiplyTo(6));
    }
}