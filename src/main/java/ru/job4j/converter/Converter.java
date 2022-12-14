package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl1 = value / 70;
        return rsl1;
    }

    public static float rubleToDollar(float value) {
        float rsl1 = value / 60;
        return rsl1;
    }

    public static float euroToRubles(float value) {
        float rsl1 = 70 * value;
        return rsl1;
    }

    public static float dollarsToRubles(float value) {
        float rsl1 = 60 * value;
        return rsl1;
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

