package home_work_1.alteration_of_the_task_6.clases;

import home_work_1.alteration_of_the_task_6.api.ICommunicationPrinter;

public class HomeWork1Dot6Dot3 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        switch (name){
            case "����":
                return "������! \n � ���� ��� ����� ����";
            case "���������":
                return "� ���� ��� ����� ����";
            default:
                return "������ ����, � �� ���?";
        }
    }
}
