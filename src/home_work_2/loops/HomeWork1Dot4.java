package home_work_2.loops;

import java.util.Scanner;

public class HomeWork1Dot4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� �������� ����� ����������� ���������: ");
        long x = scanner.nextLong();
        long a = 1;
        StringBuilder str = new StringBuilder();
        str.append(a);
        if(x >= 0) {
            for (long i = 2; i <= x; i++) {
                a = a * i;
                str.append(" * " + i);
                if (a < 0) {
                    System.out.println("��������� ������������!");
                    long result2 = 1;
                    for (int i2 = 2; i2 <= i - 1; i2++) {
                        result2 = result2 * i2;
                    }
                    System.out.println("�� ������������: " + result2);
                    System.out.println("����� ������������: " + a);
                    System.exit(0);
                }
            }
            str.append(" = " + a);
            System.out.println(str);
        } else {
            System.out.println("�� ����� ������������� �����");
        }
    }
}
