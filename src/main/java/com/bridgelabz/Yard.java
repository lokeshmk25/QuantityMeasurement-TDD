package com.bridgelabz;

public class Yard {
    private double i;

    /**
     *
     * @param i
     */
    public Yard(double i) {
        this.i = i;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yard)) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.i, i) == 0;
    }


}