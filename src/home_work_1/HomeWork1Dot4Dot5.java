package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot5 {
    public static void main(String[] args) {
        //����� ��� ���� ������
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� �� ���������� ��� ������: ");
        char c = scanner.next().charAt(0);

        if(((int)c >= 65 && (int)c <= 90) || ((int)c >= 97 && (int)c <= 122)){
            System.out.println("�� ����� �����");
        } else {
            System.out.println("�� ����� �� �����, ������ ����� ������"); // ������� ����� ����������. � ��� ������, ��� ����� ������� ��������, � ��� ���
        }
    }
}
