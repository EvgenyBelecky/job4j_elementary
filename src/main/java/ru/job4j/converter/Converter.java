package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRubles(float value) {
        return 70 * value;
    }

    public static float dollarsToRubles(float value) {
        return 60 * value;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollar + " dollars.");
        float euroToRubles = Converter.euroToRubles(500);
        System.out.println("500 euro are " + euroToRubles + " rubles.");
        float dollarsToRubles = Converter.dollarsToRubles(500);
        System.out.println("500 dollars are " + dollarsToRubles + " rubles.");

        float inRTE = 140;
        float expectedRTE = 2;
        float outRTE = Converter.rubleToEuro(inRTE);
        boolean passedRTE = expectedRTE == outRTE;
        System.out.println("140 rubles are 2. Test result: " + passedRTE);

        float inRTD = 300;
        float expectedRTD = 5;
        float outRTD = Converter.rubleToDollar(inRTD);
        boolean passedRTD = outRTD == expectedRTD;
        System.out.println("300 rubles are 5. Test result: " + passedRTD);

        float inETR = 500;
        float expectedETR = 35000;
        float outETR = Converter.euroToRubles(inETR);
        boolean passedETR = outETR == expectedETR;
        System.out.println("500 rubles are 35000. Test result: " + passedETR);

        float inDTR = 500;
        float expectedDTR = 30000;
        float outDTR = Converter.dollarsToRubles(inDTR);
        boolean passedDTR = outDTR == expectedDTR;
        System.out.println("500 rubles are 30000. Test result: " + passedDTR);
    }
}

