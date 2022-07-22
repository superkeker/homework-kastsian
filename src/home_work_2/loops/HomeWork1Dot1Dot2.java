package home_work_2.loops;

import java.util.Scanner;

public class HomeWork1Dot1Dot2 {
    public static int factResursion(int i) {
        int result = 1;
        if (i == 1 || i == 0){
            return result;
            }
        result = i * factResursion(i-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до которого будет происходить умножение: ");
        int x = scanner.nextInt();
        if(x > 0){
            StringBuilder str = new StringBuilder();
            str.append(1);
            for (int k = 2; k <= x; k++){
                str.append(" * " + k);
            }
            str.append(" = " + factResursion(x));
            System.out.println(str);
        }else {
            System.out.println("Вы ввели отрицательное значение.");
        }
    }
}
