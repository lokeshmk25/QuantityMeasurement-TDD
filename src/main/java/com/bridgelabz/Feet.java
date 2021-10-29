package com.bridgelabz;

import java.util.Objects;

public class Feet {

    public double value;


    public Feet(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

}



