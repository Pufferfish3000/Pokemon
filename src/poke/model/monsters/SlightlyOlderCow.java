package poke.model.monsters;

import poke.model.types.Hulking;

public class SlightlyOlderCow extends Cow implements Hulking
{
	public SlightlyOlderCow()
	{
		super(83, "Slightly Older Cow");
		super.setup(500, false);
	}
	public SlightlyOlderCow(String name)
	{
		super(83, name);
		super.setup(500, false);
	}
	public SlightlyOlderCow(int number, String name)
	{
		super(number, name);
		super.setup(500, false);
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
