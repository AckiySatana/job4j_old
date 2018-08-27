package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class TurnTest {
    @Test
    public void TestOne() {
        Turn turn = new Turn();
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = turn.turnen(a);
        int[] c = {9,8,7,6,5,4,3,2,1};
        assertThat(b,is(c));
    }

    @Test
    public void TestTwo() {
        Turn turn = new Turn();
        int[] a = {1,2,3,4,5,6,7,8};
        int[] b = turn.turnen(a);
        int[] c = {8,7,6,5,4,3,2,1};
        assertThat(b,is(c));
    }
}
