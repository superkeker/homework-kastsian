package home_work_1.alteration_of_the_task_6.clases;

import home_work_1.alteration_of_the_task_6.api.ICommunicationPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot6Dot2Test {
    private final ICommunicationPrinter printer = new HomeWork1Dot6Dot2();

    @Test
    public void testWelcome(){
        assertEquals("������! \n � ���� ��� ����� ����", printer.welcome("����"));
        assertEquals("� ���� ��� ����� ����", printer.welcome("���������"));
        assertEquals("������ ����, � �� ���?", printer.welcome("�������"));
    }

}