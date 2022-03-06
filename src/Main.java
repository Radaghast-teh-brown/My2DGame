import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("2D basic Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		window.pack();
	

	}

}
