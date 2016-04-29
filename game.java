package snakesAndLadders;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;

public class game extends JFrame implements ActionListener {
	JFrame frame1;
	JPanel boardGame, gamePane, gameLeftPane, buttonPane, rollPane, newGamePane;
	JLabel dieFace, board, P1, P2;
	JButton Roll, newGame;
	String Player1, Player2;
	public int player1Place;
	public int player2Place;
	public int roll;
	public int turn = 1;
	public JLabel piece1, piece2;
	
	game GV = new game();
	public void game() {
		frame1 = new JFrame("Snakes and Ladders");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gamePane = new JPanel();
		gamePane.setLayout(new GridLayout(1, 2, 10, 5));
		gamePane.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		
		gameLeftPane = new JPanel();
		
		board = new JLabel(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\board.jpg"));
		board.setLayout(new BoxLayout(board, BoxLayout.PAGE_AXIS));
		board.setPreferredSize(new Dimension(600, 600));
		board.setAlignmentX(JPanel.LEFT_ALIGNMENT);
		gameLeftPane.add(board);
		
		boardGame = new JPanel();
		boardGame.setLayout(new GridLayout(10,10, 1, 1));
		boardGame.setPreferredSize(new Dimension(550, 550));
		boardGame.setOpaque(false);
		board.add(boardGame);
		
		buttonPane = new JPanel();
		buttonPane.setLayout(new GridLayout(5, 1, 10, 5));
		buttonPane.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		buttonPane.setAlignmentX(JPanel.RIGHT_ALIGNMENT);
		
		dieFace = new JLabel(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice1.jpg"));
		dieFace.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		dieFace.setSize(20, 20);
		buttonPane.add(dieFace);
		
		rollPane = new JPanel();
		newGamePane = new JPanel();
		
		P1 = new JLabel();
		P1.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		P1.setText("Player 1: " + player1Place);
		buttonPane.add(P1);
		
		P2 = new JLabel();
		P2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		P2.setText("Player 2: " + player2Place);
		buttonPane.add(P2);
		
		piece1 = new JLabel(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\P1.jpg"));
		piece1.setPreferredSize(new Dimension(45, 45));

		Roll = new JButton("Roll");
		Roll.setAlignmentY(JButton.BOTTOM_ALIGNMENT);
		Roll.setAlignmentX(JButton.CENTER_ALIGNMENT);
		Roll.setActionCommand("roll");
		Roll.addActionListener(this);
		Roll.setPreferredSize(new Dimension(100, 50));
		rollPane.add(Roll);
		buttonPane.add(rollPane);
		
		newGame = new JButton("New Game");
		newGame.setAlignmentY(JButton.TOP_ALIGNMENT);
		newGame.setAlignmentX(JButton.CENTER_ALIGNMENT);
		newGame.setActionCommand("restart");
		newGame.addActionListener(this);
		newGame.setPreferredSize(new Dimension(100, 50));
		newGamePane.add(newGame);
		buttonPane.add(newGamePane);
		
		gamePane.add(gameLeftPane);
		gamePane.add(buttonPane);
		
		frame1.setContentPane(gamePane);
		frame1.pack();
		frame1.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		String eventName = event.getActionCommand();
		
		if (eventName.equals("roll")) {
			roll = (int)(6 * Math.random() + 1);
			
			if (roll == 1) {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice1.jpg"));
			} else if (roll == 2) {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice2.jpg"));
			} else if (roll == 3) {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice3.jpg"));
			} else if (roll == 4) {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice4.jpg"));
			} else if (roll == 5) {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice5.jpg"));
			} else {
				dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice6.jpg"));
			}
			
			if (turn == 1) {
				player1Place += roll;
				if (player1Place > 100) {
					JOptionPane.showMessageDialog(null, "Sorry but you exceeded 100, go back and wait till your next turn.");
					player1Place -= roll;
				}
				switch (player1Place) {
					case 1: player1Place = 38;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 1, Move up to square 38.");
					break;
					case 4: player1Place = 14;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 4, Move up to square 14.");
					break;
					case 9: player1Place = 31;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 9, Move up to square 31.");
					break;
					case 17: player1Place = 7;
							JOptionPane.showMessageDialog(null, "Found a snake at square 17, Move down to square 7.");
					break;
					case 21: player1Place = 42;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 21, Move up to square 42.");
					break;
					case 28: player1Place = 84;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 28, Move up to square 84.");
					break;
					case 51: player1Place = 67;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 51, Move up to square 67.");
					break;
					case 54: player1Place = 34;
							JOptionPane.showMessageDialog(null, "Found a snake at square 54, Move down to square 34.");
					break;
					case 62: player1Place = 19;
							JOptionPane.showMessageDialog(null, "Found a snake at square 62, Move down to square 19.");
					break;
					case 64: player1Place = 60;
							JOptionPane.showMessageDialog(null, "Found a snake at square 64, Move down to square 60.");
					break;
					case 71: player1Place = 91;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 71, Move up to square 91.");
					break;
					case 80: player1Place = 100;
							JOptionPane.showMessageDialog(null, "Found a ladder at square 80, Move up to square 100.");
					break;
					case 87: player1Place = 24;
							JOptionPane.showMessageDialog(null, "Found a snake at square 87, Move down to square 24.");
					break;
					case 93: player1Place = 73;
							JOptionPane.showMessageDialog(null, "Found a snake at square 93, Move down to square 73.");
					break;
					case 95: player1Place = 75;
							JOptionPane.showMessageDialog(null, "Found a snake at square 95, Move down to square 75.");
					break;
					case 98: player1Place = 79;
							JOptionPane.showMessageDialog(null, "Found a snake at square 98, Move down to square 79.");
				}
				P1.setText("Player 1: " + player1Place);
				
				if (player1Place == 100) {
					JOptionPane.showMessageDialog(null, "Player 1 wins");
					player1Place = 0;
					player2Place = 0;
					P1.setText("Player 1: " + player1Place);
					P2.setText("Player 2: " + player2Place);
					dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice1.jpg"));
					turn = 1;
				}
				turn++;
			} else {
				player2Place += roll;
				if (player2Place > 100) {
					JOptionPane.showMessageDialog(null, "Sorry but you exceeded 100, go back and wait till your next turn.");
					player2Place -= roll;
				}
				switch (player2Place) {
				case 1: player2Place = 38;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 1, Move up to square 38.");
				break;
				case 4: player2Place = 14;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 4, Move up to square 14.");
				break;
				case 9: player2Place = 31;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 9, Move up to square 31.");
				break;
				case 17: player2Place = 7;
						JOptionPane.showMessageDialog(null, "Found a snake at square 17, Move down to square 7.");
				break;
				case 21: player2Place = 42;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 21, Move up to square 42.");
				break;
				case 28: player2Place = 84;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 28, Move up to square 84.");
				break;
				case 51: player2Place = 67;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 51, Move up to square 67.");
				break;
				case 54: player2Place = 34;
						JOptionPane.showMessageDialog(null, "Found a snake at square 54, Move down to square 34.");
				break;
				case 62: player2Place = 19;
						JOptionPane.showMessageDialog(null, "Found a snake at square 62, Move down to square 19.");
				break;
				case 64: player2Place = 60;
						JOptionPane.showMessageDialog(null, "Found a snake at square 64, Move down to square 60.");
				break;
				case 71: player2Place = 91;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 71, Move up to square 91.");
				break;
				case 80: player2Place = 100;
						JOptionPane.showMessageDialog(null, "Found a ladder at square 80, Move up to square 100.");
				break;
				case 87: player2Place = 24;
						JOptionPane.showMessageDialog(null, "Found a snake at square 87, Move down to square 24.");
				break;
				case 93: player2Place = 73;
						JOptionPane.showMessageDialog(null, "Found a snake at square 93, Move down to square 73.");
				break;
				case 95: player2Place = 75;
						JOptionPane.showMessageDialog(null, "Found a snake at square 95, Move down to square 75.");
				break;
				case 98: player2Place = 79;
						JOptionPane.showMessageDialog(null, "Found a snake at square 98, Move down to square 79.");
			}
				P2.setText("Player 2: " + player2Place);
				if (player2Place == 100) {
					JOptionPane.showMessageDialog(null, "Player 2 wins");
					player1Place = 0;
					player2Place = 0;
					P1.setText("Player 1: " + player1Place);
					P2.setText("Player 2: " + player2Place);
					dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice1.jpg"));
					turn = 1;
				}
				turn--;	
			}
		}			
		
		if (eventName.equals("restart")) {
			player1Place = 0;
			player2Place = 0;
			P1.setText("Player 1: " + player1Place);
			P2.setText("Player 2: " + player2Place);
			turn = 1;
			dieFace.setIcon(new ImageIcon("C:\\Users\\millb_000\\Documents\\Java Programming\\Snakes and Ladders\\src\\snakesAndLadders\\dice1.jpg"));
		}
		
		if (player1Place >= 100) {
			
		}
	}

	private static void runGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		game greeting = new game();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				runGUI();
			}
		});
	}
}
