package poke.model.monsters;

import poke.model.types.Normal;

public class Jerry extends Pokemon implements Normal
{
	public Jerry()
	{
		super(448, "Jerry");
		setup(60, true);
	}
	public Jerry(String name)
	{
		super(448, name);
		setup(60, true);
	}
	public Jerry(int number, String name)
	{
		super(number, name);
		setup(60, true);
	}
	public int makeSmallTalk()
	{
		return 3;
	}
	public void drinkCoffee()
	{
		
	}
}
