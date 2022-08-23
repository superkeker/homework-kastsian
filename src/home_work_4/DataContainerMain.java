package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> dataArray = new DataContainer<>(new String[5]);
        dataArray.add("444");
        dataArray.add("111");
        dataArray.add("222");
        dataArray.delete(1);
        dataArray.delete(Integer.valueOf(222));
        //dataArray.add("f1");
        System.out.println(Arrays.toString(dataArray.getItems()));
        System.out.println(Arrays.toString(dataArray.getItems()));
    }
}
