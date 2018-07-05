package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        Boolean flag;
        do {
            flag = false;
            int temp;
            for (int i=0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        } while(flag);
        return array;
    }
}
