package home_work_2.arrays.homework2Dot3;

import home_work_2.api.IArraysOperation;

public class ForOperation implements IArraysOperation {

    @Override
    public String arrayElementsRevers(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length-1; i >= 0; i--) {
            if(i == array.length-1){
                sb.append(array[i]);
                i--;
            }
            sb.append(" ").append(array[i]);
        }
        return String.valueOf(sb);
    }

    @Override
    public String secondArrayElement(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < array.length; i += 2) {
            if(i == 1){
                sb.append(array[i]);
                i += 2;
            }
            sb.append(" ").append(array[i]);
        }
        return String.valueOf(sb);
    }

    @Override
    public String arrayElements(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                sb.append(array[i]);
                i++;
            }
            sb.append(" ").append(array[i]);
        }
        return String.valueOf(sb);
    }
}
