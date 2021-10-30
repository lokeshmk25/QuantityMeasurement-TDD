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
        return ft*12;
    }

    /**
     *
     * @param ft
     * @return
     */
    public double ftydCompaison(double ft) {
        return  ft/ 3;
    }

    /**
     *
     * @param in
     * @return
     */
    public double inydComparison(double in) {
        return in/36;
    }

    /**
     *
     * @param yd
     * @return
     */
    public double ydinComparison(double yd) {
        return yd*36;
    }

    public double ydftComparison(double yd) {
        return yd*3;
    }
}
