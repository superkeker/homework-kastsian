package home_work_1;

public class HomeWork1Dot2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int exercise2Dot1 = 5 + a / b;
        System.out.println("��������� ������� 2.1: " + exercise2Dot1); // ��������� �� 5.25 ��������� ��� int

        int exercise2Dot2 = (5 + a) / b;
        System.out.println("��������� ������� 2.2: " + exercise2Dot2); // ��������� 0, ������ ��� integer �� ���������� ����� ��� �������

        int exercise2Dot3 = (5 + a++) / b;
        System.out.println("��������� ������� 2.3: " + exercise2Dot3); // a++ �� �� ��� �� ������, ��� ��� ����-�������

        int a4 = 2;
        int exercise2Dot4 = (5 + a4++) / --b;
        System.out.println("��������� ������� 2.4: " + exercise2Dot4); // ��������� ���-�������� ���������� 7/7

        int a5 = 2;
        int b5 = 8;
        int exercise2Dot5 = (5 * 2 >> a5++) / --b5;
        System.out.println("��������� ������� 2.5: " + exercise2Dot5); // 10 � �������� ������� ����� 1010, ����� ������ � ����� �� 2 ���������� 10, �� ���� 3. 3 / 7

        int a6 = 2;
        int b6 = 8;
        int exercise2Dot6 = (5+7 > 20 ? 68 : 22 * 2 >> a6++) / --b6; // 5+7 ������ 20, ������� ��������� � 22*2
        System.out.println("��������� ������� 2.6: " + exercise2Dot6);

        /* int a7 = 2;
        int b7 = 8;
        int exercise2Dot7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a7++) / --b7; // boolean �� �������
        System.out.println("��������� ������� 2.6: " + exercise2Dot7); */

        boolean exercise2Dot8 = 6 - 2 > 3 && 12 * 12 <= 119; // 12*12=144
        System.out.println("��������� ������� 2.8: " + exercise2Dot8);

        boolean exercise2Dot9 = true && false;
        System.out.println("��������� ������� 2.9: " + exercise2Dot9); // ����� ���� true - ������ ��� �������� ���� true
    }
}
