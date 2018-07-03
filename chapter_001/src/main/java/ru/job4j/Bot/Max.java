package ru.job4j.Bot;


public class Max {
    public int max(int first, int second) {
        if (first < second) first = second;
        return first;
    }
}