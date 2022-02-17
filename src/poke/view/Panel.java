package poke.view;

import poke.controller.*;
import javax.swing.*;

import java.awt.*;

public class Panel extends JPanel 
{
	private Controller app;
	
	public Panel(Controller app)
	{
		super();
		
		this.app = app;
		
		setupPanel();
		setupListeners();
		setupLayout();
	}

	private void setupLayout() 
	{
		this.setBackground(new Color(123,3,25));
		
	}

	private void setupListeners() 
	{
		// TODO Auto-generated method stub
		
	}

	private void setupPanel() 
	{
		// TODO Auto-generated method stub
		
	}
}
