package stuff;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Game extends JPanel { //This controls what happens in the Game state
	
	private Wrecks wrecks;
	private Paige paige;
	private June june;

	public Game() {
		initCharacters();
	}
	
	public void initCharacters() {
		wrecks = new Wrecks();
		paige = new Paige();
		june = new June();
	}
	
	public void drawCharacter(Graphics2D g2d , int characterID) {	//Draws the chosen character
		switch(characterID){
			case 1:
				drawWrecks(g2d);	//Draws Wrecks when characterID is 1
				break;
			case 2:
				drawPaige(g2d);		//Draws Paige when characterID is 2
				break;
			case 3:
				drawJune(g2d);		//Draws June when characterID is 3
				break;
			default:	//Probably not necessary
				break;
		}
	}
	
	public void drawWrecks(Graphics2D g2d) {	//Call this to draw Wrecks
		wrecks.checkMovement();
		wrecks.checkBounds();
		
		g2d.drawImage(wrecks.getImage(wrecks.getSpriteID()), 
			wrecks.getX(), wrecks.getY(),
			wrecks.getPlayerDimensions(), wrecks.getPlayerDimensions(), this);
	}
	
	public void drawPaige(Graphics2D g2d) {		//Call this to draw Paige
		paige.checkMovement();
		paige.checkBounds();
		
		g2d.drawImage(paige.getImage(paige.getSpriteID()), 
			paige.getX(), paige.getY(),
			paige.getPlayerDimensions(), paige.getPlayerDimensions(), this);
	}
	
	public void drawJune(Graphics2D g2d) {		//Call this to draw June
		june.checkMovement();
		june.checkBounds();
		
		g2d.drawImage(june.getImage(june.getSpriteID()), 
			june.getX(), june.getY(),
			june.getPlayerDimensions(), june.getPlayerDimensions(), this);
	}
	
	public void keyPressed(KeyEvent e , int thingy) {	//For controlling the character
		switch(thingy){
		case 1:								//If player wants to use arrow keys
			wrecks.keyPressedARROW(e);
			paige.keyPressedARROW(e);
			june.keyPressedARROW(e);
			break;
		case 2:								//If player wants to use WASD keys
			wrecks.keyPressedWASD(e);
			paige.keyPressedWASD(e);
			june.keyPressedWASD(e);
			break;
		default:
				break;
		}
		
		
	}
	
	public void keyReleased(KeyEvent e , int thingy) {
		wrecks.keyReleasedARROW(e);
		paige.keyReleasedARROW(e);
		june.keyReleasedARROW(e);
		wrecks.keyReleasedWASD(e);
		paige.keyReleasedWASD(e);
		june.keyReleasedWASD(e);
	}
	
	public void actionPerformed(ActionEvent e) {		//Set character's ability to move
		
		wrecks.move();
		paige.move();
		june.move();
		
		repaint();
	}
}
