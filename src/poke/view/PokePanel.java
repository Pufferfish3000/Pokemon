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
	
	public PokePanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		
		this.fieldPanel = new JPanel(new GridLayout(0,1));
		layout.putConstraint(SpringLayout.NORTH, fieldPanel, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, fieldPanel, -300, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -25, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, fieldPanel, -25, SpringLayout.EAST, this);
		
		this.nameField = new JTextField("Pokemon Name");
		this.numberField = new JTextField("##");
		this.healthField = new JTextField("###");
		this.typeArea = new JTextArea();
		this.typePane = new JScrollPane();
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
		this.setPreferredSize(new Dimension(800,600));
		
		fieldPanel.add(nameField);
		fieldPanel.add(numberField);
		fieldPanel.add(healthField);
		fieldPanel.add(evolveBox);
		
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
		
		typeArea.setEditable(false);
		typeArea.setLineWrap(true);
		typeArea.setWrapStyleWord(true);
		typePane.setViewportView(typeArea);
		typePane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		typePane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
}
