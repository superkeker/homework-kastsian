package home_work_2.utils;

import org.junit.jupiter.api.Test;

import static home_work_2.utils.SortsUtils.bubble;
import static home_work_2.utils.SortsUtils.shaker;
import static org.junit.jupiter.api.Assertions.*;

class SortsUtilsTest {

    @Test
    public void testBubble() {
        int[] arr = {433, 5453, 13534, 5421, 53656, 256423, 6427, 22 ,663, 1};
        int[] arr2 = {1, 22, 433, 663, 5421, 5453, 6427, 13534, 53656, 256423};
        bubble(arr);
        assertArrayEquals(arr, arr2);
    }

    @Test
    public void testShaker() {
        int[] arr = {433, 5453, 13534, 5421, 53656, 256423, 6427, 22 ,663, 1};
        int[] arr2 = {256423, 53656, 13534, 6427, 5453, 5421, 663, 433, 22, 1};
        shaker(arr);
        assertArrayEquals(arr, arr2);
    }
}