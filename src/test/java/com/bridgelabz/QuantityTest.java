package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1FeetShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetandFeet_FromSameRef_WhenEqual_ShouldReturntrue() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean actual = feet1.equals(feet2);
        Assertions.assertTrue(actual);
    }

    @Test
    void givenFeetandFeet_FromDiffRef_WhenEqual_ShouldReturntrue() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0inchand0inchShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0inchAnd1inchShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0inchAndNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_ShouldReturnTrue() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean actual = inch2.equals(inch1);
        Assertions.assertTrue(actual);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_WhenCompared_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCopared_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given0Yardand0YardShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1YardShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardandNullShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3feetCompareTo1YardShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1feetCompareTo1YardShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1inchCmpareto1yardShouldReturnNotEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36inchcompareto1yardShouldReturnTrue() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardCompareTo36InchShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardCompareTo3FeetShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0centimeterAnd0cetimeterShouldReturnEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem cm2 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        Assertions.assertEquals(cm1,cm2);
    }

    @Test
    public void given0cmAnd1cmShouldReturnNotEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem cm2 = new UnitMeasurementSystem(Length.CENTIMETER,1.0);
        Assertions.assertNotEquals(cm1,cm2);
    }
    @Test
    public void given0cmAndNullShouldReturnNotEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem cm2 = null;
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    public void givencmandcmFromSameReference_WhenEqualShouldReturnTrue() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER,0.0);
        boolean actual=cm.equals(cm1);
        Assertions.assertTrue(actual);
    }

    @Test
    void given2InchComapreTo5CmShould_ReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER,5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }
}

