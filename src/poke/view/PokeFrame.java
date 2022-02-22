package poke.view;

import poke.controller.*;
import javax.swing.*;

public class PokeFrame extends JFrame
{
	private Controller app;
	
	private PokePanel panel;
	
	
	public PokeFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new PokePanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(800,600);
		this.setTitle("Pokedex");
		this.setResizable(false);
		this.setVisible(true);
	}

}

