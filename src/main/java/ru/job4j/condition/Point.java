package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(1, 4, 5, 2);
        System.out.println("Result (1,4) to (5,2) " + result1);
    }
}
