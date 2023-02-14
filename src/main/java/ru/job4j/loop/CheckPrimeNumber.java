package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if ((number % 5) == 0) {
            prime = true;
        } else {
            prime = false;
        }
        return prime;
    }
}
