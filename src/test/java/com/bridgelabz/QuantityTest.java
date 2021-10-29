package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0FeetSouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1FeetShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    public void given0FeetandNull_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    void givenFeetandFeet_FromSameRef_WhenEqual_ShouldReturntrue() {
        Feet feet1 = new Feet(0.0);
        boolean actual=feet1==feet1;
        Assertions.assertTrue(actual);
    }

    @Test
    public void givenFeetandFeet_FromDiffType_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(1.2);
        Feet feet2 = new Feet(1);
        Assertions.assertNotEquals(feet1,feet2);
    }
}
