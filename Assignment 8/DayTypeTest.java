package javaTestsProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayTypeTest {
	
	DayType day;

	@Test
	public final void test() {
		try {
		assertNotNull(day.compareTo(day));
		}
		catch(NullPointerException e)
		{
			System.out.println("except!");
		}
		
	}
	
	@Test
	public final void test2() {
		try
		{
		assertNotNull(day.describeConstable());
		}
		catch(NullPointerException e)
		{
			System.out.println("exep");
		}
		
		
	}
	
	@Test
	public final void test3() {
		try
		{
		assertNotNull(day.WEEKDAY);
		assertNotNull(day.WEEKEND);
		}
		catch(NullPointerException e)
		{
			System.out.println("excep");
		}
		
	}
	
	@Test
	public final void test4() {
		try
		{
		assertNotNull(day.valueOf(null));
		assertNotNull(day.values());
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		
		}
		
	}

}
