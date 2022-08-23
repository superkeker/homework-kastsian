package home_work_5.comparators;

import home_work_5.dto.PersonDTO;

import java.util.Comparator;

public class CompareByLengthAndNick implements Comparator<PersonDTO> {
    @Override
    public int compare(PersonDTO o1, PersonDTO o2) {
        int passwordLengthCompare = o1.getPassword().length() - o2.getPassword().length();
        int nickCompare = o1.getNick().compareTo(o2.getNick());
        return (passwordLengthCompare == 0) ? nickCompare : passwordLengthCompare;
    }
}
