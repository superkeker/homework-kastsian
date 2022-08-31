package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot7.createPhoneNumber;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot7Test {

    @Test
    public void testCreatePhoneNumber() {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        assertEquals("(123) 456-7890", createPhoneNumber(arr));
    }
}