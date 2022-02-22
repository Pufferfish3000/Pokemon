package poke.model.monsters;

import poke.model.types.AngerIssues;

public class Cow extends Pokemon implements AngerIssues
{
	public Cow()
	{
		super(104, "Cow");
		setup(100, true);
	}
	public Cow(String name)
	{
		super(104, name);
		setup(100, true);
	}
	public Cow(int number, String name)
	{
		super(number, name);
		setup(100, true);
	}
	public int biteFarmer()
	{
		return 3;
	}
	public void mooLoudly()
	{
		
	}
}
