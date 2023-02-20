package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[word.length - i - 1] != pref[pref.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}