package Snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame(){
		GamePanel panel = new GamePanel();	
		this.add(panel);
		this.setTitle("Snake Game: Kanishk");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
	public static void main(String [] args) {
		new GameFrame();
	}

}
