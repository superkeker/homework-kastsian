package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot6Dot3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String name = scanner.next();

        switch (name){
            case "����":
                System.out.println("������!");
                System.out.println("� ���� ��� ����� ����");
                break;
            case "���������":
                System.out.println("� ���� ��� ����� ����");
                break;
            default:
                System.out.println("������ ����, � �� ���?");
        }
    }
}
