package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot4Dot6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ���: ");
        int year = scanner.nextInt();

        if (year%4 == 0){
            System.out.println("��� �������� ����������");
        } else {
            System.out.println("��� �� �������� ����������");
        }
    }
}
