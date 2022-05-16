package animalshelter;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SettingsDialog extends JDialog {

	private Settings programSettings;
	
	
	public SettingsDialog(Settings programSettings)  {
		this.programSettings = programSettings;
		
		this.setSize(500,250);
		this.setVisible(true);
		
		
		JLabel text = new JLabel("Datenbank  wählen");
		this.add(text,BorderLayout.NORTH);
		
		
		
		JButton okBtn = new JButton("OK");
		JButton cancelBtn = new JButton("Abbrechen");
		
		JComboBox<String> dropDown = new JComboBox<>();
		
		dropDown.addItem("SQLite3 Datenbank");
		dropDown.addItem("MySQL Datenbank");
		dropDown.addItem("Postgres Datenbank");
		
		
		
		okBtn.addActionListener( (e) -> {
			String selection = (String)dropDown.getSelectedItem();
			
			switch( selection ) {
			case "SQLite3 Datenbank":
				programSettings.setDatabase(Settings.DB_SQLITE3);
				break;
			case "MySQL Datenbank":
				programSettings.setDatabase(Settings.DB_MYSQL);
				break;
			case "Postgres Datenbank":
				programSettings.setDatabase(Settings.DB_POSTGRES);
				break;
			}
			
		
			this.dispose();
		
		});
		
		
		
		cancelBtn.addActionListener( (c)-> {
			
			this.dispose(); 
		});
		
		
		
		this.add(dropDown, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel();
		
		
		southPanel.add(okBtn,BorderLayout.WEST);
		southPanel.add(cancelBtn,BorderLayout.EAST);
		
		this.add(southPanel,BorderLayout.SOUTH);
		this.pack();
	}

}
