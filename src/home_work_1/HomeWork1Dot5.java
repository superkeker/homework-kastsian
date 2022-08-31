package home_work_1;

import java.util.Scanner;

public class HomeWork1Dot5 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday){
            return true;
        } else {
            return weekday && vacation;
        }
    }
}
