package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double result = (heightMan - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short heightWoman) {
        double result = (heightWoman - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 180;
        short heightWoman = 170;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man " + heightMan + " is " + man);
        System.out.println("Woman " + heightWoman + " is " + woman);
    }
}