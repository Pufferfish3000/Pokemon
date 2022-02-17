package poke.model.monsters;

import poke.model.types.Hulking;

public class SlightlyOlderCow extends Cow implements Hulking
{
	public SlightlyOlderCow()
	{
		super(83, "Slightly Older Cow");
	}
	public SlightlyOlderCow(String name)
	{
		super(83, name);
	}
	public SlightlyOlderCow(int number, String name)
	{
		super(number, name);
	}
	@Override
	public int biteFarmer()
	{
		return 10;
	}
	public int grow()
	{
		return 3;
	}
	public void stompGround()
	{
		
	}
}
