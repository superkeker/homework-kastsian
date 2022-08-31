package home_work_1.alteration_of_the_task_6.clases;

import home_work_1.alteration_of_the_task_6.api.ICommunicationPrinter;

public class HomeWork1Dot6Dot3 implements ICommunicationPrinter {
    @Override
    public String welcome(String name) {
        switch (name){
            case "Вася":
                return "Привет! \n Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
