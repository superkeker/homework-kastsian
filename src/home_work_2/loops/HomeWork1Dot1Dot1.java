package home_work_2.loops;

public class HomeWork1Dot1Dot1 {
    public static String multiplyTo(int to){
        int result = 1;
        StringBuilder str = new StringBuilder();
        str.append(result);

        if (to >= 0) {
            for (int i = 2; i <= to; i++) {
                result = result * i;
                str.append(" * ").append(i);
            }
            str.append(" = ").append(result);
            return String.valueOf(str);
        } else {
            System.out.println("Вы ввели отридцательное значение, либо не число.");
            return null;
        }
    }
}
