package poke.view;

import poke.controller.*;
import javax.swing.*;

public class Frame extends JFrame
{
	private Controller app;
	
	private Panel panel;
	
	public Frame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new Panel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{

	}

}
