package com.practicaivan.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class AppTest 
    extends TestCase
{


    public int sum(int n1, int n2){
        return n1 + n2;
    }

    public void assertrt()  throws Exception {
        Assert.assertTrue("Suma 2 + 5 = 7 valida", sum(2,5) == 7);
        Assert.assertTrue("Suma 2 + 5 = 7 invalida", sum(2,3) == 7);
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
