package ru.job4j.array;

public class Square {

    public int[] calculate(int bound){
        int[] a = new int [bound];
        for (int i = 0; i < a.length; i++){
            a[i] = (i+1) * (i+1);
        }
        return a;
    }
}
