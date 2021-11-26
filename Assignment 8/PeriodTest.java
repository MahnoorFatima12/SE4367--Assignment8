package javaTestsProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeriodTest {
	Period p;

	@Test
	public final void test() {
		try
		{
		assertNotNull(p.compareTo(p));
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}
	
	@Test
	public final void test1() {
		try
		{
		assertNotNull(p.describeConstable());
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}
	
	@Test
	public final void test2() {
		try
		{
		assertNotNull(p.ordinal());
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}

}
