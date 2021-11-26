package javaTestsProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermostatTest {
	
    Thermostat st = new Thermostat();

	@Test
	public final void testTurnHeaterOn() {
		try
		{
		assertNotNull(st.turnHeaterOn(null));
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}

	@Test
	public final void testSetRunTime() {
		try
		{
		assertNotNull(st.turnHeaterOn(null));
		st.setRunTime(20);
		}
		catch(NullPointerException e)
		{
			System.out.println("excep");
		}
	}

	
}
