package poke.model.monsters;

import poke.model.types.Ghost;

public class California extends Pokemon implements Ghost
{
	public California()
	{
		super(796, "California");
		setup(30, false);
	}
	public California(String name)
	{
		super(796, name);
	}
	public California(int number, String name)
	{
		super(number, name);
		setup(30, false);
	}
	public int raiseTaxes()
	{
		return 3;
	}
	public void superScary()
	{
		
	}
}
