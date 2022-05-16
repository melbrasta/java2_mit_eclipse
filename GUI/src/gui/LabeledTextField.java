package gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LabeledTextField extends JPanel{
	
	private JLabel textLabel;
	private JTextField textField;
	
	public LabeledTextField( String text ) {
		this.setLayout( new BorderLayout() );
		
		textLabel = new JLabel(text);
		
		textField = new JTextField();
		
		this.add(textLabel, BorderLayout.NORTH);
		this.add(textField, BorderLayout.SOUTH);
		
	}
	
	public String getText() {
		return this.textField.getText();
	}

}
