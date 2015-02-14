package stuff;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Paige extends Character {		//Basically a class to get Images for this specific character

	private String paigePath = "resource/Paige 1.jpg";
	private String paigePathA = "resource/Paige 2.jpg";
	private String paigePathB = "resource/Paige 3.jpg";

	private Image paige;
	private Image paigeA;
	private Image paigeB;
	private Image image;

	public Paige() {
		ImageIcon paige1 = new ImageIcon(this.getClass().getResource(paigePath));
		ImageIcon paige2 = new ImageIcon(this.getClass().getResource(paigePathA));
		ImageIcon paige3 = new ImageIcon(this.getClass().getResource(paigePathB));

		paige = paige1.getImage();
		paigeA = paige2.getImage();
		paigeB = paige3.getImage();

	}

	public Image getImage(int pictureID) {

		switch (pictureID) {

		case 1:
			image = paige;
			break;
		case 2:
			image = paigeA;
			break;
		case 3:
			image = paigeB;
			break;
		default:
			image = paige;
			break;
		}
		return image;
	}
	
	public int characterID() {
		return 2;
	}

}
