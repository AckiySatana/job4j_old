package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void sort() {
        BubbleSort bubba = new BubbleSort();
        int[]  result, a =  {7,6,4,8,9,5};
        result = bubba.sort(a);

        assertThat(result,is(a));
    }

}