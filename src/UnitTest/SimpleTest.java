package UnitTest;

import junit.framework.TestCase;

public class SimpleTest extends TestCase {
	private java.util.List emptyList;


    /**
     * Sets up the test fixture. 
     * (Called before every test case method.) 
     */ 
    protected void setUp() { 
         emptyList = new java.util.ArrayList();
    } 


    /**
     * Tears down the test fixture. 
     * (Called after every test case method.) 
     */ 
    protected void tearDown() { 
         emptyList = null; 
    } 


    public void testSomeBehavior() { 
         assertEquals("Empty list should have 0 elements", 0, emptyList.size());
    } 

    public void testForException() { 
         try { 
              Object o = emptyList.get(0); 
              fail("Should raise an IndexOutOfBoundsException");
         } 
         catch (IndexOutOfBoundsException success) {        	 
         } 
    } 


}
