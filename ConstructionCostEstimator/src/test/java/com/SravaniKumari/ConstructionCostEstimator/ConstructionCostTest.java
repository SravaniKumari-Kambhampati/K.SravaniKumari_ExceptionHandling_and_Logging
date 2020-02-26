package com.SravaniKumari.ConstructionCostEstimator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ConstructionCostTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ConstructionCostTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConstructionCostTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public static void testCostCalculator() {
    	CostCalculator estimator = new CostCalculator();
    	assertEquals(270000.0, estimator.getCost("highStandard", 150, false));
    	assertEquals(137500.0, estimator.getCost("highStandard", 55, true));
    	assertEquals(23250.0, estimator.getCost("aboveStandard", 15.5, false));
    	assertEquals(300300.0, estimator.getCost("Standard", 250.25, false));
    }
    public void testApp()
    {
        testCostCalculator();
    }
}
