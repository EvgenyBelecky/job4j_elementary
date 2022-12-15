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
    }
}

