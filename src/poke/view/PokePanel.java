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
	private JScrollPane typePane;
	private JCheckBox evolveBox;
	private JLabel imageLabel;
	private ImageIcon pokemonImage;
	private JComboBox<String> pokedexSelector;
	private JButton updateButton;
	
	public PokePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		this.fieldPanel = new JPanel(new GridLayout(0,1));
		this.nameField = new JTextField("Pokemon Name");
		this.numberField = new JTextField("Pokedex Number");
		this.healthField = new JTextField("Pokemon Health");
		this.typeArea = new JTextArea();
		this.typePane = new JScrollPane();
		this.evolveBox = new JCheckBox("Can Evolve?");
		this.imageLabel = new JLabel("");
		this.pokemonImage = new ImageIcon();
		this.pokedexSelector = new JComboBox<String>();
		this.updateButton = new JButton("UPDATE POKEMON :D");
		
		setUpDropDown();
		setupPanel();
		setupListeners();
		setupLayout();
		
	}

	private void setupLayout() 
	{
		this.setBackground(new Color(123,3,25));
		layout.putConstraint(SpringLayout.NORTH, imageLabel, 150, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, fieldPanel, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, fieldPanel, -300, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -25, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, fieldPanel, -25, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -150, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, imageLabel, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.EAST, fieldPanel);
		layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
		
	}

	private void setupListeners() 
	{
		pokedexSelector.addActionListener(Select -> updatePokemonScreen());
		
	}

	private void setUpDropDown()
	{
		DefaultComboBoxModel<String> pokeModel = new DefaultComboBoxModel<String>(app.buildPokedexText());
		pokedexSelector.setModel(pokeModel);
	}
	
	public void updatePokemonScreen()
	{
		String name = pokedexSelector.getSelectedItem().toString();
		int nameStart = name.indexOf(": ") + 2;
		name = name.substring(nameStart);
		updateDisplay(name);
		updateFields(pokedexSelector.getSelectedIndex());
	}
	
	private void updateFields(int index)
	{
		String[] data = app.getPokemonData(index);
		
		nameField.setText(data[0]);
		evolveBox.setSelected(Boolean.parseBoolean(data[1]));
		healthField.setText(data[2]);
		numberField.setText(data[3]);
		typeArea.setText(data[4]);
		
	}
	
	private void setupPanel() 
	{
		this.setLayout(layout);
		this.setBackground(Color.RED);
		this.setPreferredSize(new Dimension(800,600));
		
		fieldPanel.add(nameField);
		fieldPanel.add(numberField);
		fieldPanel.add(healthField);
		fieldPanel.add(evolveBox);
		fieldPanel.add(updateButton);
		
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
		
		typeArea.setEditable(false);
		typeArea.setLineWrap(true);
		typeArea.setWrapStyleWord(true);
		typePane.setViewportView(typeArea);
		typePane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		typePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		updateDisplay("");
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}

	private void updateDisplay(String name)
	{
		String path = "/poke/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";	
		
		try
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch(NullPointerException missingFile)
		{
			pokemonImage = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		imageLabel.setIcon(pokemonImage);
	}
}
