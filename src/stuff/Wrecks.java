package stuff;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wrecks extends Character {		//Basically a class to get Images for this specific character
	
	private Image standLeft;
	private Image runLeftA;
	private Image runLeftB;
	private Image standRight;
	private Image runRightA;
	private Image runRightB;
	
	private Image image;
	
	private Image[] characterSprite = {standLeft, runLeftA, runLeftB, standRight, runRightA, runRightB};
	
	private String[] wrecksPathsBasic = {"resource/characters/wrecks 1.png", "resource/characters/wrecks 2.png",
			"resource/characters/wrecks 3.png", "resource/characters/wrecks 4.png",
			"resource/characters/wrecks 5.png", "resource/characters/wrecks 6.png"};
	
	private String[] wrecksPathsOffensive = {"resource/characters/wrecks 7.png", "resource/characters/wrecks 8.png",
			"resource/characters/wrecks 9.png", "resource/characters/wrecks 10.png",
			"resource/characters/wrecks 11.png", "resource/characters/wrecks 12.png"};
	
	private String[] wrecksPathsDeath = {"resource/characters/wrecks 13.png", "resource/characters/wrecks 14.png",
			"resource/characters/wrecks 15.png","resource/characters/wrecks 16.png",
			"resource/characters/wrecks 17.png", "resource/characters/wrecks 18.png"};
	
	public Image getImage(int pictureID) {
		
		ImageIcon wrecks = new ImageIcon(this.getClass().getResource(wrecksPathsBasic[pictureID - 1]));
		characterSprite[pictureID -1] = wrecks.getImage();
	    image = characterSprite[pictureID - 1];
	    return image;
	}
	
	public int characterID() { 			//Useless 
		return 1;
	}
}
