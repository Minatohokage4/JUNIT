package UnitTest;
import java.awt.print.Book;

import src.BookStore;
import src.Calculator;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {

	BookStore book;
	@Before
	public void setUp() throws Exception {
		book=new BookStore();
	}

	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void testgetDiscountBalance() {
		
			double totalOrderPrice[]={500,500,1500,1500,2500};
			int discount[]={0,25,0,25,0};
			double expected[]={500.0,
					375.0,
					500.0,
					375.0,
					500.0,
					500.0,
					375.0,
					500.0,
					375.0,
					500.0,
					1500.0,
					1125.0,
					1500.0,
					1125.0,
					1500.0,
					1500.0,
					1125.0,
					1500.0,
					1125.0,
					1500.0,
					2500.0,
					1875.0,
					2500.0,
					1875.0,
					2500.0};

			
			double actual;
			
			for(int i=0,k=0;i<5;i++)
			{
				for(int j=0;j<5;j++,k++)
				{
					actual=book.getDiscountBalance(totalOrderPrice[i], discount[j]);
					//System.err.println(actual);
					 assertEquals(expected[k], actual,0);
				}
			}
		}
			
	
	@Test
	public void testgetDiscount() {
		
		double totalOrderPrice[]={500,500,1500,1500,2500};
		int cusType[]={0,0,0,0,0};
		int coupon[]={0,25,0,25,0};
		
		int expected[]={0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0};
		
		int actual;
		
		for(int i=0,k=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				for(int f=0;f<5;f++,k++)
				{
					actual=book.getDiscount(totalOrderPrice[i], cusType[j], coupon[f]);
					
					System.err.println(actual);
					//assertEquals(expected[k], actual,0);
				}
				
			}
		}
		
		
	}

}
