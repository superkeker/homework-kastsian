package home_work_1.alteration_of_the_task_6.clases;

import home_work_1.alteration_of_the_task_6.api.ICommunicationPrinter;

import java.util.Objects;

public class HomeWork1Dot6Dot2 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        if (Objects.equals(name, "Вася")){
            return "Привет! \n Я тебя так долго ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а вы кто?";
    }
}
