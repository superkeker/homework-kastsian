package home_work_2.loops;

import java.util.Scanner;

import static java.lang.Math.multiplyExact;

public class HomeWork1Dot1Dot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до которого будет происходить умножение: ");
        int x = scanner.nextInt();
        int result = 1;
        StringBuilder str = new StringBuilder();
        str.append(result);

        if (x >= 0) {
            for (int i = 2; i <= x; i++) {
                result = result * i;
                str.append(" * " + i);
            }
            str.append(" = " + result);
            System.out.println(str);
        } else {
            System.out.println("Вы ввели отридцательное значение, либо не число.");
        }
    }
}
