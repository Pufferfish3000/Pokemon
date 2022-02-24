package poke.controller;

import java.io.*;
import java.util.*;
import javax.swing.*;
import poke.model.monsters.Pokemon;
import poke.view.PokeFrame;

public class IOController 
{
	public static ArrayList<Pokemon> loadData(String dataFile, PokeFrame frame)
	{
		ArrayList<Pokemon> pokeList = null;
		
		try(FileInputStream loadStream = new FileInputStream(dataFile);
			ObjectInputStream input = new ObjectInputStream(loadStream))
		{
			ArrayList<Pokemon> loadedPokemon = new ArrayList<Pokemon>();
			loadedPokemon = (ArrayList<Pokemon>) input.readObject();
			pokeList = loadedPokemon;
		}
		catch(IOException readError)
		{
			JOptionPane.showMessageDialog(frame, readError.getMessage(), "Could not read file :(", JOptionPane.ERROR_MESSAGE);
		}
		catch (ClassNotFoundException classError)
		{
			JOptionPane.showMessageDialog(frame, classError.getMessage(), "Your computer ran into a class error :(", JOptionPane.ERROR_MESSAGE);
		}
		
		return pokeList;
	}
	
	public static void saveData()
	{
		
	}
}
