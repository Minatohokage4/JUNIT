package UnitTest;

import static org.junit.Assert.*;
import jdk.nashorn.internal.codegen.CompilerConstants.Call;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Calculator;

public class CalculatorTest {
	Calculator cal;
	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testadd() {
		
		int ar_one[]={-5,5};
		int ar_two[]={-5,5};
		int expected[]={-10,0,0,10};
		int actual;
		
		for(int i=0,k=0;i<2;i++)
		{
			for(int j=0;j<2;j++,k++)
			{
				actual = cal.add(ar_one[i], ar_two[j]); 
				//System.err.println(actual);
				assertEquals(expected[k], actual);
				
			}
		}
	}
	@Test
public void testdivide() {
		
		int ar_one[]={-5,5};
		int ar_two[]={-5,5};
		int expected[]={1,-1,-1,1};
		int actual;
		
		for(int i=0,k=0;i<2;i++)
		{
			for(int j=0;j<2;j++,k++)
			{
				actual = cal.divide(ar_one[i], ar_two[j]); 
				//System.err.println(actual);
				assertEquals(expected[k], actual);
			}
		}
	}
}
