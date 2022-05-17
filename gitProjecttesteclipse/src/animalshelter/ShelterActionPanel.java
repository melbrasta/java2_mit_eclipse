package animalshelter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

import animalshelter.PostgresDBConnector;

public class ShelterActionPanel extends JPanel{
	
	private JButton addAnimalBtn;
	private JComboBox<AnimalShelter> animalShelterComboBox;
	
	
	public ShelterActionPanel(Settings settings) throws SQLException, ClassNotFoundException {
		DBConnector db = null;
		
		db = settings.getDatabaseConnector();
		db.connect();
		
		this.setLayout(new BorderLayout() );
		
		animalShelterComboBox = new JComboBox<>();
		
		AnimalShelter[] shelters  = db.getAllShelters();
		
		for( AnimalShelter animalShelter : shelters) {
			animalShelterComboBox.addItem(animalShelter);
		}
		
		this.add(animalShelterComboBox, BorderLayout.NORTH);
		
		
		addAnimalBtn = new JButton("Add Animal");
		addAnimalBtn.setBackground( Color.BLUE );
		
		this.add(addAnimalBtn, BorderLayout.CENTER);
		
		
	}
	
	
	public AnimalShelter getSelectedShelter ( )  {
		
		AnimalShelter animalShelter = null;
		animalShelter  = (AnimalShelter)this.animalShelterComboBox.getSelectedItem();
		
		return animalShelter;
	
	}
	
	public void setComboItemListener( ItemListener il  ) {
		this.animalShelterComboBox.addItemListener(il);
	}

}
