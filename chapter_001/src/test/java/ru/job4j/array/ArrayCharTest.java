package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void testTrue(){
        ArrayChar word =new ArrayChar("HellYeah");
        boolean result = word.StartWith("Hell");
        assertThat(result,is(true));

    }

    @Test
    public void testFalse(){
        ArrayChar word =new ArrayChar("HellYeah");
        boolean result = word.StartWith("Heaven");
        assertThat(result,is(false));
    }
}