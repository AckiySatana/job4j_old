package ru.job4j.array;

/**Проверка одинаковых элементов
 *
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++){
            if (data[i-1] != data[i]) return result;
        }
        return true;
    }
}