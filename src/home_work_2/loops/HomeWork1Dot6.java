package home_work_2.loops;

public class HomeWork1Dot6 {
    public static void table(){
        int res2, res3, res4, res5, res6, res7, res8, res9;

        for (byte i = 1; i <= 10; i++) {
            res2 = i * 2;
            res3 = i * 3;
            res4 = i * 4;
            res5 = i * 5;
            System.out.println("2 * " + i + " = " + res2 + "\t3 * " + i + " = " + res3 + "\t4 * " + i + " = " + res4 + "\t5 * " + i + " = " + res5);
        }
        for (byte i = 1; i <= 10; i++) {
            res6 = i * 6;
            res7 = i * 7;
            res8 = i * 8;
            res9 = i * 9;
            System.out.println("6 * " + i + " = " + res6 + "\t7 * " + i + " = " + res7 + "\t8 * " + i + " = " + res8 + "\t9 * " + i + " = " + res9);
        }
    }
}
