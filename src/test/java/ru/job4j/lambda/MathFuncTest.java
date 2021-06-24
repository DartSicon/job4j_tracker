package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MathFuncTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        MathFunc function = new MathFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticThenQuadraticResults() {
        MathFunc function = new MathFunc();
        List<Double> result = function.diapason(5, 8, x -> 2 * Math.pow(x, 2) + 3 * x + 1);
        List<Double> expected = Arrays.asList(66D, 91D, 120D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialThenExponentialResults() {
        MathFunc function = new MathFunc();
        List<Double> result = function.diapason(5, 8, x -> Math.pow(4, x));
        List<Double> expected = Arrays.asList(1024D, 4096D, 16384D);
        assertThat(result, is(expected));
    }
}