package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_SouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1FeetShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetandNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetandFeet_FromSameRef_WhenEqual_ShouldReturntrue() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean actual = feet1.equals(feet2);
        Assertions.assertTrue(actual);
    }

    @Test
    void givenFeetandFeet_FromDiffRef_WhenEqual_ShouldReturntrue() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0inchand0inchShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0inchAnd1inchShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0inchAndNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchandInchFromSameRef_ShouldReturnTrue() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean actual = inch2.equals(inch1);
        Assertions.assertTrue(actual);
    }

    @Test
    public void given0Feetand0Inch_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Inch_WhenCompared_ShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_WhenCopared_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }


    @Test
    public void given0Yardand0YardShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void given0Yardand1YardShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given0YardandNullShouldReturnNotEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void given3feetCompareTo1YardShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1feetCompareTo1YardShouldReturnFalse() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given1inchCmpareto1yardShouldReturnNotEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given36inchcompareto1yardShouldReturnTrue() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardCompareTo36InchShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1YardCompareTo3FeetShouldReturnTrue() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given0centimeterAnd0cetimeterShouldReturnEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem cm2 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(cm1, cm2);
    }

    @Test
    public void given0cmAnd1cmShouldReturnNotEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem cm2 = new UnitMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    public void given0cmAndNullShouldReturnNotEqual() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem cm2 = null;
        Assertions.assertNotEquals(cm1, cm2);
    }

    @Test
    public void givencmandcmFromSameReference_WhenEqualShouldReturnTrue() {
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        boolean actual = cm.equals(cm1);
        Assertions.assertTrue(actual);
    }

    @Test
    void given2InchComapreTo5CmShould_ReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Length.INCH, 4.0);
        UnitMeasurementSystem actualsum = inch1.addition(inch2, Length.INCH);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given1Feetand2Inch_WhenAdded_ShouldReturn14Inches() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Length.INCH, 14.0);
        UnitMeasurementSystem actualsum = feet1.addition(inch1, Length.INCH);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given1Feetand1Feet_WhenAdded_ShouldReturn24Inches() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Length.INCH, 24.0);
        UnitMeasurementSystem actualsum = feet1.addition(feet2, Length.INCH);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given2InchAnd2point5CM_WhenAdded_ShouldReturn3Inches() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem cm1 = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Length.INCH, 3.0);
        UnitMeasurementSystem actualsum = inch1.addition(cm1, Length.INCH);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given0GalllonAnd0Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given0GalllonAnd1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotequal() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(gallon1, feet1);
    }

    @Test
    void given1GallonAnd1GallonFromDiffReference_ShouldReturnNotequal() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void given1GallonAndNull_ShouldReturnNotequal() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }


    @Test
    void given0LitreAnd0LitreShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    void given0LitreAnd1LitreShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRES, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void given1LitreAndDiffTypeShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        boolean litre2 = true;
        Assertions.assertNotEquals(litre1, true);
    }

    @Test
    void givenLitreAndLitreWithDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        boolean result = litre1 == litre2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0GallonAnd0Litre_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 0.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3point78Litres_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3point78LitresAnd1Gallon_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 3.78);
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = litre.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LiterAnd0ML_whenCompared_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 0.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(Volume.MILLILITRES, 0.0);
        boolean compareCheck = litre.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000ML_whenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 1.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(Volume.MILLILITRES, 1000.0);
        boolean compareCheck = litre.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MLAnd1Litre_whenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem ml = new UnitMeasurementSystem(Volume.MILLILITRES, 1000.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 1.0);
        boolean compareCheck = litre.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3point78Litres_WhenAdded_ShouldReturn7point56Litres() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(Volume.GALLON, 1.0);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 3.78);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Volume.LITRES, 7.56);
        UnitMeasurementSystem actualsum = gallon.addition(litre, Volume.LITRES);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given1Litreand1000ml_WhenAdded_ShouldReturn2Litres() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(Volume.LITRES, 1.0);
        UnitMeasurementSystem ml = new UnitMeasurementSystem(Volume.MILLILITRES, 1000.0);
        UnitMeasurementSystem expectedsum = new UnitMeasurementSystem(Volume.LITRES, 2.0);
        UnitMeasurementSystem actualsum = ml.addition(litre, Volume.LITRES);
        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    void given0GramAnd0GramShouldReturnEqual() {
        UnitMeasurementSystem gram1=new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2=new UnitMeasurementSystem(Weight.GRAM,0.0);
        Assertions.assertEquals(gram1,gram2);
    }
    @Test
    void given0GramAnd1GramShouldReturnNotEqual() {
        UnitMeasurementSystem gram1=new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2=new UnitMeasurementSystem(Weight.GRAM,1.0);
        Assertions.assertNotEquals(gram1,gram2);
    }

    @Test
    void given0GramAndNullShouldReturnNotEqual() {
        UnitMeasurementSystem gram1=new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2=null;
        Assertions.assertNotEquals(gram1,gram2);
    }
    @Test
    void given0GramAnd0gramFromDiffReference_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1=new UnitMeasurementSystem(Weight.GRAM,0.0);
        UnitMeasurementSystem gram2=new UnitMeasurementSystem(Weight.GRAM,0.0);
        Assertions.assertNotSame(gram1,gram2);
    }

    @Test
    void given0GramanDiffTypeShouldReturnNotEqual() {
        UnitMeasurementSystem gram1=new UnitMeasurementSystem(Weight.GRAM,0.0);
        boolean gram2=true;
        Assertions.assertNotEquals(gram1, true);
    }

    @Test
    void given0kgAnd0kg_ShouldReturnEqual() {
        UnitMeasurementSystem kg1=new UnitMeasurementSystem(Weight.KILOGRAM,0.0);
        UnitMeasurementSystem kg2=new UnitMeasurementSystem(Weight.KILOGRAM,0.0);
        Assertions.assertEquals(kg1,kg2);
    }

    @Test
    void given0kgAnd1kg_ShouldReturnNotEqual() {
        UnitMeasurementSystem kg1=new UnitMeasurementSystem(Weight.KILOGRAM,0.0);
        UnitMeasurementSystem kg2=new UnitMeasurementSystem(Weight.KILOGRAM,1.0);
        Assertions.assertNotEquals(kg1,kg2);
    }

    @Test
    void given0KilogramAndNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem kg1=new UnitMeasurementSystem(Weight.KILOGRAM,0.0);
        UnitMeasurementSystem kg2=null;
        Assertions.assertNotEquals(kg1,kg2);
    }
    @Test
    void given0kgAnd0kg_FromDiffReference_ShouldReturnEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        UnitMeasurementSystem kg2 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        Assertions.assertNotSame(kg1, kg2);
    }

    @Test
    void givenkgAndDiffType_ShouldReturnNotEqual() {
        UnitMeasurementSystem kg1 = new UnitMeasurementSystem(Weight.KILOGRAM, 0.0);
        boolean kg2=true;
        Assertions.assertNotEquals(kg1,kg2);
    }

    @Test
    void given0TonneAnd0Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1=new UnitMeasurementSystem(Weight.TONNE,0.0);
        UnitMeasurementSystem tonne2=new UnitMeasurementSystem(Weight.TONNE,0.0);
        Assertions.assertEquals(tonne1,tonne2);
    }
    @Test
    void given0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1=new UnitMeasurementSystem(Weight.TONNE,0.0);
        UnitMeasurementSystem tonne2=new UnitMeasurementSystem(Weight.TONNE,1.0);
        Assertions.assertNotEquals(tonne1,tonne2);
    }
    @Test
    void given0TonneAndNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }
    @Test
    void given0TonneAnd0Tonne_FromDiffReference_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(Weight.TONNE, 0.0);
        Assertions.assertNotSame(tonne1, tonne2);
    }

    @Test
    void given1kgAnd1000grams_Whencompared_ShouldReturnTrue() {
        UnitMeasurementSystem kg=new UnitMeasurementSystem(Weight.KILOGRAM,(1.0));
        UnitMeasurementSystem gram=new UnitMeasurementSystem(Weight.GRAM,(1000.0));
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1tonneand1000kgs_WhenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem kg=new UnitMeasurementSystem(Weight.KILOGRAM,1000.0);
        boolean compareCheck = tonne.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000gm_WhenAdded_ShouldReturn1001kg(){
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(Weight.TONNE, 1.0);
        UnitMeasurementSystem gm=new UnitMeasurementSystem(Weight.GRAM,1000.0);
        UnitMeasurementSystem expectedSum=new UnitMeasurementSystem(Weight.KILOGRAM,1001.0);
        UnitMeasurementSystem actualsum=tonne.addition(gm,Weight.KILOGRAM);
        Assertions.assertEquals(expectedSum,actualsum);
    }

    @Test
    void given0FarenheitAnd1FarenheitShouldReturnNotEqual() {
        UnitMeasurementSystem farenheit1=new UnitMeasurementSystem(Temperature.FARENHEIT,0.0);
        UnitMeasurementSystem farenheit2=new UnitMeasurementSystem(Temperature.FARENHEIT,1.0);
        Assertions.assertNotEquals(farenheit1,farenheit2);
    }
    @Test
    void given0FarenheitAnd0FarenheitShouldReturnEqual() {
        UnitMeasurementSystem farenheit1=new UnitMeasurementSystem(Temperature.FARENHEIT,0.0);
        UnitMeasurementSystem farenheit2=new UnitMeasurementSystem(Temperature.FARENHEIT,0.0);
        Assertions.assertEquals(farenheit1,farenheit2);
    }

    @Test
    void given0CelciusAnd0Celcius_ShoudReturnEqual() {
        UnitMeasurementSystem celcius1=new UnitMeasurementSystem(Temperature.CELCIUS,0.0);
        UnitMeasurementSystem celcius2=new UnitMeasurementSystem(Temperature.CELCIUS,0.0);
        Assertions.assertEquals(celcius1,celcius2);
    }

    @Test
    void given0CelciusAnd1Celcius_ShoudReturnNotEqual() {
        UnitMeasurementSystem celcius1=new UnitMeasurementSystem(Temperature.CELCIUS,0.0);
        UnitMeasurementSystem celcius2=new UnitMeasurementSystem(Temperature.CELCIUS,1.0);
        Assertions.assertNotEquals(celcius1,celcius2);
    }

    @Test
    void given212Farenheitand100Celcius_whenCompared_ShouldReturnTrue() {
        UnitMeasurementSystem farenheit=new UnitMeasurementSystem(Temperature.FARENHEIT,212.0);
        UnitMeasurementSystem celcius=new UnitMeasurementSystem(Temperature.CELCIUS,100.0);
        boolean compareCheck=farenheit.compare(celcius);
        Assertions.assertTrue(compareCheck);
    }
}

