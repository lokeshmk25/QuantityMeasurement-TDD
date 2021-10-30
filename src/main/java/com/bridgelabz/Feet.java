package com.bridgelabz;

public class Feet {

    private double value;

    /**
     *
     * @param value
     */
    public Feet(double value) {
        this.value = value;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}



