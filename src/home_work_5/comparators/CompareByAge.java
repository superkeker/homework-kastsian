package home_work_5.comparators;

import home_work_5.dto.AnimalDTO;

import java.util.Comparator;

public class CompareByAge implements Comparator<AnimalDTO> {

    @Override
    public int compare(AnimalDTO o1, AnimalDTO o2) {
        return o1.getAge() - o2.getAge();
    }
}
