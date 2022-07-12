package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();

        if(i%2 == 0){
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}
