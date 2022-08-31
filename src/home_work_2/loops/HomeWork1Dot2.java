package home_work_2.loops;


import java.util.Objects;
import java.util.Scanner;

public class HomeWork1Dot2 {
    public static String multiplyNumbers(String numbers){
        if(!Objects.equals( null, conditionCheck(numbers))){
            return conditionCheck(numbers);
        }

        StringBuilder sb = new StringBuilder();

        String str = String.valueOf(numbers);
        String[] strArray = str.split("");

        long[] array = new long[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        long result = array[0];

        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            result *= array[i];
            sb.append(" * ").append(array[i]);
        }
        sb.append(" = ").append(result);

        return String.valueOf(sb);
    }
    private static String conditionCheck(String numbers){
        try(Scanner scanner = new Scanner(numbers)){
            if(scanner.hasNextInt()){
                return null;
            } else if(scanner.hasNextDouble()) {
                return "¬ведено не целое число";
            }
        }
        return "¬ведено не число";
    }
}
