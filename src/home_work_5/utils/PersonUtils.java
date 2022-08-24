package home_work_5.utils;

import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PersonUtils {
    private PersonUtils(){}
    public static String createYourPassword(String yourPassword){
        if(yourPassword.length() >= 5 && yourPassword.length() <= 10){
            return yourPassword;
        } else {
            while (true){
                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите пароль ещё раз.");
                String yourNewPassword = scanner.next();

                if(yourNewPassword.length() >= 5 && yourNewPassword.length() <= 10) {
                    return yourNewPassword;
                }
            }
        }
    }
    public static String randomNameForPerson() {
        Random random = new Random();
        String [] names = {"Алиса", "Максим", "Анна", "Марк", "Мария", "Михаил", "София", "Денис", "Даздраперма", "Теодор"};
        return names[random.nextInt(10)];
    }
    public static String rusLettersRandomString() {
        StringBuilder str = new StringBuilder();

        int length = ThreadLocalRandom.current().nextInt(5, 10);
        for (int i = 0; i < length; i++) {
            char c = (char) ThreadLocalRandom.current().nextInt(1040, 1104);
            str.append(c);
        }
        return String.valueOf(str);
    }
    public static String englishLettersRandomString(){
        StringBuilder str = new StringBuilder();

        int length = ThreadLocalRandom.current().nextInt(5, 10);
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            while (!flag){
                byte randomNumber = (byte) ThreadLocalRandom.current().nextInt(65, 123);
                if(randomNumber >= 65 && randomNumber <= 90 || randomNumber >= 97 && randomNumber <= 122){
                    char c = (char) randomNumber;
                    str.append(c);
                    flag = true;
                }
            }
        }
        return String.valueOf(str);
    }
    public static String randomNameFromFile() throws Exception {
        Scanner file = new Scanner(new FileReader("C:\\projects\\It-Academy\\JD1\\homework\\src\\home_work_5\\names.txt"));
        Random random = new Random();
        String names = file.nextLine();
        file.close();
        String[] namesArray = names.split(" ");
        return namesArray[random.nextInt(namesArray.length)];
    }
    public static String randomNickFromFile() throws Exception {
        Scanner file = new Scanner(new FileReader("C:\\projects\\It-Academy\\JD1\\homework\\src\\home_work_5\\nicks.txt"));
        Random random = new Random();
        String animalNames = file.nextLine();
        file.close();
        String[] namesArray = animalNames.split(" ");
        return namesArray[random.nextInt(namesArray.length)];
    }
}

