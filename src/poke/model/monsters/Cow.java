package poke.model.monsters;

import poke.model.types.AngerIssues;

public class Cow extends Pokemon implements AngerIssues
{
	public Cow()
	{
		super(104, "Cow");
	}
	public Cow(String name)
	{
		super(104, name);
	}
	public Cow(int number, String name)
	{
		super(number, name);
	}
	public int biteFarmer()
	{
		return 3;
	}
	public void mooLoudly()
	{
		
	}
}
