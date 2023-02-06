package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when414to1545then32() {
        double expected = 32.89;
        int x1 = 4;
        int y1 = 14;
        int x2 = 15;
        int y2 = 45;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1118to1822then8() {
        double expected = 8.06;
        int x1 = 11;
        int y1 = 18;
        int x2 = 18;
        int y2 = 22;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when227to3310then11() {
        double expected = 11.40;
        int x1 = 22;
        int y1 = 7;
        int x2 = 33;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when65to812then7() {
        double expected = 7.28;
        int x1 = 6;
        int y1 = 5;
        int x2 = 8;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
