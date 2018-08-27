package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }


    @Test
    public void whenDivOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 5);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 10D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 7);
        double result = calc.getResult();
        double expected = 3;
        assertThat(result, is(expected));
    }


}