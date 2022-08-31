package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1Dot5 {
    public static int largestDigit(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] < numbers[i])
                largest = numbers[i];
        }
        return largest;
    }
    public static double probabilityOfEvenRandomNumbers() {
        Random random = new Random();
        int r;
        int buf = 0;
        for (int i = 0; i < 1000; i++) {
            r = random.nextInt();
            if (r % 2 == 0){
                buf++;
            }
        }
        return (double) buf/1000;
    }
    public static int[] evenAndOddCount(String numbersIn) {
        String str;
        try(Scanner scanner = new Scanner(numbersIn)){
            if(scanner.hasNextInt()){
                str = numbersIn;
            } else {
                return null;
            }
        }


        String[] strArray = str.split("");
        int[] numbers = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        int evenBuf = 0;
        int oddBuf = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenBuf++;
            } else {
                oddBuf++;
            }
        }
        return new int[] {evenBuf, oddBuf};
    }
    public static String fibonacci(int fibo) {
        int x = 0;
        int resMain;
        int resAdditional = 1;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < fibo; i++) { // Числа Фибоначчи от 1
            resMain = resAdditional + x;
            x = resAdditional;
            if(i == 0){
                str.append(resMain);
                continue;
            }
            str.append(" ").append(resMain);
            resAdditional = resMain;
        }
        return String.valueOf(str);
    }
    public static String rangeOfNumbers(int min, int max, int step) {
        int result = min;
        StringBuilder strB = new StringBuilder();
        strB.append(min);
        while (result < max){
            result = result + step;
            strB.append(" ").append(result);
        }
        return String.valueOf(strB);
    }
    public static String numberFlip(String numbersIn) {
        StringBuilder strB = new StringBuilder();

        String str;
        try(Scanner scanner = new Scanner(numbersIn)){
            if(scanner.hasNextInt()){
                str = numbersIn;
            } else {
                return null;
            }
        }


        String[] strArray = str.split("");
        int[] numbers = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = numbers.length-1; i >= 0; i--) {
            strB.append(numbers[i]);
        }
        return String.valueOf(strB);
    }
}
