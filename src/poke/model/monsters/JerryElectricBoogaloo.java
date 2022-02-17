package poke.model.monsters;

import poke.model.types.Sad; 

public class JerryElectricBoogaloo extends Jerry implements Sad
{
	public JerryElectricBoogaloo()
	{
		super(68, "Jerry Electric Boogaloo");
	}
	public JerryElectricBoogaloo(String name)
	{
		super(68, name);
	}
	public JerryElectricBoogaloo(int number, String name)
	{
		super(number, name);
	}
	@Override
	public int makeSmallTalk()
	{
		return 10;
	}
	public int cry()
	{
		return 3;
	}
	public void sleepAllDay()
	{
		
	}
}
