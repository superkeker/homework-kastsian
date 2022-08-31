package home_work_2.arrays.homework2Dot3;

import home_work_2.api.IArraysOperation;

public class WhileOperation implements IArraysOperation {
    @Override
    public String arrayElementsRevers(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i2 = array.length-1;
        while (i2 >= 0){
            if(i2 == array.length-1){
                sb.append(array[i2]);
                i2--;
            }
            sb.append(" ").append(array[i2]);
            i2--;
        }
        return String.valueOf(sb);
    }

    @Override
    public String secondArrayElement(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        while (i2 < array.length){
            if(i2 == 1){
                sb.append(array[i2]);
                i2 += 2;
            }
            sb.append(" ").append(array[i2]);
            i2 += 2;
        }
        return String.valueOf(sb);
    }

    @Override
    public String arrayElements(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < array.length){
            if(i2 == 0){
                sb.append(array[i2]);
                i2++;
            }
            sb.append(" ").append(array[i2]);
            i2++;
        }
        return String.valueOf(sb);
    }
}
