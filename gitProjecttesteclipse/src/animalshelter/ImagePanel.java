package animalshelter;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
	
	private BufferedImage bmp; 
	
	private int width;
	private int height;
	
	
	
	
	public ImagePanel( String filename ) throws IOException {
		bmp = ImageIO.read( new File( filename ) );
		width = bmp.getWidth();
		height = bmp.getHeight();
		
		this.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved( MouseEvent e ) {
				 int x = e.getX();
				 int y = e.getY();
				 System.out.println(x + ":"+y);
			}	
		});
		
	}
	
	@Override
	public void paint( Graphics g ) {
		super.paint(g);
		
		g.drawImage(bmp,0, 0,width, height, 0, 0, this.getWidth(),  this.getHeight(), null);
	}

}
