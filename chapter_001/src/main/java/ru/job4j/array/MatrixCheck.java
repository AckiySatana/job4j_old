package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int len = Math.min(data.length, data[0].length);
        for (int i = 0; i<len-1; i++) {
            if (data[i][i] != data[i+1][i+1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}