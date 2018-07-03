package ru.job4j.loop;

/** Факториал
 *
 */
public class Factorial {
    /** Расчет факториала
     *
     * @param n
     * @return
     */
    public int calc(int n) {
        int result = 1;
        if (n==0) return 1;
        for (int i=1; i<=n ;i++) {
            result = result *i;
        }
        return result;
    };
}
