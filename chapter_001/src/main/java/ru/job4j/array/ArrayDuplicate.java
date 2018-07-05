package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array){
        int temp = 0;
        for (int i = 0; i<array.length;i++){
            for (int j = i+1; j<array.length-temp;j++){
                if (array[i].equals(array[j])){

                    for (int k=j; k < array.length-temp;k++){
                    array[k]=array[k+1];
                    }
                    temp++;
                }
            }
        }
        array = Arrays.copyOf(array,array.length-temp);
        return array;
    }
}
