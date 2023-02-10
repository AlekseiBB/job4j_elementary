package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !notPositive(num);
    }

    public static boolean notEvenAndPositive(int num) { // проверяет, что число нечетное и положительное
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) { //что число четное или не положительное
        return isEven(num) || !isPositive(num);
    }
}