package home_work_2.arrays.homework2Dot3;

import home_work_2.api.IArraysOperation;

public class ForEachOperation implements IArraysOperation {
    @Override
    public String arrayElementsRevers(int[] array) {
        StringBuilder result = new StringBuilder();
        int b = 0;
        for(int i : array){
            if(b == 0){
                result.append(i);
            }
            result.append(" ").append(i);
            b = 1;
        }
        return String.valueOf(result.reverse());
    }

    @Override
    public String secondArrayElement(int[] array) {
        StringBuilder result = new StringBuilder();
        int b = 0;
        for(int i : array){
            if (i % 2 == 0){
                if(b == 0){
                    result.append(i);
                }
                result.append(" ").append(i);
                b = 1;
            }
        }
        return String.valueOf(result);
    }

    @Override
    public String arrayElements(int[] array) {
        StringBuilder result = new StringBuilder();
        int b = 0;
        for(int i : array){
            if(b == 0){
                result.append(i);
            }
            result.append(" ").append(i);
            b = 1;
        }
        return String.valueOf(result);
    }
}
