package home_work_1;

public class HomeWork1Dot2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int exercise2Dot1 = 5 + a / b;
        System.out.println("результат задания 2.1: " + exercise2Dot1); // результат не 5.25 поскольку тип int

        int exercise2Dot2 = (5 + a) / b;
        System.out.println("результат задания 2.2: " + exercise2Dot2); // результат 0, потому что integer не окгругляет числа при делении

        int exercise2Dot3 = (5 + a++) / b;
        System.out.println("результат задания 2.3: " + exercise2Dot3); // a++ ни на что ни влияет, ибо это пост-кремент

        int a4 = 2;
        int exercise2Dot4 = (5 + a4++) / --b;
        System.out.println("результат задания 2.4: " + exercise2Dot4); // благодаря пре-крименту получилось 7/7

        int a5 = 2;
        int b5 = 8;
        int exercise2Dot5 = (5 * 2 >> a5++) / --b5;
        System.out.println("результат задания 2.5: " + exercise2Dot5); // 10 в двоичной системе равно 1010, после сдвига в право на 2 получается 10, то есть 3. 3 / 7

        int a6 = 2;
        int b6 = 8;
        int exercise2Dot6 = (5+7 > 20 ? 68 : 22 * 2 >> a6++) / --b6; // 5+7 меньше 20, поэтому переходим к 22*2
        System.out.println("результат задания 2.6: " + exercise2Dot6);

        /* int a7 = 2;
        int b7 = 8;
        int exercise2Dot7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a7++) / --b7; // boolean не делится
        System.out.println("результат задания 2.6: " + exercise2Dot7); */

        boolean exercise2Dot8 = 6 - 2 > 3 && 12 * 12 <= 119; // 12*12=144
        System.out.println("результат задания 2.8: " + exercise2Dot8);

        boolean exercise2Dot9 = true && false;
        System.out.println("результат задания 2.9: " + exercise2Dot9); // чтобы было true - должны оба операнда быть true
    }
}
