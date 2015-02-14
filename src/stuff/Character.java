package stuff;

import java.awt.event.KeyEvent;

public class Character {
	private int x , y;
	private int dx , dy;
	private int spriteID;
	
	private static int playerDimensions;
	private static int speed = 2;
	
	private boolean movingLeft;
	private boolean movingRight;
	
	public Character() {
		x = 350;
		y = 250;
	}
	
	public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getSpriteID() {
    	return spriteID;
    }
    
    public int getPlayerDimensions() {
    	return playerDimensions = 75;
    }
    
    public boolean isMovingLeft() {
    	return movingLeft;
    }
    
    public boolean isMovingRight() {
    	return movingRight;
    }
    
    public void checkMovement() {		//Method that makes the sprite animated
		
		if(isMovingLeft() == true){
        	if(getX() % 20 == 0){
        		spriteID = 2;
        	}
        	if(getX() % 20 == 10){
        		spriteID = 3;
        	}
        }else if(isMovingRight() == true){
        	if(getX() % 20 == 0){
        		spriteID = 5;
        	}
        	if(getX() % 20 == 10){
        		spriteID = 6;
        	}
        }else{
        	spriteID = 1;
        }
	}
    
    public void checkBounds(){			//Method that keeps the character from leaving the screen
    	if(x <= 0){
    		x = 0;
    	}
    	if(x  >= (800 - 5) - playerDimensions){
    		x = (800 - 5) - playerDimensions;
    	}
    	if(y <= 0){
    		y = 0;
    	}
    	if(y  >= (600 - 25) - playerDimensions){
    		y = (600 - 25) - playerDimensions;
    	}
    }
    
    public void moveLeft() {
    	 dx = -speed;
         movingLeft = true;
         movingRight = false;
    }
    
    public void moveRight() {
    	dx = speed;
        movingLeft = false;
        movingRight = true;
    }
    
    public void keyPressedARROW(KeyEvent e) { 		//Controls for using Arrow Keys

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        	moveLeft();
        }

        if (key == KeyEvent.VK_RIGHT) {
        	moveRight();
        }

        if (key == KeyEvent.VK_UP) {
            dy = -speed;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = speed;
        }
    }

    public void keyReleasedARROW(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
            movingLeft = false;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
            movingRight = false;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
    public void keyPressedWASD(KeyEvent e) {		//Controls for using W, A, S, and D keys

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
        	moveLeft();
        }

        if (key == KeyEvent.VK_D) {
        	moveRight();
        }

        if (key == KeyEvent.VK_W) {
            dy = -speed;
        }

        if (key == KeyEvent.VK_S) {
            dy = speed;
        }
    }

    public void keyReleasedWASD(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = 0;
            movingLeft = false;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
            movingRight = false;
        }

        if (key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
        }
    }

}
