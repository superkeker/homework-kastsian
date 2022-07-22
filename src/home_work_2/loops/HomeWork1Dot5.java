package home_work_2.loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1Dot5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, из которого будет выводиться наибольшее значение, а также количество чётных и нечётных цифр");
        String s = scanner.next();
        String[] strArray = s.split("");
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        System.out.println(largestDigit(numbers));

        System.out.println(probabilityOfEvenRandomNumbers());
        int evenOdd[] = evenAndOdd(numbers);
        System.out.println("Количество чётных: " + evenOdd[0] + ". Количество нечётных: " + evenOdd[1]);

        System.out.println("Укажите количество элементов числа Фибоначчи, которые будут выводиться: ");
        int fibo = scanner.nextInt();
        System.out.println(fibonacci(fibo));

        System.out.println("Укажите минимум, максимум и шаг для ряда натуральных чисел");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int step = scanner.nextInt();
        System.out.println(rangeOfNumbers(min, max, step));

        System.out.println(numberFlip(numbers));
    }

    private static StringBuilder numberFlip(int numbers[]) {
        StringBuilder strB = new StringBuilder();
        for (int i = numbers.length-1; i >= 0; i--) {
            strB.append(numbers[i] + " ");
        }
        return strB;
    }
    private static StringBuilder rangeOfNumbers(int min, int max, int step) {
        int result = min;
        StringBuilder strB = new StringBuilder();
        while (result <= max){
            strB.append(result + " ");
            result = result + step;
        }
        return strB;
    }
    private static StringBuilder fibonacci(int fibo) {
        int x = 0;
        int resMain;
        int resDop = 1;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < fibo; i++) { // Числа Фибоначчи от 1
            resMain = resDop + x;
            x = resDop;
            str.append(resMain + " ");
            resDop = resMain;
        }
        return str;
    }
    private static int[] evenAndOdd(int[] numbers) {
        int evenBuf = 0;
        int oddBuf = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenBuf++;
            } else {
                oddBuf++;
            }
        }
        return new int[] {evenBuf, oddBuf};

        //System.out.println("В Вашем числе такое количество целых чисел: " + evenBuf + "; и такое количество нецелых: " + oddBuf);
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
        double probability = (double) buf/1000;
        return probability;
    }
    public static int largestDigit(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] < numbers[i])
                largest = numbers[i];
        }
        return largest;
    }
}
