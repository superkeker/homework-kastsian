package home_work_2.loops;

import java.util.Scanner;

public class HomeWork1Dot3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����, ������� ����� ����������� � �������: ");
        double y = scanner.nextDouble();
        System.out.println("������� ������� �����: ");
        int x = scanner.nextInt();
        double result = y;
        if (x > 0){
            for (int i = 2; i <= x; i++) {
                result = result * y;
            }
        }else {
            System.out.println("�� ����� �������� �������� ��� �������.");
        }
        System.out.println(y + " ^ " + x + " = " + result);
    }
}
