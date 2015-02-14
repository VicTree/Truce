package stuff;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainClass extends JFrame {
	
	private int WIDTH;
	private int HEIGHT;
	
	public MainClass() {
		initUI();
	}
	
	private void initUI() {
		
		this.add(new Board());
		
		WIDTH = 800;
		HEIGHT = 600;
		
		this.setSize(getWIDTH() , getHEIGHT());
		
		this.setTitle("Truce?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public int getWIDTH(){
		return WIDTH;
	}
	
	public int getHEIGHT(){
		return HEIGHT;
	}
	
	public static void main(String[] args) {
		new MainClass();
	}
}
