package stuff;

public class Weapon {		//Completely pointless at the moment
	
	private int x , y;
	private boolean visible;
	private boolean possessed;
	
	public void setPosition(){
		x = 387;
		y = 287;
	}
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getDimensions() {
    	return 25;
    }
    
    public void setVisible(boolean visible){
    	this.visible = visible;
    }
    public boolean isVisible(){
    	return visible; 
    }
    
    public boolean isPossessed(){
    	return possessed;
    }
    
}
