package ru.job4j.array;

import org.junit.Test;

import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void findIndex()  {
        int[] a = {1,2,3,4,5,6,7,8};

        FindLoop floop = new FindLoop();
        int res = floop.FindIndex(a,3);
        assertThat(res,is(2));
    }

}