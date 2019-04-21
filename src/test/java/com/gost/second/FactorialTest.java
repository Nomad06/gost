package com.gost.second;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void computeTest(){
        int result = 2;
        Assert.assertEquals(Factorial.compute(2), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeNegativeValueTest(){
        Factorial.compute(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeWithBorderNegativeValueTest(){
        Factorial.compute(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeFormulaNegativeValueTest(){
        Factorial.computeFormula(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeWithGreaterBorderTest(){
        Factorial.compute(5, 6);
    }

    @Test
    public void computeWithBorderTest(){
        int result = 60;
        int result2 = 5;
        Assert.assertEquals(Factorial.compute(5, 2), result);
        Assert.assertEquals(Factorial.compute(5, 5), result2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void computeFormulaWithGreaterRTest(){
        Factorial.computeFormula(5, 6);
    }

    @Test
    public void computeFormulaTest(){
        //m!*r!*(m-r)!
        // m = 5 AND r = 3 AND m - r = 2
        // m! = 120 and r! = 6 and (m - r)! = 2 => 120 * 6 * 2 = 1440
        int result = 1440;
        Assert.assertEquals(Factorial.computeFormula(5, 3), result);
        Assert.assertEquals(Factorial.computeFormula(5, 5), 0);
    }

}
