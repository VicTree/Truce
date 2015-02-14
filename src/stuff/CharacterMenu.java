package stuff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CharacterMenu extends JPanel {

	public void drawMenu(Graphics g2d , int characterID) {		//This is what is called to draw everything for the Character Select Menu
		g2d.setColor(Color.CYAN);
		g2d.setFont(new Font("Times New Roman", 20, 20));
		g2d.drawString("Press 1 for Wrecks", 100, 150);
		g2d.drawString("Press 2 for Paige", 100, 200);
		g2d.drawString("Press 3 for June", 100, 250);
		g2d.drawString("Your Choice: " + characterID, 600, 150);
	}
}
