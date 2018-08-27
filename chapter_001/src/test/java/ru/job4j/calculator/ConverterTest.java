package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {


    @Test
    public void when60RubleToDollarThen1() {
       double result = 0;
        Converter conv = new Converter();

        conv.SetVal("EUR",50);
        conv.SetVal("USD",40);

        result = conv.RubToVal(5,"EUR", false);
        assertThat(result, is(250.0));

        result = conv.RubToVal(250,"EUR", true);
        assertThat(result, is(5.0));

        result = conv.RubToVal(250,"USD", false);
        assertThat(result, is(10000.0));

        result = conv.RubToVal(240,"USD", true);
        assertThat(result, is(6.0));
    }

}