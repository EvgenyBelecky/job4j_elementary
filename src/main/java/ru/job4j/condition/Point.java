package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double dx = (x2 - x1);
        double dxPow = Math.pow(dx, 2);
        double dy = (y2 - y1);
        double dyPow = Math.pow(dy, 2);
        double sum = dxPow + dyPow;
        double rsl = Math.sqrt(sum);
        return  rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 4, 5, 2);
        System.out.println("Result (1,4) to (5,2) " + result);
    }
}
