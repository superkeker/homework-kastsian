package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите размер массива: ");
        int size = scanner.nextInt();
        System.out.println("¬ведите элементы массива: ");
        int [] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            container[i] = scanner.nextInt();
        }
        return container;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random random = new Random();
        int [] container = new int[size];
        for (int i = 0; i < container.length; i++) {
            container[i] = random.nextInt(maxValueExclusion);
        }
        return container;
    }
}
