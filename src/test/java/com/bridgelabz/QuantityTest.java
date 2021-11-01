package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1FeetShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetandFeet_FromSameRef_WhenEqual_ShouldReturntrue() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean actual = feet1.equals(feet2);
        Assertions.assertTrue(actual);
    }

    @Test
    public void givenFeetandFeet_FromDiffType_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,1.2);
        Length feet2 = new Length(Length.Unit.FEET,1);
        Assertions.assertNotEquals(feet1, feet2);
    }


    @Test
    public void given0inchand0inchShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assertions.assertEquals(inch1, inch2);
    }



    @Test
    public void given0inchAnd1inchShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0inchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean actual = inch2.equals(inch1);
        Assertions.assertTrue(actual);
    }

    @Test
    public void given1Feetcompareto12inch_ShouldReturnTrueWhenEquals() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.feetinchComparison(1);
        Assertions.assertEquals(12, comparison);
    }

    @Test
    public void given0Yardand0YardShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1YardShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = new Length(Length.Unit.YARD,1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardandNullShouldReturnNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD,0.0);
        Length yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3feetCompareTo1YardShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.feetyardCompaison(3);
        Assertions.assertEquals(1, comparison);
    }

    @Test
    public void given1feetCompareTo1YardShouldReturnNotEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.feetyardCompaison(1);
        Assertions.assertNotEquals(1, comparison);
    }

    @Test
    public void given1inchCmpareto1yardShouldReturnNotEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.inchyardComparison(100);
        Assertions.assertNotEquals(1, comparison);

    }

    @Test
    public void given36inchcompareto1yardShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.inchyardComparison(36);
        Assertions.assertEquals(1, comparison);
    }

    @Test
    public void given1YardCompareTo36InchShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.yardinchComparison(1);
        Assertions.assertEquals(36, comparison);
    }

    @Test
    public void given1YardCompareTo3FeetShouldReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.yardfeetComparison(1);
        Assertions.assertEquals(3,comparison);
    }

    @Test
    public void given0cmAnd0cmShouldReturnEqual() {
        Length cm1 = new Length(Length.Unit.CENTIMETER,0.0);
        Length cm2 = new Length(Length.Unit.CENTIMETER,0.0);
        Assertions.assertEquals(cm1,cm2);
    }

    @Test
    public void given0cmAnd1cmShouldReturnNotEqual() {
        Length cm1 = new Length(Length.Unit.CENTIMETER,0.0);
        Length cm2 = new Length(Length.Unit.CENTIMETER,1.0);
        Assertions.assertNotEquals(cm1,cm2);
    }
    @Test
    public void given0cmAndNullShouldReturnNotEqual() {
        Length cm1 = new Length(Length.Unit.CENTIMETER,0.0);
        Length cm2 = null;
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    public void givencmandcmFromSameReference_WhenEqualShouldReturnTrue() {
        Length cm1 = new Length(Length.Unit.CENTIMETER,0.0);
        Length cm = new Length(Length.Unit.CENTIMETER,0.0);
        boolean actual=cm.equals(cm1);
        Assertions.assertTrue(actual);
    }

    @Test
    void given2InchComapreTo5CmShould_ReturnEqual() {
        LengthEquality equality = new LengthEquality();
        double comparison = equality.inchcentimeterComparison(2);
        Assertions.assertEquals(5,comparison);
    }
}
