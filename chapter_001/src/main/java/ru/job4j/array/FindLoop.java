package ru.job4j.array;

/** Element searching
 *
 */
public class FindLoop {
    /** Core of our search
     *
     * @param a
     * @param b
     * @return
     */
    public int FindIndex(int[] a, int b){
        for (int i = 0; i < a.length; i++){
            if (a[i] == b) return i;
        }
        return -1;
    }
}
