package home_work_5.comparators;

import home_work_5.dto.PersonDTO;

import java.util.Comparator;

public class CompareByPassword implements Comparator<PersonDTO> {
    @Override
    public int compare(PersonDTO o1, PersonDTO o2) {
        return o1.getPassword().compareTo(o2.getPassword());
    }
}
