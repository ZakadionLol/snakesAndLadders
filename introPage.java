package snakesAndLadders;

import javax.swing.*;
import snakesAndLadders.game;
import java.awt.*;
import java.awt.event.*;

public class introPage extends JFrame implements ActionListener {
	JFrame frame2;
	JPanel players, contentPane, buttons, infoPane, startPane, howToPane;
	JButton start, howToPlay;
	JLabel P1Name, P2Name, title;
	
	game GV = new game();
	public void introPage() {
		frame2 = new JFrame("Snakes and Ladders");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		contentPane.setPreferredSize(new Dimension(600, 500));
		
		title = new JLabel(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\title.jpg"));
		title.setPreferredSize(new Dimension(416, 85));
		title.setAlignmentY(JPanel.TOP_ALIGNMENT);
		contentPane.add(title);
		
		infoPane = new JPanel();
		infoPane.setLayout(new BoxLayout(infoPane, BoxLayout.PAGE_AXIS));
		infoPane.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		infoPane.setAlignmentY(JPanel.TOP_ALIGNMENT);
		contentPane.add(infoPane);
		
		players = new JPanel();
		players.setLayout(new GridLayout(2, 1, 10, 5));
		infoPane.add(players);
		
		P1Name = new JLabel();
		P1Name.setText("Player 1 ");
		P1Name.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		players.add(P1Name);
		
		P2Name = new JLabel();
		P2Name.setText("Player 2 ");
		P2Name.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		players.add(P2Name);
		
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(1, 3, 10, 5));
		infoPane.add(buttons);

		startPane = new JPanel();
		buttons.add(startPane);
		
		howToPane = new JPanel();
		buttons.add(howToPane);
		
		start = new JButton("START");
		start.setAlignmentX(JButton.CENTER_ALIGNMENT);
		start.setAlignmentY(JButton.CENTER_ALIGNMENT);
		start.setActionCommand("start");
		start.addActionListener(this);
		start.setPreferredSize(new Dimension (150, 75));
		startPane.add(start);
		
		howToPlay = new JButton("HOW TO PLAY");
		howToPlay.setAlignmentX(JButton.CENTER_ALIGNMENT);
		howToPlay.setAlignmentY(JButton.CENTER_ALIGNMENT);
		howToPlay.setActionCommand("help");
		howToPlay.addActionListener(this);
		howToPlay.setPreferredSize(new Dimension(150, 75));
		howToPane.add(howToPlay);
		
		frame2.setContentPane(contentPane);
		frame2.pack();
		frame2.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		
		if (eventName.equals("start")) {
			
		}
		if (eventName.equals("help")) {
			
		}
	}
	
	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		introPage greeting = new introPage();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}
}
