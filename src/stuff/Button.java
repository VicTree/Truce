package stuff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class Button implements ImageObserver {

	private Image buttonImage;
	private String pathString;
	
	public Button(int xPos, int yPos, Graphics g) {
		drawButton(g, xPos, yPos);
	}
	
	private void drawButton(Graphics g2d, int x , int y) {
		ImageIcon button = new ImageIcon(this.getClass().getResource(pathString));
		buttonImage = button.getImage();
		
		g2d.setColor(Color.MAGENTA);
		g2d.drawImage(buttonImage, x, y, 200, 50, this);	//This draws the box behind the text
		
		g2d.setColor(Color.YELLOW);
		g2d.setFont(new Font("Arial" , Font.BOLD, 30));
		//g2d.drawString(name, x + 20, y + 35); 				//This draws the Text onto the Button
	}

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y,
			int width, int height) {
		// TODO Auto-generated method stub
		return false;
	}
}