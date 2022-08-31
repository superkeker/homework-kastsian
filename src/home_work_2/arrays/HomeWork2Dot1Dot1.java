package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class HomeWork2Dot1Dot1 {
    public static void main(String[] args) {
        int[] container1 = arrayFromConsole();
        for (int j : container1) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] container2 = arrayRandom(5, 100);
        for (int j : container2) {
            System.out.print(j + " ");
        }
    }
}
