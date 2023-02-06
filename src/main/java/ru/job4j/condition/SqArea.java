package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        double result2 = SqArea.square(8, 3);
        double result3 = SqArea.square(12, 5);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 8, k = 3, s = 3, real = " + result2);
        System.out.println(" p = 12, k = 5, s = 5, real = " + result3);
    }
}