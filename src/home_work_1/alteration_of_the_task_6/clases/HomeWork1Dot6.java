package home_work_1.alteration_of_the_task_6.clases;

import home_work_1.alteration_of_the_task_6.api.ICommunicationPrinter;

import java.util.Objects;

public class HomeWork1Dot6 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        if (Objects.equals(name, "����")){
            return "������! \n � ���� ��� ����� ����";
        }
        if(Objects.equals(name, "���������")){
            return "� ���� ��� ����� ����";
        }
        else {
            return "������ ����, � �� ���?";
        }
    }
}
