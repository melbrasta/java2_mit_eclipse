package animalshelter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LabeledTextField extends JPanel{
	
	private JLabel textLabel;
	private JTextField textField;
	
	public LabeledTextField( String text ) {
		this.setLayout( new BorderLayout() );
		
		textLabel = new JLabel(text);
		textLabel.setFont( new Font("Monospaced", Font.BOLD, 16));
		
		
		textField = new JTextField();
		
		this.add(textLabel, BorderLayout.NORTH);
		this.add(textField, BorderLayout.SOUTH);
		
		this.setBackground( Color.YELLOW );
		textLabel.setForeground(Color.BLUE);
		textField.setForeground(Color.RED);
		textField.setBackground( new Color(132,255,255));
		
		
		
		
	}
	
	public String getText() {
		return this.textField.getText();
	}

}
