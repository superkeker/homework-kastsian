package home_work_2.utils;

public class SortsUtils {
    public static void bubble(int[] arr){
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int bub = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bub;
                }
            }
        }
    }
}
