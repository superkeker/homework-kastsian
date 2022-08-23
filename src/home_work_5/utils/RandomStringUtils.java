package home_work_5.utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomStringUtils {
    private RandomStringUtils(){}
    public static String completelyRandomString() {
        StringBuilder str = new StringBuilder();

        int length = ThreadLocalRandom.current().nextInt(5, 10);
        for (int i = 0; i < length; i++) {
            char c = (char) ThreadLocalRandom.current().nextInt(33, 126);
            str.append(c);
        }
        return String.valueOf(str);
    }
}
