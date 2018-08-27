package ru.job4j.array;

public class ArrayChar {
    private char[] data;

    /** Filling the string Constructor
     *
     * @param line
     */
    public ArrayChar (String line){
        this.data = line.toCharArray();
    }
    public boolean StartWith(String prefix){
        boolean result  = true;
        char[]  value   = prefix.toCharArray();
        for (int i = 0; i < value.length; i++){
            if (value[i] != this.data[i]){
                result = false;
                break;
            }
        }
        return result;
    }

}