package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20ThenDot2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when414to1545Then32Dot89() {
        double expected = 32.89;
        Point a = new Point(4, 14);
        Point b = new Point(15, 45);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when1118to1822Then8Dot06() {
        double expected = 8.06;
        Point a = new Point(11, 18);
        Point b = new Point(18, 22);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when227to3310Then11Dot40() {
        double expected = 11.40;
        Point a = new Point(22, 7);
        Point b = new Point(33, 10);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when65to812Then7Dot28() {
        double expected = 7.28;
        Point a = new Point(6, 5);
        Point b = new Point(8, 12);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}