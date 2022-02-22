package poke.model.monsters;

public class JerryTheThird extends JerryElectricBoogaloo
{
	public JerryTheThird()
	{
		super(66, "Jerry The Third");
		super.setup(90, false);
	}
	public JerryTheThird(String name)
	{
		super(66, name);
		super.setup(90, false);
	}
	public JerryTheThird(int number, String name)
	{
		super(number, name);
		super.setup(90, false);
	}
	@Override
	public int makeSmallTalk()
	{
		return 10;
	}
	@Override
	public int cry()
	{
		return 3;
	}
	@Override
	public void sleepAllDay()
	{
		
	}
}

