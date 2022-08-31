package home_work_2.arrays.homework2Dot3;

import home_work_2.api.IArraysOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForOperationTest {
    private final IArraysOperation arraysOperation = new ForOperation();

    @Test
    public void testArrayElementsRevers() {
        int[] arr = {1, 2, 3, 4, 5};
        Assertions.assertEquals("5 4 3 2 1", arraysOperation.arrayElementsRevers(arr));
    }

    @Test
    public void secondArrayElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals("2 4 6 8 10", arraysOperation.secondArrayElement(arr));
    }

    @Test
    public void testArrayElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals("1 2 3 4 5 6 7 8 9 10", arraysOperation.arrayElements(arr));
    }

}