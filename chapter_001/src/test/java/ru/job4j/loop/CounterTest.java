package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void add() {
        Counter count = new Counter();
        int res = count.add(2,8);
        assertThat(res,is(20));
    }
}