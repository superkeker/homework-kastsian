package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        int i = scanner.nextInt();
        System.out.println("���� �� ������ ��������� ����� � ��������� - ������� 'k'. ���� �� ������ ��������� ��������� � ����� - ������� 'b'");
        char c = scanner.next().charAt(0);

        if (c == 'k' || c == 'K'){
            System.out.println("���� ����� � ����������" + i/1024);
        } else if (c == 'b' || c == 'B'){
            System.out.println("���� ����� � ������" + i*1024);
        } else if (c != 'b'|| c != 'B' || c != 'k' || c != 'K') {
            System.out.println("�� ����� �������� �����");
        }
    }
}
