package home_work_2.loops;

import java.util.Scanner;

public class HomeWork1Dot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        if (scanner.hasNextInt()) {
            str = scanner.next();
        } else if (scanner.hasNextDouble()) {
            System.out.println("¬ведено не целое число");
            System.exit(0);
        } else {
            System.out.println("¬ведено не число");
            System.exit(0);
        }
        String[] strArray = str.split("");
        StringBuilder sb = new StringBuilder();
        int[] numbers = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }
        sb.append(numbers[0]);
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
            sb.append(" * " + numbers[i]);
        }
        sb.append(" = " + result);
        System.out.println(sb);
    }
}
