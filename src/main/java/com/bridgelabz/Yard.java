package com.bridgelabz;

public class Yard {
    public double i;

    public Yard() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yard)) return false;
        Yard yard = (Yard) o;
        return i == yard.i;
    }
}
