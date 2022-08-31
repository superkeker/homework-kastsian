package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.arrays.HomeWork2Dot4.*;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork2Dot4Test {

    @Test
    public void testSumOfTheArrayDigits() {
        int[] arr = {12, 23, 33, 11, 55, 22};
        assertEquals( 156, sumOfTheArrayDigits(arr));
    }

    @Test
    public void testSqueezeTheArrayByInterval() {
        int[] arr = {12, 23, 33, 11, 55, 22};
        int[] exp = {12, 0, 0, 0, 55, 22};
        Assertions.assertArrayEquals( exp, squeezeTheArrayByInterval(arr, 1, 3));
    }

    @Test
    public void testTwoMinElOfAnArray() {
        int[] arr = {12, 23, 33, 11, 55, 22};
        int[] exp = {11, 22};
        assertArrayEquals( exp, twoMinElOfAnArray(arr));
    }

    @Test
    public void testElOfAnArrayThatAreLessThanTheMean() {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] exp = {11, 22, 33};
        assertArrayEquals(exp, elOfAnArrayThatAreLessThanTheMean(arr));
    }

    @Test
    public void testMaxEvenNumberOfArray() {
        int[] arr = {11, 22, 33, 44, 55, 66};
        assertEquals(66, maxEvenNumberOfArray(arr));
    }

    @Test
    public void testSumOfEvenElements() {
        int[] arr = {11, 22, 33, 44, 55, 66};
        assertEquals(132, sumOfEvenElements(arr));
    }
}