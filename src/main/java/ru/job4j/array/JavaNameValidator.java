package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || (isUpperLatinLetter(name.charAt(0)))
                || (Character.isDigit(name.charAt(0)))) {
            return false;
        }
        boolean result = true;
        for (int i = 1; i < name.length(); i++) {
            int symbol = name.charAt(i);
            result = isSpecialSymbol(symbol) || isUpperLatinLetter(symbol)
                    || isLowerLatinLetter(symbol) || Character.isDigit(symbol);
            if (!result) {
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36) || (code == 95);
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }
}