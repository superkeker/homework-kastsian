package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot6Dot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String s = scanner.next();
        if (s.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (s.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
    }
}
