package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;
import static home_work_2.utils.SortsUtils.bubble;

public class SortsMain {
    public static void main(String[] args) {
        int [] arrRandom = arrayRandom(50, 100);
        bubble(arrRandom);
        System.out.println(Arrays.toString(arrRandom));
    }
}
