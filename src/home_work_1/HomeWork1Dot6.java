package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork1Dot6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String s = scanner.next();
        if (Objects.equals(s, "����")){
            System.out.println("������!");
            System.out.println("� ���� ��� ����� ����");
        }
    }
}
