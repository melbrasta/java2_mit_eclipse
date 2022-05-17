package animalshelter;

import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AnimalTablePanel extends JPanel{
	
	
	private JTable animalTable;
	private Settings programSettings;
	private String[] columnNames = {
			"ID", "AnimalName", "Type", "Temper", ""
	};
	
	public AnimalTablePanel(Settings programSettings) {
		this.programSettings = programSettings;
		
		Object[][] tableData = { {"","","","",""}};
		
		
		animalTable = new JTable( new DefaultTableModel(tableData, columnNames)) ;
		animalTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		this.add(animalTable);
		
	}
	
	public void addAnimalsToTable ( AnimalShelter animalShelter ) throws ClassNotFoundException, SQLException {
		
		DBConnector db = programSettings.getDatabaseConnector();
		db.connect();
		
		Animal[] animals = db.listAllAnimalsInShelter(animalShelter);
		
		DefaultTableModel model = (DefaultTableModel)this.animalTable.getModel();
		
		for( int i = 0; i< model.getRowCount();i++) {
			model.removeRow(0);
		}
		
	//	model.setColumnIdentifiers(columnNames);
		
		//model.addRow(columnNames);
		

		for( Animal animal : animals ) {
			
			Object[] animalData = {
					0, animal.getName(), db.getTypeFromId(animal.getType()), animal.getTemper() 
			};
			
			model.addRow(animalData);
		}
	
		db.close();
		
	}

}
