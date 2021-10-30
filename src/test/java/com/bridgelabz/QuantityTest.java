package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1FeetShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetandFeet_FromSameRef_WhenEqual_ShouldReturntrue() {
        Feet feet1 = new Feet(0.0);
        boolean actual = feet1 == feet1;
        Assertions.assertTrue(actual);
    }

    @Test
    public void givenFeetandFeet_FromDiffType_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(1.2);
        Feet feet2 = new Feet(1);
        Assertions.assertNotEquals(feet1, feet2);
    }


    @Test
    public void given0inchand0inchShouldReturnEqual() {
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given1Feetcompareto12inch_ShouldReturnTrueWhenEquals() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.ftinComparison(1);
        Assertions.assertEquals(12, comparison);
    }

    @Test
    public void given0inchAnd1inchShouldReturnNotEqual() {
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(1);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0inchAndNull_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_ShouldReturnTrue() {
        Inch inch1 = new Inch(0);
        boolean actual = inch1 == inch1;
        Assertions.assertTrue(actual);
    }

    @Test
    public void given0Yardand0YardShouldReturnEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1YardShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardandNullShouldReturnNotEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3feetCompareTo1YardShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.ftydCompaison(3);
        Assertions.assertEquals(1, comparison);
    }

    @Test
    public void given1feetCompareTo1YardShouldReturnNotEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.ftydCompaison(1);
        Assertions.assertNotEquals(1, comparison);
    }

    @Test
    public void given1inchCmpareto1yardShouldReturnNotEqual() {
        LengthEquality equality = new LengthEquality();
        double compare = equality.inydComparison(100);
        Assertions.assertNotEquals(1, compare);

    }

    @Test
    public void given36inchcompareto1yardShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.inydComparison(36);
        Assertions.assertEquals(1, comparison);
    }

    @Test
    public void given1YardCompareTo36InchShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.ydinComparison(1);
        Assertions.assertEquals(36, comparison);
    }

    @Test
    public void given1YardCompareTo3FeetShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.ydftComparison(1);
        Assertions.assertEquals(3,comparison);
    }

    @Test
    public void given0cmAnd0cmShouldReturnEqual() {
        Centimeter cm1 = new Centimeter(0.0);
        Centimeter cm2 = new Centimeter(0.0);
        Assertions.assertEquals(cm1,cm2);
    }
}
