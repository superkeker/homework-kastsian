package home_work_1;

public class HomeWork1Dot3 {
    public static void main(String[] args) {
        double d = 3.5;
        System.out.println(Math.rint(d)); // округляет дробь до целого чётного

        System.out.println(Math.round(d));

        System.out.println(Math.random());

        /*
        int x = Integer.MAX_VALUE;
        int y = 1;
        System.out.println(Math.addExact(x,y)); // проверка переполнения при сложении
        */

        /*
        long x = 1000000000000000000l;
        System.out.println(Math.toIntExact(x)); // проверка того, будет ли утеряны данные при переходе в int
        */

        int x = -300;
        int y = 7;
        System.out.println(Math.floorDiv(x,y)); // округление при делени в меньшую сторону

        System.out.println(Math.abs(x)); // модуль

        System.out.println(Math.signum((double) x)); // значение в сигнум
        System.out.println(Math.signum((double) y));

        float f1 = -1.00001f;
        float f2 = 2.00002f;
        System.out.println(Math.copySign(f1, f2)); // копирует знак
        System.out.println(Math.copySign(f2, f1));
    }
}
