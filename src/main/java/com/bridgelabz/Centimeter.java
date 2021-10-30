package com.bridgelabz;

import java.util.Objects;

public class Centimeter {

    private final double value;

    /**
     *
     * @param value
     */
    public Centimeter(double value) {
        this.value=value;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Centimeter)) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(that.value, value) == 0;
    }
}
