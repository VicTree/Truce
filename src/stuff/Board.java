package stuff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener {
	private Timer timer;
	private Game game , game2;
	private MainMenu mainMenu;
	private CharacterMenu charMenu;
	private int characterID;
	
	private enum STATE{
		MAIN_MENU , CHARACTER_MENU , GAME
	};
	
	private STATE State;

	public Board() {
		initGameBoard();
	}
	
	private void initGameBoard() {
		this.addKeyListener(new KeyListenerer());
		this.setFocusable(true);
		this.setDoubleBuffered(true);
		this.setBackground(Color.BLACK);
		
		State = STATE.MAIN_MENU;
		
		game = new Game();
		game2 = new Game();
		mainMenu = new MainMenu();
		charMenu = new CharacterMenu();
		
		timer = new Timer(5 , this);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {			//Tells what to paint on the JPanel
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		if(State == STATE.GAME) {						//During the Game Screen
			game.drawCharacter(g2d , characterID);
			game2.drawCharacter(g2d, characterID);
		}
		if(State == STATE.CHARACTER_MENU) {				//During the Character Select Screen
			charMenu.drawMenu(g2d, characterID);
		}
		if(State == STATE.MAIN_MENU) {					//During the Main Menu Screen
			mainMenu.drawMenu(g);
		}
		
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(State == STATE.GAME) {
			game.actionPerformed(e);
			game2.actionPerformed(e);
		}
		if(State == STATE.CHARACTER_MENU) {
			
		}
		if(State == STATE.MAIN_MENU) {
			
		}
		repaint();
	}
	
	private class KeyListenerer extends KeyAdapter {	//The Main Key Listener
		
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			
			if(State == STATE.GAME) {
				game.keyPressed(e , 1);
				game2.keyPressed(e, 2);
				if(key == KeyEvent.VK_BACK_SPACE) {State = STATE.CHARACTER_MENU; characterID = 0;}
				if(key == KeyEvent.VK_ESCAPE) {State = STATE.MAIN_MENU;}
			}
			if(State == STATE.CHARACTER_MENU) {
				if (key == KeyEvent.VK_ENTER) {if(characterID > 0){State = STATE.GAME;}}
				if(key == KeyEvent.VK_ESCAPE) {State = STATE.MAIN_MENU;}
				if(key == KeyEvent.VK_1) {characterID = 1;}
				if(key == KeyEvent.VK_2) {characterID = 2;}
				if(key == KeyEvent.VK_3) {characterID = 3;}
			}
			if(State == STATE.MAIN_MENU){
				if (key == KeyEvent.VK_ENTER) {State = STATE.CHARACTER_MENU;}
			}
		}
		
		public void keyReleased(KeyEvent e) {
			if(State == STATE.GAME) {
				game.keyReleased(e , 1);
				game2.keyReleased(e, 2);
			}
			if(State == STATE.CHARACTER_MENU) {
				
			}
			if(State == STATE.MAIN_MENU) {
				
			}
		}
	}
}
