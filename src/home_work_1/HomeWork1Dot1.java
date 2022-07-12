package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:"); // число 999 в двоичной системе будет эквивалентно 1111100111
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:"); // число 1000 в двоичной системе будет эквивалентно 1111101000
        int b = scanner.nextInt();

        System.out.println(a&b); // результат 1111100000
        System.out.println(a|b); // результат 1111101111

        /*
        Введено может быть только целое число(не 42.5), так как побитовые операторы работают только с целочисленными типами
         */
    }
}
