package home_work_2.arrays.homework2Dot3;

import home_work_2.api.IArraysOperation;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public String arrayElementsRevers(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i1 = array.length-1;
        do {
            if(i1 == array.length-1){
                sb.append(array[i1]);
                i1--;
            }
            sb.append(" ").append(array[i1]);
            i1--;
        } while (i1 >= 0);
        return String.valueOf(sb);
    }

    @Override
    public String secondArrayElement(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i1 = 1;
        do {
            if(i1 == 1){
                sb.append(array[i1]);
                i1 += 2;
            }
            sb.append(" ").append(array[i1]);
            i1 += 2;
        } while (i1 < array.length);
        return String.valueOf(sb);
    }

    @Override
    public String arrayElements(int[] array) {
        StringBuilder sb = new StringBuilder();
        int i1 = 0;
        do {
            if(i1 == 0){
                sb.append(array[i1]);
                i1++;
            }
            sb.append(" ").append(array[i1]);
            i1++;
        } while (i1 < array.length);
        return String.valueOf(sb);
    }
}
