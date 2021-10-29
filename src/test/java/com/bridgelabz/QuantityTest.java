package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0FeetSouldReturnEqual() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Assertions.assertEquals(feet1,feet2);
    }
}
