package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double subtractX = x2 - x1;
        double subtractY = y2 - y1;
        double degreeX = Math.pow(subtractX, 2);
        double degreeY = Math.pow(subtractY, 2);
        double sum = degreeX + degreeY;
        return  Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(4, 14, 15, 45);
        double result2 = Point.distance(11, 18, 18, 22);
        double result3 = Point.distance(22, 7, 33, 10);
        double result4 = Point.distance(6, 5, 8, 12);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result1 (4, 14) to (15, 45) " + result1);
        System.out.println("result2 (11, 18) to (18, 22) " + result2);
        System.out.println("result3 (22, 7) to (33, 10) " + result3);
        System.out.println("result4 (6, 5) to (8, 12) " + result4);
    }
}
