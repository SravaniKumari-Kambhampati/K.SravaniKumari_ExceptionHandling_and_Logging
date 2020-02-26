package com.SravaniKumari.InterestCalculator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
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
    public static void testSimpleInterest() {
    	CalculateInterest calculator = new CalculateInterest();
    	assertEquals(900.0,calculator.calculateSimpleInterest(10000, 3, 3),0.0);
    	assertEquals(210.0,calculator.calculateSimpleInterest(3000, 1, 7),0.0);
    	assertEquals(2500.0,calculator.calculateSimpleInterest(10000, 5, 5),0.0);
    	assertEquals(937.5,calculator.calculateSimpleInterest(50000, 1.5, 1.25),0.0);
    }
    public static void testCompoundInterest() {
    	CalculateInterest calculator = new CalculateInterest();
    	assertEquals(1333.0992,calculator.calculateCompoundInterest(1200, 2, 5.4),0.0);
    	assertEquals(80525.50000000003,calculator.calculateCompoundInterest(50000, 5, 10),0.0);
    	assertEquals(110250.0,calculator.calculateCompoundInterest(100000, 2, 5),0.0);
    	assertEquals(41208.999999999985,calculator.calculateCompoundInterest(40000, 2, 1.5),0.0);
    	
    }
    public void testApp()
    {
        testSimpleInterest();
        testCompoundInterest();
    }
}

