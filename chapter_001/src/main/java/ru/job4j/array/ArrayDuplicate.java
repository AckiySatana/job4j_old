package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/** Очень простой алгоритм
 * Проверяем первую стору на совпадение со всеми строками нижеё
 * Если совпадения нет, то пишем ее порядковую строку
 * счетчик заполненных строк - count
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean fill = true;
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    fill = false;
                    break;
                }
            }
            if (fill){
                array[count]=array[i];
                count++;
                System.out.println();
            }
        }
        array = Arrays.copyOf(array, count);
        return array;
    }
}
