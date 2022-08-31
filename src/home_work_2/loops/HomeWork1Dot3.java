package home_work_2.loops;

public class HomeWork1Dot3 {
    public static String involution(double y, int x){
        if (x > 0){
            double result = y;

            for (int i = 2; i <= x; i++) {
                result = result * y;
            }
            return y + " ^ " + x + " = " + result;
        }else {
            return "Вы ввели неверное значение для степени.";
        }
    }
}
