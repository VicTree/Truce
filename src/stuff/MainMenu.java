package stuff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
	private Image buttonImage;
	private Image titleImage;
	private Button button;
	private int pv001 , pv002 , pv003 , pv004;
	
	public void drawMenu(Graphics g2d) {			//This is what is going to be called to draw the main menu screen
		pv001 = 200;
		pv002 = pv001 + 75;
		pv003 = pv002 + 75;
		
		pv004 = 400;
		
		drawTitle(g2d);
		drawButton(g2d , "Play" , 300 , pv001);
		drawButton(g2d , "Options" , 300 , pv002);
		drawButton(g2d , "Exit" , 300 , pv003);
	}
	
	private void drawTitle(Graphics g2d) {			//Draws the Title , TODO Make a new Title Image
		ImageIcon title = new ImageIcon(this.getClass().getResource("resource/Title.png"));
		titleImage = title.getImage();
		
		g2d.setColor(Color.MAGENTA);
		g2d.setFont(new Font("Arial", 75, 75));
		g2d.drawImage(titleImage, 200, 50, pv004, pv004/5, this);
	}
	
	private void drawButton(Graphics g2d, String name , int x , int y) {			//Draws a Button Image
		ImageIcon button = new ImageIcon(this.getClass().getResource("resource/Button.png"));
		buttonImage = button.getImage();
		
		g2d.setColor(Color.MAGENTA);
		g2d.drawImage(buttonImage, x, y, 200, 50, this);	//This draws the box behind the text
		
		g2d.setColor(Color.YELLOW);
		g2d.setFont(new Font("Arial" , Font.BOLD, 30));
		g2d.drawString(name, x + 20, y + 35); 				//This draws the Text onto the Button
	}
}
