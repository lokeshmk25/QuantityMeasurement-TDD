package com.bridgelabz;

/*
This class used for Unit conversion
 */

public class LengthEquality {
    /**
     * @param feet Compares feet to inch
     */
    public double feetinchComparison(double feet) {
        return feet * 12;
    }

    /**
     * @param feet compares feet to yard
     */
    public double feetyardCompaison(double feet) {
        return feet / 3;
    }

    /**
     * @param inch compares inch to yard
     */
    public double inchyardComparison(double inch) {
        return inch / 36;
    }

    /**
     * @param yard compares yard to inch
     */
    public double yardinchComparison(double yard) {
        return yard * 36;
    }

    /**
     * @param yard compares yard to feet
     */
    public double yardfeetComparison(double yard) {
        return yard * 3;
    }

    /**
     * @param inch comapares inch to centimeter
     */
    public double inchcentimeterComparison(double inch) {
        return inch * 2.5;
    }
}
