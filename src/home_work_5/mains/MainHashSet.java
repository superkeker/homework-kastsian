package home_work_5.mains;

import home_work_5.comparators.CompareByAgeAndNick;
import home_work_5.comparators.CompareByLengthAndNick;
import home_work_5.dto.AnimalDTO;
import home_work_5.dto.PersonDTO;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static home_work_5.utils.AnimalUtils.setAnimalAge;
import static home_work_5.utils.PersonUtils.*;
import static home_work_5.utils.RandomStringUtils.completelyRandomString;

public class MainHashSet {
    public static void main(String[] args) {
        CompareByLengthAndNick compareByLengthAndNick = new CompareByLengthAndNick();
        CompareByAgeAndNick compareByAgeAndNick = new CompareByAgeAndNick();
        HashSet<PersonDTO> personList = new HashSet<>();
        HashSet<AnimalDTO> animalList = new HashSet<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            personList.add(new PersonDTO(englishLettersRandomString(), createYourPassword(completelyRandomString()), rusLettersRandomString()));
        }
        long stop1 = System.currentTimeMillis();

        List<PersonDTO> personList2 = new ArrayList<>(personList);
        personList2.sort(compareByLengthAndNick);

        Iterator<PersonDTO> personIt = personList2.iterator();

        long start2 = System.currentTimeMillis();
        while (personIt.hasNext()){
            PersonDTO personDTO = personIt.next();
            System.out.println("Псевдоним: " + personDTO.getNick() + " Пароль: " + personDTO.getPassword() + " Имя: " + personDTO.getName());
        }
        long stop2 = System.currentTimeMillis();

        Iterator<PersonDTO> personIt2 = personList2.iterator();

        long start3 = System.currentTimeMillis();
        while (personIt2.hasNext()){
            personIt2.next();
            personIt2.remove();
        }
        long stop3 = System.currentTimeMillis();

        personList = new HashSet<>(personList2);
        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animalList.add(new AnimalDTO(setAnimalAge(ThreadLocalRandom.current().nextInt(1, 16)), rusLettersRandomString()));
        }
        long stop4 = System.currentTimeMillis();

        List<AnimalDTO> animalList2 = new ArrayList<>(animalList);
        animalList2.sort(compareByAgeAndNick);

        Iterator<AnimalDTO> animalIt = animalList2.iterator();

        long start5 = System.currentTimeMillis();
        while (animalIt.hasNext()){
            AnimalDTO animal = animalIt.next();
            System.out.println("Возраст: " + animal.getAge() + " Кличка: " + animal.getNick());
        }
        long stop5 = System.currentTimeMillis();

        Iterator<AnimalDTO> animalIt2 = animalList2.iterator();
        long start6 = System.currentTimeMillis();
        while (animalIt2.hasNext()){
            animalIt2.next();
            animalIt2.remove();
        }
        long stop6 = System.currentTimeMillis();
        animalList = new HashSet<>(animalList2);

        System.out.println("\nОперация: заполнение первой коллекции." + " Заняла " + (stop1 - start1) + " мс");
        System.out.println("Операция: итерирование." + " Заняла " + (stop2 - start2) + " мс");
        System.out.println("Операция: удаление объектов." + " Заняла " + (stop3 - start3) + " мс");

        System.out.println("\nОперация: заполнение второй коллекции." + " Заняла " + (stop4 - start4) + " мс");
        System.out.println("Операция: итерирование." + " Заняла " + (stop5 - start5) + " мс");
        System.out.println("Операция: удаление объектов." + " Заняла " + (stop6 - start6) + " мс");

        System.out.println(personList);
        System.out.println(animalList);
    }
}
