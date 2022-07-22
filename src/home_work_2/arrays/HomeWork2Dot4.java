package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class HomeWork2Dot4 {
    public static void main(String[] args) {
        int [] array = arrayRandom(50, 100);
        System.out.println(sumOfEvenElements(array));
        System.out.println(maxEvenNumberOfArray(array));
        System.out.println(Arrays.toString(elOfAnArrayThatAreLessThanTheMean(array)));
        int[] array2 = twoMinElOfAnArray(array);
        System.out.println(array2[0] + " " + array2[1]);
        System.out.println(Arrays.toString(squeezeTheArrayByInterval(array, 30, 60)));
        System.out.println(sumOfTheArrayDigits(array));
    }

    private static int sumOfTheArrayDigits(int[] array) {
        int sum = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            while (x > 0){
                sum += x % 10;
                x /= 10;
            }
        }
        return sum;
    }

    private static int[] squeezeTheArrayByInterval(int[] array, int from, int to) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= from && array[i] <= to ){
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] twoMinElOfAnArray(int[] array) {
        int min = 99;
        int buf;
        int min2 = 0;
        for (int i = 0; i < array.length; i++) {
                buf = array[i];
                if(buf <= min){
                    min2 = min;
                    min = buf;
                }
        }
        return new int[] {min, min2};
    }

    public static int[] elOfAnArrayThatAreLessThanTheMean(int [] array) {
        int counter = 0;
        int mean;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sumOfEvenElements(array)/50){
                counter++;
            }
        }
        int counter2 = 0;
        //StringBuilder strB = new StringBuilder();
        int [] array2 = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sumOfEvenElements(array)/50){
                array2[counter2] = array[i];
                counter2++;
            }
        }
        return array2;
    }

    private static int maxEvenNumberOfArray(int [] array) {
        int max = 0;
        int buf;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                buf = array[i];
                if(buf > max){
                    max = buf;
                }
            }
        }
        return max;
    }

    public static int sumOfEvenElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
