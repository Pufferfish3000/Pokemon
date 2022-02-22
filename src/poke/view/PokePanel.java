package poke.view;

import poke.controller.*;

import javax.swing.*;
import java.awt.*;

public class PokePanel extends JPanel 
{
	private Controller app;
	private SpringLayout layout;
	
	private JPanel fieldPanel;
	private JTextField nameField;
	private JTextField healthField;
	private JTextField numberField;
	private JTextArea typeArea;
	private JCheckBox evolveBox;
	
	private JLabel imageLabel;
	private ImageIcon pokemonImage;
	private JComboBox<String> pokedexSelector;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		
		this.fieldPanel = new JPanel(new GridLayout(0,1));
		this.nameField = new JTextField("Pokemon Name");
		this.numberField = new JTextField("##");
		this.healthField = new JTextField("###");
		this.typeArea = new JTextArea(10,10);
		this.evolveBox = new JCheckBox();
		
		this.imageLabel = new JLabel("PlaceHolder text");
		this.pokemonImage = new ImageIcon();
		this.pokedexSelector = new JComboBox<String>();
		
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
		this.setLayout(layout);
		this.setBackground(Color.RED);
		this.setSize(800,600);
		
		fieldPanel.add(nameField);
		fieldPanel.add(numberField);
		fieldPanel.add(healthField);
		fieldPanel.add(evolveBox);
		fieldPanel.add(typeArea);
		
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
	}
}
