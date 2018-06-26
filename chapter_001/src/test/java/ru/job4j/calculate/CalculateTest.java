package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Calc
* @author Ackiy Satana (mailto:ter.on@mail.ru)
* @version 0.0001
* @since 26
*/

public class CalculateTest {

/**
* Test echo.
*/ 

public void whenTakeNameThenTreeEchoPlusName() {
    String input 	= "Ackiy Satana";
    String expect = "Echo, echo, echo : Ackiy Satana"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}
 