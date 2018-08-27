package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void calc()  {
        Factorial fak = new Factorial();
        int res;
        res = fak.calc(3);
        assertThat(res,is(6));

        res = fak.calc(0);
        assertThat(res,is(1));
    }

}