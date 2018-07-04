package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;

public class PaintTest {
    @Test
    public void rightTrl() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,is(
                new StringJoiner(System.lineSeparator(), "",System.lineSeparator())
                    .add("^   ")
                    .add("^^  ")
                    .add("^^^ ")
                    .add("^^^^")
                    .toString()
        ));
    }

    @Test
    public void leftTrl() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,is(
                new StringJoiner(System.lineSeparator(), "",System.lineSeparator())
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
        ));
    }
}