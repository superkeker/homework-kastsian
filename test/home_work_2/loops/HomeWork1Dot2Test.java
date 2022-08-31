package home_work_2.loops;

import org.junit.jupiter.api.Test;

import static home_work_2.loops.HomeWork1Dot2.multiplyNumbers;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot2Test {
    @Test
    public void testMultiplyNumbers(){
        assertEquals( "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", multiplyNumbers(String.valueOf(181232375)));
        assertEquals( "������� �� ����� �����", multiplyNumbers("99.2"));
        assertEquals( "������� �� ����� �����", multiplyNumbers("181232375.6"));
        assertEquals( "������� �� �����", multiplyNumbers("������"));
        assertEquals( "������� �� �����", multiplyNumbers("1+3"));
    }
}