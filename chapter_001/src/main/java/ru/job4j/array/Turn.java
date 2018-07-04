package ru.job4j.array;

public class Turn {

    public int[] turnen (int[] arr){
        int temp;
        for (int i = 0; i <= arr.length/2 -1; i++){
            temp = arr[arr.length-i-1]; //Запишем в переменную значение крайнего не обработанного элемента
            arr[arr.length-i-1] = arr[i] ;
            arr[i] = temp;
        }
        return arr;
    }
}
