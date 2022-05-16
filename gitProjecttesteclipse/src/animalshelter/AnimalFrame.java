package animalshelter;


import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AnimalFrame extends JFrame{
	
	private Settings programSettings;
	
	
	public void notImplemented() {
		JOptionPane.showMessageDialog(this, "Function not implemented");
	}

	
	public AnimalFrame( ) throws IOException {
		programSettings = new Settings();
		
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image image = ImageIO.read(new File("animalshelter.png"));
		this.setIconImage(image);
		
		
		JMenuBar jmenu = new JMenuBar();
		JMenu menu1  = new JMenu( "Datei");
		JMenuItem exitMenu = new JMenuItem("Beenden");
		exitMenu.addActionListener((e)-> System.exit(0));
		
		menu1.add(exitMenu);
		
		
		
		menu1.addActionListener((e)->{
			notImplemented();
		});
		
		jmenu.add(menu1);
		
		
		//
		// Einstellung - Menu
		//
		JMenu menu2  = new JMenu( "Einstellung");
	
		
		JMenuItem settings = new JMenuItem("Datenbank-Einstellungen");
		settings.addActionListener( (e)->{
			SettingsDialog sd = new SettingsDialog(programSettings);
		});
		menu2.add(settings);
		jmenu.add(menu2);
	
		
		
		this.setJMenuBar(jmenu);

		
		

		this.setVisible(true);
	}
	

	
	public static void main(String[] args)throws IOException {
		AnimalFrame af = new AnimalFrame();

	}

}
