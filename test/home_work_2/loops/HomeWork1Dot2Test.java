package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static home_work_2.loops.HomeWork1Dot2.multiplyNumbers;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot2Test {
    @Test
    public void testMultiplyNumbers(){
        assertEquals( "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", multiplyNumbers(String.valueOf(181232375)));
        assertEquals( "Введено не целое число", multiplyNumbers("99.2"));
        assertEquals( "Введено не целое число", multiplyNumbers("181232375.6"));
        assertEquals( "Введено не число", multiplyNumbers("Привет"));
        assertEquals( "Введено не число", multiplyNumbers("1+3"));
    }
}