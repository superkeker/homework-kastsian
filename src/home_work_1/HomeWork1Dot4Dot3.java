package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        if(a%b == 0){
            System.out.println("Делимое");
        } else {
            System.out.println("Неделимое");
        }
    }
}
