package home_work_2.utils;

public class SortsUtils {
    public static void main(String[] args) {
        int[] arr = {433, 5453, 13534, 5421, 53656, 256423, 6427, 22 ,663, 1};
        shaker(arr);
        for (int i: arr
             ) {
            System.out.print(i + " ");
        }
    }
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
    public static void shaker(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
            }
            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j] > arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
