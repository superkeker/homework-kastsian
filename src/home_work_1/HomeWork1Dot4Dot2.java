package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ������: ");
        int a = scanner.nextInt();
        System.out.println("������� ������ ������: ");
        int b = scanner.nextInt();
        System.out.println("������� ������ ������: ");
        int c = scanner.nextInt();

        if ((a < b && b < c) || (a > b && b > c)){
            System.out.println(b);
        } else if ((b < a && a < c) || ((b > a && a > c))) {
            System.out.println(a);
        } else if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("������� ����� ���: " + c);
        }
    }
}
