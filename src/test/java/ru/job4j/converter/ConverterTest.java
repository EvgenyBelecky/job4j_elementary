package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RbIThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RbIThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert500EuroIThen35000Rb() {
        float in = 500;
        float expected = 35000;
        float out = Converter.euroToRubles(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert500DollarsIThen30000Rb() {
        float in = 500;
        float expected = 30000;
        float out = Converter.dollarsToRubles(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}