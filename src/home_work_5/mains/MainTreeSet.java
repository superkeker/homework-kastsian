package home_work_5.mains;

import home_work_5.comparators.CompareByAge;
import home_work_5.comparators.CompareByPassword;
import home_work_5.dto.AnimalDTO;
import home_work_5.dto.PersonDTO;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static home_work_5.utils.AnimalUtils.setAnimalAge;
import static home_work_5.utils.PersonUtils.*;
import static home_work_5.utils.RandomStringUtils.completelyRandomString;

public class MainTreeSet {
    public static void main(String[] args) {
        CompareByPassword compareByPassword = new CompareByPassword();
        CompareByAge compareByAge = new CompareByAge();
        TreeSet<PersonDTO> personList = new TreeSet<>(compareByPassword);
        TreeSet<AnimalDTO> animalList = new TreeSet<>(compareByAge);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            personList.add(new PersonDTO(englishLettersRandomString(), createYourPassword(completelyRandomString()), rusLettersRandomString()));
        }
        long stop1 = System.currentTimeMillis();

        Iterator<PersonDTO> personIt = personList.iterator();

        long start2 = System.currentTimeMillis();
        while (personIt.hasNext()){
            PersonDTO personDTO = personIt.next();
            System.out.println("���������: " + personDTO.getNick() + " ������: " + personDTO.getPassword() + " ���: " + personDTO.getName());
        }
        long stop2 = System.currentTimeMillis();

        Iterator<PersonDTO> personIt2 = personList.iterator();

        long start3 = System.currentTimeMillis();
        while (personIt2.hasNext()){
            personIt2.next();
            personIt2.remove();
        }
        long stop3 = System.currentTimeMillis();

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animalList.add(new AnimalDTO(setAnimalAge(ThreadLocalRandom.current().nextInt(1, 16)), rusLettersRandomString()));
        }
        long stop4 = System.currentTimeMillis();

        Iterator<AnimalDTO> animalIt = animalList.iterator();

        long start5 = System.currentTimeMillis();
        while (animalIt.hasNext()){
            AnimalDTO animal = animalIt.next();
            System.out.println("�������: " + animal.getAge() + " ������: " + animal.getNick());
        }
        long stop5 = System.currentTimeMillis();

        Iterator<AnimalDTO> animalIt2 = animalList.iterator();
        long start6 = System.currentTimeMillis();
        while (animalIt2.hasNext()){
            animalIt2.next();
            animalIt2.remove();
        }
        long stop6 = System.currentTimeMillis();


        System.out.println("\n��������: ���������� ������ ���������." + " ������ " + (stop1 - start1) + " ��");
        System.out.println("��������: ������������." + " ������ " + (stop2 - start2) + " ��");
        System.out.println("��������: �������� ��������." + " ������ " + (stop3 - start3) + " ��");

        System.out.println("\n��������: ���������� ������ ���������." + " ������ " + (stop4 - start4) + " ��");
        System.out.println("��������: ������������." + " ������ " + (stop5 - start5) + " ��");
        System.out.println("��������: �������� ��������." + " ������ " + (stop6 - start6) + " ��");

        System.out.println(personList);
        System.out.println(animalList);
    }
}
