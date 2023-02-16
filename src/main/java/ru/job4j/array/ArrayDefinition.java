package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Aleksei";
        names[1] = "Ivan";
        names[2] = "Sergei";
        names[3] = "Viktor";
        System.out.println("Значение индекса массива равно: " + names[0]);
        System.out.println("Значение индекса массива равно: " + names[1]);
        System.out.println("Значение индекса массива равно: " + names[2]);
        System.out.println("Значение индекса массива равно: " + names[3]);
    }
}
