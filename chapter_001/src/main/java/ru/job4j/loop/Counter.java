package ru.job4j.loop;

/** Сумма четных чисел в диопазоне
 *
 */
public class Counter {
    /** Процедура подсчета
     *
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {
        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) result = result + i;
        }
        return result;
    }
}