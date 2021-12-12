package com.architect;

public class UnitConverter {


    public double centimeterToCentimeter(double magnitude) {
        return magnitude;
    }

    public double meterToCentimeter(double magnitude) {
        return magnitude * 100;
    }

    public double kilometerToCentimeter(double magnitude) {
        return magnitude * 100000;
    }

    public double centimeterToKilometer(double magnitude) {
        return magnitude / 100000;
    }

    public double centimeterToMeter(double magnitude) {
        return magnitude / 100;
    }

}

//********************specified method*******************************************
//public double addingMeterAndCentimeterGivesMeter(double magnitudeMeter, double magnitudeCentimeter) {
//    return centimeterToMeter(magnitudeCentimeter) + magnitudeMeter;
//}
//
//
//    public double addingCentimeterAndKilometerGivesCentimeter(double magnitudeCentimeter, double magnitudeKilometer) {
//        return magnitudeCentimeter + kilometerToCentimeter(magnitudeKilometer);
//    }
//
//
//    public double subtractingMeterAndCentimeterGivesMeter(double magnitudeMeter, double magnitudeCentimeter) {
//        return magnitudeMeter - centimeterToMeter(magnitudeCentimeter);
//    }
//
//
//    public double subtractingCentimeterMeterGivesCentimeter(double magnitudeCentimeter, double magnitudeMeter) {
//        return magnitudeCentimeter - meterToCentimeter(magnitudeMeter);
//    }
//}