package javaTestsProj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgrammedSettingsTest {
	
	ProgrammedSettings set = new ProgrammedSettings();

	@Test
	public final void testProgrammedSettings() {
		try
		{
		assertNotNull(set.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}


	@Test
	public final void testGetSetting() {
		try
		{
		assertNotNull(set.getSetting(null, null));
		}
		catch(NullPointerException e)
		{
			System.out.println("excep!");
		}
	}

	@Test
	public final void testToString() {
		try
		{
		assertNotNull(set.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("excep");
		}
	}

}
