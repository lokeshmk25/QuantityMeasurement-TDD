package com.bridgelabz;

public class LengtEquality {

    public double ftinComparison(double ft) {
        Inch inch = new Inch(12);
        Feet feet =new Feet(ft);
        feet.value=feet.value* inch.value;
        return feet.value;
    }


    public double ftydCompaison(double ft) {
        Feet feet = new Feet(ft);
        Yard yard = new Yard();
        yard.i= (feet.value/3);
        return yard.i;
    }
}
