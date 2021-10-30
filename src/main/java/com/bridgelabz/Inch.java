package com.bridgelabz;

public class Inch {
    private double value;

    /**
     *
     * @param value
     */
    public Inch(double value) {
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
        if (!(o instanceof Inch)) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
