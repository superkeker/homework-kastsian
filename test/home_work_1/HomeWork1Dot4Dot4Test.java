package home_work_1;

import org.junit.jupiter.api.Test;

import static home_work_1.HomeWork1Dot4Dot4.bytesKilobytes;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork1Dot4Dot4Test {

    @Test
    public void testBytesKilobytes() {
        assertEquals(1024, bytesKilobytes(1, 'b'));
        assertEquals(1, bytesKilobytes(1024, 'k'));
        assertEquals(0, bytesKilobytes(1024, 'v'));
    }
}