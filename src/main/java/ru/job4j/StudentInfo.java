package ru.job4j;

public class StudentInfo {
    public static void main(String[] args) {
        // System.out.println("Aleksei");
        // System.out.println("01.12.1990");
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println("l = " + l);
        System.out.println("b = " + b);

        System.out.println();
        // 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
        System.out.println("rsl = " + rsl);
        System.out.println();
        // 4 выражение
        double d = 121.19;
        byte k = (byte) d;
        System.out.println("d = " + d);
        System.out.println("k = " + k);
        System.out.println();
        // 3 выражение
        char c = 45000;
        float u = c;
        System.out.println("c = " + c);
        System.out.println("u = " + u);
    }
}