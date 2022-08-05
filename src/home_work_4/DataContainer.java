package home_work_4;

import java.util.Arrays;

public class DataContainer<T> {
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
}
