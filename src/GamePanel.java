import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	private int originalTileSize = 16; // Size of the toys
	private int scale = 3;
	private int tileSize = originalTileSize*scale;
	private int maxScreenColumn = 16;
	private int maxScreenRow = 12;
	private int screenWidth = tileSize*maxScreenColumn;
	private int screenHeight = tileSize*maxScreenRow;
	
	Thread gameThread;// something about the time 
	
	public  GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.GRAY);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
