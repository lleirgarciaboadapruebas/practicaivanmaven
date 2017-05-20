package com.practicaivan.app;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class AppTest extends TestCase {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    @Test
    public void assertrt() throws Exception {
        Assert.assertTrue("Suma 2 + 5 = 7 valida", sum(2, 5) == 7);
        Assert.assertTrue("Suma 2 + 5 = 7 invalida", sum(2, 5) == 7);
        System.out.println("Test pasados!!!!");
    }
}