package home_work_2.arrays;

public class HomeWork2Dot4 {
    public static int sumOfTheArrayDigits(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length-1; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int[] squeezeTheArrayByInterval(int[] array, int from, int to) {
        for (int i = 0; i < array.length; i++) {
            if(i >= from && i <= to ){
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] twoMinElOfAnArray(int[] array) {
        int min1 = 0;
        int min2 = 0;
        for (int i = 1; i <= array.length-1; i++) {
            if (array[i-1] < array[i]) {
                min2 = min1;
                min1 = array[i-1];
            }else if (array[i] < array[i-1]) {
                min2 = min1;
                min1 = array[i];
            }
        }
        if(min2 < min1){
            int buf = min2;
            min2 = min1;
            min1 = buf;
        }
        return new int[] {min1, min2};
    }

    public static int[] elOfAnArrayThatAreLessThanTheMean(int [] array) {
        int counter = 0;
        int mean = sumOfTheArrayDigits(array) / array.length;
        for (int i = 0; i <= array.length-1; i++){
            if (array[i] < mean) {
                counter++;
            }
        }
        int [] array2 = new int[counter];
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] < mean) {
                array2[i] = array[i];
            }
        }
        return array2;
    }

    public static int maxEvenNumberOfArray(int [] array) {
        int max = 0;
        int buf;
        for (int j : array) {
            if (j % 2 == 0) {
                buf = j;
                if (buf > max) {
                    max = buf;
                }
            }
        }
        return max;
    }

    public static int sumOfEvenElements(int[] array) {
        int sum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
