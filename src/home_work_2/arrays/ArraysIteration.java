package home_work_2.arrays;

public class ArraysIteration {

    public static void soutArrayElementsRevers(int[] array) {
        int i1 = array.length-1;
        do {
            System.out.print(array[i1] + " ");
            i1--;
        } while (i1 >= 0);
        System.out.println();

        int i2 = array.length-1;
        while (i2 >= 0){
            System.out.print(array[i2] + " ");
            i2--;
        }
        System.out.println();
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        String result = "";
        for(int i : array){
            result = i + "\r" + "\n" + result;
        }
        System.out.println(result);
    }

    public static void soutSecondArrayElement(int[] array) {
        int i1 = 1;
        do {
            System.out.print(array[i1] + " ");
            i1 += 2;
        } while (i1 < array.length);
        System.out.println();

        int i2 = 1;
        while (i2 < array.length){
            System.out.print(array[i2] + " ");
            i2 += 2;
        }
        System.out.println();
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i : array){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void soutArrayElemets(int[] array) {
        int i1 = 0;
        do {
            System.out.print(array[i1] + " ");
            i1++;
        } while (i1 < array.length);
        System.out.println();

        int i2 = 0;
        while (i2 < array.length){
            System.out.print(array[i2] + " ");
            i2++;
        }
        System.out.println();
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
