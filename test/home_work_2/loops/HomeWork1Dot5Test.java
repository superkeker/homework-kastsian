package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static home_work_2.loops.HomeWork1Dot5.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork1Dot5Test {

    @Test
    public void testLargestDigit() {
    int[] arr = {1, 2, 3};
    assertEquals(3, largestDigit(arr));
    assertNotEquals(2, largestDigit(arr));
    assertNotEquals(5, largestDigit(arr));
    }

    @RepeatedTest(100)
    public void testProbabilityOfEvenRandomNumbers() {
        DecimalFormat df = new DecimalFormat("#.#");
        assertEquals(0.5,  Double.valueOf(df.format(probabilityOfEvenRandomNumbers())));
    }

    @Test
    public void testEvenAndOddCount() {
        int input = 234567890;
        int[] expected = {4, 5};
        Assertions.assertArrayEquals(expected, evenAndOddCount(String.valueOf(input)));
    }

    @Test
    public void testFibonacci() {
        Assertions.assertEquals("1 2 3 5 8 13", fibonacci(6));
    }

    @Test
    public void testRangeOfNumbers() {
        Assertions.assertEquals("10 15 20 25 30 35", rangeOfNumbers(10, 35, 5));
    }

    @Test
    public void testNumberFlip() {
        Assertions.assertEquals("6843", numberFlip(String.valueOf(3486)));
    }
}