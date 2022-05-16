package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WindowExample
{

	public static void main(String[] args)
	{
		
		
		//
		//	Hier wird das Hauptfenster erstellt
		//
		//
		
		JFrame frame = new JFrame ("Fenstertitel");					// mit dem Titel...
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//schließender x Knopf am oberen Rand
		frame.setSize(600, 400);									// Fenstergröße
		frame.setVisible(true);
		
		frame.setLayout(new BorderLayout());				//Layoutmanager
		
		
		
		
		JPanel panelLeft = new JPanel();			//Linkes Panel
		JPanel panelRight = new JPanel();			//Rechtes Panel
		
		panelLeft.setLayout(new BorderLayout());			//LayoutManager für das Linke Panel
		
		LabeledTextField textFirstname = new LabeledTextField("Vorname");		// Ein neues LabeledTextfield mit dem Namen textFirstname
		LabeledTextField textLastname = new LabeledTextField("Nachname");		// neues LabeledTextField
		LabeledTextField textCustomerID = new LabeledTextField("Kundennummer"); // neues LabeledTextField
		
		
		panelLeft.add(textFirstname, BorderLayout.NORTH);		//Zu dem PanelLeft wird das Textfeld zugefügt, an der Position North
		panelLeft.add(textLastname, BorderLayout.CENTER);		//Zu dem PanelLeft wird das Textfeld zugefügt, an der Position Center
		panelLeft.add(textCustomerID,BorderLayout.SOUTH);
		
		frame.add(panelLeft, BorderLayout.WEST);
		
		
		
		
		//
		// Hier beginnt das rechte Panel
		//
		
		panelRight.setLayout (new BorderLayout());		//Layout für das rechte Panel
		JButton btn = new JButton("OK");				// Button mit der Aufschrift "OK" wird erzeugt, kann aber noch nichts
		
		
		btn.addActionListener((e) ->
		{
			String firstname = textFirstname.getText();
			String lastname = textLastname.getText();
			String customerID = textCustomerID.getText();
			
			JOptionPane.showMessageDialog(frame, firstname + lastname + customerID);
		});
		
		
		panelRight.add(btn, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		frame.add(panelRight, BorderLayout.EAST);
		
		
		
		
		
		frame.pack();
		
		
		
		
		

	}

}
