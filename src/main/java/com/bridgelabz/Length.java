package com.bridgelabz;

import java.util.Objects;

public class Length {
    enum Unit {FEET, INCH, YARD, CENTIMETER}

    ;

    private final Unit unit;

    private final double value;

    /**
     * @param value
     */
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}





