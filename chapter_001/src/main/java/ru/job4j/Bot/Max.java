package ru.job4j.Bot;


public class Max {

    public int max(int first, int second) {
     //   тернарный  оператор
    return  (first < second) ? second : first;
    }

    public int max (int first, int second, int third) {
        return max( max(first, second),  third);
    }
}