package home_work_1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1Dot7 {
    public static String createPhoneNumber(int[] massive) {
        int x1 = massive[0];
        int x2 = massive[1];
        int x3 = massive[2];
        int x4 = massive[3];
        int x5 = massive[4];
        int x6 = massive[5];
        int x7 = massive[6];
        int x8 = massive[7];
        int x9 = massive[8];
        int x10 = massive[9];

        String s = "(" + x1 + x2 + x3 +") " +x4 + x5 + x6 + "-" +x7 + x8 + x9 + x10;
        return s;
        }

    public static void main(String[] args) {
        int [] massive;
        massive = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < massive.length; i++){
            System.out.println("¬велите число от 0 до 9:");
            int x = scanner.nextInt();
            if(x >= 0 && x <= 9){
                massive[i] = x;
            }
        }
        System.out.println(createPhoneNumber(massive));
    }
}
