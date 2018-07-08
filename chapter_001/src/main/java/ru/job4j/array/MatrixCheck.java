package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {

        boolean result = true;
        int len = Math.min(data.length, data[0].length);
        for (int i = 0; i < len; i++) {
            if ((data[0][0] != data[i][i]) || (data[0][0] != data[len - 1 - i][i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}