package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 1; i <= number; i++) {
            if ((number % 5) == 0) {
                prime = true;
            } else {
                prime = false;
            }
        }
            return prime;
    }
}

