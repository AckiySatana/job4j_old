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
        int temp = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] == b) {
                temp = i;
                break;
            }
        }
        return temp;
    }
}
