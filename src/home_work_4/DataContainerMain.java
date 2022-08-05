package home_work_4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> dataArray = new DataContainer<>(new Integer[3]);
        dataArray.add(1);
        dataArray.add(2);
        dataArray.add(3);
        System.out.println(Arrays.toString(dataArray.getItems()));
    }
}
