package stuff;

import java.awt.Image;

import javax.swing.ImageIcon;

public class June extends Character {		//Basically a class to get Images for this specific character
	
	private Image standLeft;
	private Image runLeftA;
	private Image runLeftB;
	private Image standRight;
	private Image runRightA;
	private Image runRightB;
	
	private Image image;
	
	private Image[] characterSprite = {standLeft, runLeftA, runLeftB, standRight, runRightA, runRightB};
	
	private String[] junePathsBasic = {"resource/characters/june 1.png", "resource/characters/june 2.png",
			"resource/characters/june 3.png", "resource/characters/june 4.png",
			"resource/characters/june 5.png", "resource/characters/june 6.png"};
	
	private String[] junePathsOffensive = {"resource/characters/june 7.png", "resource/characters/june 8.png",
			"resource/characters/june 9.png", "resource/characters/june 10.png",
			"resource/characters/june 11.png", "resource/characters/june 12.png"};
	
	private String[] junePathsDeath = {"resource/characters/june 13.png", "resource/characters/june 14.png",
			"resource/characters/june 15.png","resource/characters/june 16.png",
			"resource/characters/june 17.png", "resource/characters/june 18.png"};
	
	public Image getImage(int pictureID) {
		
		ImageIcon june = new ImageIcon(this.getClass().getResource(junePathsBasic[pictureID - 1]));
		characterSprite[pictureID -1] = june.getImage();
	    image = characterSprite[pictureID - 1];
	    return image;
	}
	
	public int characterID() {
		return 3;
	}
	
}
