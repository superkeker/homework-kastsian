package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot5 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean b = false;
        if(weekday == false && vacation == false){
            b = true;
        } else if (weekday == true && vacation == false) {
            b = false;
        } else if (weekday == false && vacation == true){
            b = true;
        } else if (weekday == true && vacation == true){
            b = true;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ����: \"��\" ��� \"���\"? ");
        String s1 = scanner.next();
        System.out.println("������ ������: \"��\" ��� \"���\"? ");
        String s2 = scanner.next();

        boolean weekday1 = false;
        boolean vacation1 = false;

        if (s1.equals("���") && s2.equals("���")){
            weekday1 = false;
            vacation1 = false;
        } else if (s1.equals("��") && s2.equals("���")) {
            weekday1 = true;
            vacation1 = false;
        } else if (s1.equals("���") && s2.equals("��")) {
            weekday1 = false;
            vacation1 = true;
        } else if (s1.equals("��") && s2.equals("��")) {
            weekday1 = true;
            vacation1 = true;
        } else {
            System.out.println("�� ����� ���-�� �� ��.");
            System.exit(0);
        }
        if (sleepIn(weekday1, vacation1) == true){
            System.out.println("����� ����� ������");
        } else if (sleepIn(weekday1, vacation1) == false) {
            System.out.println("���� ���������");
        }
    }
}
