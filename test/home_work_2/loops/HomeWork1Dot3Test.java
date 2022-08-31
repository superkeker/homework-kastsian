package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static home_work_2.loops.HomeWork1Dot3.involution;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot3Test {

    @Test
    public void testInvolution() {
    assertEquals( "18.0 ^ 5 = 1889568.0", involution(18, 5));
    assertEquals( "7.5 ^ 2 = 56.25", involution(7.5, 2));
    assertEquals( "6.9 ^ 2 = 47.61000000000001", involution(6.9, 2));
    }
}