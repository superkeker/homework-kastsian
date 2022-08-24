package home_work_5.utils;

import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalUtils {
    private AnimalUtils(){}

    public static int setAnimalAge(int age){
        if(age >= 1 && age <= 15){
            return age;
        } else {
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Вы ввели неправильный возраст. Попробуйте ещё раз.");
                int newAge = scanner.nextByte();
                if(newAge >= 1 && newAge <= 15){
                    return newAge;
                }
            }
        }
    }
    public static String randomNickForAnimal() {
        Random random = new Random();
        String [] nicks = {"Альфа", "Джек", "Боня", "Рекс", "Джеси", "Хатико", "Дик", "Лорд", "Альма", "Рич"};
        return nicks[random.nextInt(10)];
    }
    public static String rusLettersRandomString() {
        StringBuilder str = new StringBuilder();

        int length = ThreadLocalRandom.current().nextInt(10);
        for (int i = 0; i < length; i++) {
            char c = (char) ThreadLocalRandom.current().nextInt(1040, 1104);
            str.append(c);
        }
        return String.valueOf(str);
    }
    public static String randomAnimalNameFromFile() throws Exception {
        Scanner file = new Scanner(new FileReader("C:\\projects\\It-Academy\\JD1\\homework\\src\\home_work_5\\animal names.txt"));
        Random random = new Random();
        String animalNames = file.nextLine();
        file.close();
        String[] namesArray = animalNames.split(" ");
        return namesArray[random.nextInt(namesArray.length)];
    }
}
