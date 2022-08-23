package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T>{
    private T[] data;

    public DataContainer(T[] data){
        this.data = data;
    }
    public int add(T item){
        if(item != null){
            for (int indexOfNumber = 0; indexOfNumber <= data.length-1; indexOfNumber++){
                if(data[indexOfNumber] == null){
                    this.data[indexOfNumber] = item;
                    return indexOfNumber;
                }
            }
            data = Arrays.copyOf(data, data.length+1);
            data[data.length-1] = item;
            return data.length-1;
        }
        return -1;
    }
    public T get(int index){
        if(index <= data.length-1){
            return data[index];
        }
        return null;
    }
    public T[] getItems(){
        return data;
    }
    public boolean delete(int index){
        if(index >= 0 && index <= data.length-1){
            data[index] = null;
            for (int i = 0; i < data.length-1; i++) {
                if(data[i] == null){
                    T buf = data[i];
                    data[i] = data[i+1];
                    data[i+1] = buf;
                }
            }
            data = Arrays.copyOf(data, data.length-1);
            return true;
        }
        return false;
    }
    public boolean delete(T item){
        if(item != null){
            for (int index1 = 0; index1 <= data.length-1; index1++) {
                if(Objects.equals(item, data[index1])){
                    data[index1] = null;
                    for (int index2 = index1; index2 < data.length-1; index2++) {
                        if(data[index2] == null){
                            T buf = data[index2];
                            data[index2] = data[index2+1];
                            data[index2+1] = buf;
                        }
                    }
                    data = Arrays.copyOf(data, data.length-1);
                    return true;
                }
            }
        }
        return false;
    }
    public void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length - 1; i++) {
            for (int k = i + 1; k < data.length; k++) {
                if (comparator.compare(data[i], data[k]) > 0) {
                    T buf = data[k];
                    data[k] = data[i];
                    data[i] = buf;
                }
            }
        }
    }
}