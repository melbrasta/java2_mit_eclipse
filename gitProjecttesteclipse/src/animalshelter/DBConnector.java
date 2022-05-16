package animalshelter;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class DBConnector {
	private Connection conn;
	
	public abstract void connect()throws SQLException, ClassNotFoundException;
	public abstract void createDatabase() throws SQLException;
	public abstract void dropDatabase() throws SQLException ;
	
	
	public void connect(String connection) throws SQLException {
		this.conn = DriverManager.getConnection(connection);
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public AnimalShelter[] getAllShelters() {
		return null;
	}
	
	public void addShelter( AnimalShelter shelter ) {
		
	}
	
	public AnimalShelter getShelter( AnimalShelter shelter ) {
		return null;
	}	
	
	public void addAnimalToShelter(AnimalShelter shelter,  Animal animal ) {
		
		
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
		
		
		JLabel text = new JLabel("Shelter zum hinzuf�gen der Tiere w�hlen");
		
		JComboBox<String> dropdown = new JComboBox<> ();
		
		panelLeft.add(dropdown,BorderLayout.NORTH);
		
		dropdown.addItem("Shelter 1");
		dropdown.addItem("Shelter 2");
		dropdown.addItem("Shelter 3");
		
		JButton btn = new JButton("Add animal to shelter");
		
			
		
		
		
		
		
		
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
		frame.pack();		//das Frame auf die Minimalm�gliche Gr��e setzen
		
		
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
	
	public void changeAnimalInShelter(AnimalShelter shelter,  Animal animal ) {
	}
	
	public Animal getAnimalFromShelter( int shelterId ,  int id ) {
		return null;
	}
	
	public Animal removeAnimalFromShelter( AnimalShelter shelter, int id ) {
		return null;
	}
	
	public Animal[] listAllAnimalsInShelter(AnimalShelter shelter,  int shelterId ) {
		return null;
	}
	
	public void close() throws SQLException {
		if(this.conn !=null)
		{
			this.conn.close();
		}
	}
	
	

	
}