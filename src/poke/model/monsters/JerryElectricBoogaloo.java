package poke.model.monsters;

import poke.model.types.Sad; 

public class JerryElectricBoogaloo extends Jerry implements Sad
{
	public JerryElectricBoogaloo()
	{
		super(68, "Jerry Electric Boogaloo");
		super.setup(70, true);
	}
	public JerryElectricBoogaloo(String name)
	{
		super(68, name);
		super.setup(70, true);
	}
	public JerryElectricBoogaloo(int number, String name)
	{
		super(number, name);
		super.setup(70, true);
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
