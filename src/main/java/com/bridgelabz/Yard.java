package com.bridgelabz;

import java.util.Objects;

public class Yard {
    private final int i;

    public Yard(int i) {
        this.i=i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yard)) return false;
        Yard yard = (Yard) o;
        return i == yard.i;
    }
}
