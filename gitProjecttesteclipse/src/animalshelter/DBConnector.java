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
		JPanel panelRight = new JPanel();
		JPanel panelRighTtop = new JPanel();
		JPanel panelRightBottom = new JPanel();

		
		
		//
		//panel left
		//
		//
		panelLeft.setLayout(new BorderLayout());
		
		
		JLabel text = new JLabel("Shelter zum hinzufügen der Tiere wählen");
		
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
		//Right Panel
		//
		
		panelRight.setLayout( new BorderLayout() );
		frame.add(panelRight, BorderLayout.EAST);
		
		
		//
		//rechts oben
		//
		
		panelRighTtop.setLayout( new BorderLayout() );
		JTextField id = new JTextField("ID");
		JTextField aname = new JTextField("AnimalName");
		JTextField type = new JTextField("Type");
		JTextField temper = new JTextField("Temper");
		
		
		panelRighTtop.add(id,BorderLayout.WEST);
		panelRighTtop.add(aname,BorderLayout.CENTER);
		panelRighTtop.add(type,BorderLayout.EAST);
//		panelRighTtop.add(temper,BorderLayout.CENTER);
		frame.pack();	
		
		frame.add(panelRighTtop, BorderLayout.EAST);
		
		
		//
		// panelRightBottom
		//
		
		panelRightBottom.setLayout( new BorderLayout() );
		
		JTextField idInput = new JTextField("");
		JTextField anameInput = new JTextField("");
		JTextField typeInput = new JTextField("");
//		JTextField temperInput = new JTextField("");
		
//		frame.add(panelRightBottom, BorderLayout.SOUTH);
		
		
		panelRightBottom.add(idInput,BorderLayout.WEST);
		panelRightBottom.add(anameInput,BorderLayout.CENTER);
		panelRightBottom.add(typeInput,BorderLayout.EAST);
		frame.pack();	
		
		frame.add(panelRightBottom, BorderLayout.WEST);
		
		


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
