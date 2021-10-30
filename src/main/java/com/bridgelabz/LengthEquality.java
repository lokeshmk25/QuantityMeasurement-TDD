package com.bridgelabz;

/*
This class used for Unit conversion
 */

public class LengthEquality {
    /**
     *
     * @param ft
     * @return
     */
    public double ftinComparison(double ft) {
        Inch inch = new Inch(12);
        Feet feet = new Feet(ft);
        feet.value = feet.value * inch.value;
        return feet.value;
    }

    /**
     *
     * @param ft
     * @return
     */
    public double ftydCompaison(double ft) {
        Feet feet = new Feet(ft);
        Yard yard = new Yard(0.0);
        yard.i = (feet.value / 3);
        return yard.i;
    }

    /**
     *
     * @param in
     * @return
     */
    public double inydComparison(double in) {
        Inch inch = new Inch(in);
        Yard yard = new Yard(0.0);
        yard.i = (inch.value / 36);
        return yard.i;
    }

}
