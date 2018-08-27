package ru.job4j.array;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void calculate()  {
        Square sq = new Square();
       int[] a = sq.calculate(4);
       int[] exp = {1,4,9,16};
       assertThat(a,is(exp));
    }
}