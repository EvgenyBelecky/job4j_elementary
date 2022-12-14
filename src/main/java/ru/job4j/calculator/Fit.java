package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(short heightW) {
        double rs1 = (heightW - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        short heightM = 187;
        double man = Fit.manWeight(heightM);
        System.out.println("Ideal weight for Man 187 is " + man);
        short heightW = 165;
        double woman = Fit.womanWeight(heightW);
        System.out.println("Ideal weight for Woman 165 is " + woman);

    }

}
