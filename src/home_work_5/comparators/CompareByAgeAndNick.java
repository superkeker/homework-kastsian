package home_work_5.comparators;

import home_work_5.dto.AnimalDTO;

import java.util.Comparator;

public class CompareByAgeAndNick implements Comparator<AnimalDTO> {
    @Override
    public int compare(AnimalDTO o1, AnimalDTO o2) {
        int compareAge = o1.getAge() - o2.getAge();
        int compareNick = o1.getNick().compareTo(o2.getNick());
        return (compareAge == 0) ? compareNick : compareAge;
    }
}
