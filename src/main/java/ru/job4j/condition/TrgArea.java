package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double pp = (a + b + c) / 2;
        double s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 3, 3);
        System.out.println("area (3,3,3) = " + rsl);
    }
}
