package animalshelter;

import java.awt.BorderLayout;
import java.awt.Button;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class WindowExample extends JDialog {

	public WindowExample() throws IOException {
		JFrame frame = new JFrame( "AnimalShelter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize( 600,400);
		frame.setVisible(true);
		
		frame.setLayout( new BorderLayout() );
		
		
		JPanel panelLeft = new JPanel();
		JPanel panelMiddle = new JPanel();
		JPanel panelRight = new JPanel();
		JPanel panelBottom = new JPanel();

		panelLeft.setLayout(new BorderLayout());
		
		
		JLabel text = new JLabel("Shelter zum hinzufügen der Tiere wählen");
		
		JComboBox<String> dropdown = new JComboBox<> ();
		this.add(dropdown,BorderLayout.NORTH);
		
		dropdown.addItem("Shelter 1");
		dropdown.addItem("Shelter 2");
		dropdown.addItem("Shelter 3");
		
		JButton btn = new JButton("Add animal to shelter");
		
//		dropdown.addActionListener( (e) -> {
//			String selection = (String)dropdown.getSelectedItem();
//			
//			switch( selection ) {
//			case "Shelter 1":
//				
//				db.getShelterName();		//TODO
				
//				programSettings.setDatabase(Settings.DB_SQLITE3);
//				break;
//			case "Shelter 2":
//				programSettings.setDatabase(Settings.DB_MYSQL);
//				break;
//			case "Shelter 3":
//				programSettings.setDatabase(Settings.DB_POSTGRES);
//				break;
//			}
//			
//		
			
		
		
		
		
		
		
		panelLeft.add( text, BorderLayout.NORTH) ;
		panelLeft.add( dropdown , BorderLayout.CENTER);
		panelLeft.add(btn,BorderLayout.SOUTH);

		
		
		
		
		frame.add(panelLeft, BorderLayout.WEST);
		
		frame.pack();
		
		
		
		
		
		//
		// Middle Panel
		//
		
		panelMiddle.setLayout( new BorderLayout() );
		JTextField id = new JTextField("ID");
		JTextField aname = new JTextField("AnimalName");

		
		
		panelMiddle.add(id,BorderLayout.WEST);
		panelMiddle.add(aname,BorderLayout.CENTER);
		
		
		
		
		
		
		
//		btn.addActionListener( new ActionListener() {		
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(frame, "Hallo WElt");			
//			}
//		});
		
		
//		btn.addActionListener( (e) -> {
//			String AnimalName = textFirstname.getText();
//			String lastname = textLastname.getText();
//			String customerId = textCustomerId.getText();
//			
//			JOptionPane.showMessageDialog(frame, firstname + lastname + customerId);
//		});

		
//		panelMiddle.add(btn, BorderLayout.SOUTH);
//		
//		
//		ImagePanel ip = new ImagePanel("H:\\Git-Arbeitsordner\\java2_mit_eclipse\\gitProjecttesteclipse\\animalshelter.png");
//		
//		
//		panelMiddle.add(ip, BorderLayout.CENTER);
//		
//		
//		
		frame.add(panelMiddle, BorderLayout.CENTER);
//		
//		
//		
//		
//		
		frame.pack();		//das Frame auf die Minimalmögliche Größe setzen
		
		
		//
		//Right Panel
		//
		
		panelRight.setLayout( new BorderLayout() );

		JTextField type = new JTextField("Type");
		JTextField temper = new JTextField("Temper");
		
		
		panelRight.add(type,BorderLayout.WEST);
		panelRight.add(temper,BorderLayout.CENTER);
		
		frame.add(panelRight, BorderLayout.EAST);
		
		frame.pack();	
		
		
		
		//
		//BOTTOM Panel
		//
		
		panelBottom.setLayout( new BorderLayout() );

		JTextField idInput = new JTextField("");
		JTextField anameInput = new JTextField("");
		JTextField typeInput = new JTextField("");
		JTextField temperInput = new JTextField("");
		
		panelBottom.add(idInput,BorderLayout.WEST);
		panelBottom.add(anameInput,BorderLayout.CENTER);
		panelBottom.add(typeInput,BorderLayout.EAST);
//		panelBottom.add(temperInput,BorderLayout.WEST);
		
		
		frame.add(panelBottom, BorderLayout.SOUTH);
		
		frame.pack();	
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
		WindowExample we = new WindowExample();
		
	}
}
