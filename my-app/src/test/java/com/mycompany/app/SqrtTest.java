package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SqrtTest {
    @Test
    public void average1() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(15, sqrt.average(10, 20));
    }

    @Test
    public void average2() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(30, sqrt.average(20, 40));
    }

    @Test
    public void good1() {
        Sqrt sqrt = new Sqrt(1);
        assertTrue(sqrt.good(9, 81));
    }

    @Test
    public void good2() {
        Sqrt sqrt = new Sqrt(1);
        assertTrue(sqrt.good(8.99999999999999, 81));
    }

    @Test
    public void good3() {
        Sqrt sqrt = new Sqrt(1);
        assertFalse(sqrt.good(8.5, 81));
    }

    @Test
    public void improve1() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(4.5625, sqrt.improve(8, 9));
    }

    @Test
    public void improve2() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(5.45, sqrt.improve(10, 9));
    }

    @Test
    public void iter() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(3.0, sqrt.iter(5, 9), 0.0000001);
    }

    @Test
    public void calc1() {
        Sqrt sqrt = new Sqrt(9);
        assertEquals(3.0, sqrt.calc(), 0.0000001);
    }

    @Test
    public void calc2() {
        Sqrt sqrt = new Sqrt(81);
        assertEquals(9.0, sqrt.calc(), 0.0000001);
    }
}