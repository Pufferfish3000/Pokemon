package poke.controller;
import poke.model.monsters.*;
import poke.view.*;
import java.util.ArrayList;

public class Controller 
{
	private ArrayList <Pokemon> pokedex;
	private String datafile;
	private PokeFrame frame;
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.datafile = "";
		
		createPokedex();
		
		this.frame = new PokeFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void createPokedex()
	{
		pokedex.add(new Jerry("Jerry"));
		pokedex.add(new JerryElectricBoogaloo("JerryElectricBoogaloo"));
		JerryTheThird jerry3 = new JerryTheThird(23, "JerryTheThird");
		pokedex.add(jerry3);
		pokedex.add(new Jerry());
		pokedex.add(new JerryElectricBoogaloo());
		pokedex.add(new California("California"));
		pokedex.add(new Cow("Cow"));
		pokedex.add(new SlightlyOlderCow(123, "SlightlyOlderCow"));
		pokedex.add(new Cow());
		pokedex.add(new SlightlyOlderCow());
		
		
	}
	
	public String [] buildPokedexText()
	{
		String [] pokedexNames = new String [pokedex.size()];
		
		for (int i = 0; i < pokedex.size(); i++)
		{
			pokedexNames[i] = i + ": " + pokedex.get(i).getName();
		}
		
		return pokedexNames;
	}
	
	public String [] getPokemonData(int index)
	{
		String[] currentPokemonData = new String [5];
		Pokemon currentPokemon = pokedex.get(index);
		
		currentPokemonData[0] = currentPokemon.getName();
		currentPokemonData[1] = currentPokemon.isCanEvolve() + "";
		currentPokemonData[2] = currentPokemon.getHealth() + "";
		currentPokemonData[3] = currentPokemon.getPokedexNumber() + "";
		
		String types = "";
		for (String type : currentPokemon.getTypes())
		{
			types += type + "\n";
		}
		
		currentPokemonData[4] = types;
				
		return currentPokemonData;
	}
}
