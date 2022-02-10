package ticTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticTacToeGame extends JFrame {
/*
 * 
 * 
 * made by ENG: Raheem Ahmed Moussa
 * contact me @: raheemahm01@gmail.com
 * linkedIn acc: https://www.linkedin.com/in/raheem-ahmed-119a5b1bb/
 *  Date : 10/2/2022 
 *  
 * 
 * 
 */
	private JPanel contentPane;
	private JTextField txtTicTacToe;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField txtPlayerX;
	private JTextField txtPlayerY;
	private JTextField textField;
	private JTextField textField_1;
	JButton btn00 = new JButton("");
	JButton btn01 = new JButton("");
	JButton btn02 = new JButton("");
	JButton btn10 = new JButton("");
	JButton btn11 = new JButton("");
	JButton btn12 = new JButton("");
	JButton btn20 = new JButton("");
	JButton btn21 = new JButton("");
	JButton btn22 = new JButton("");
	private JTextField txtScore;
    private String startGame="X";
    boolean checker;
     int playerX_score=0;
     int playerO_score=0;
     int flag=2;
    
    
   private void winner() {
	   if(flag==0) {
		   playerO_score++;
	   

	textField_1.setText(String.valueOf(playerO_score));
	   }
	   else if(flag==1) {
		   playerX_score++;
		   textField.setText(String.valueOf(playerX_score));
	   }
		   
   }
    
    private void choose_player() {
    	
    	if(startGame.equalsIgnoreCase("X")) {
    		startGame="O";
    	}
    	else
    		startGame="X";
    }
	 private void winningGame() {
	    	
	    	String b1 =  btn00.getText();
	    	String b2 =  btn01.getText();
	    	String b3 =  btn02.getText();
	    	String b4 =  btn10.getText();
	    	String b5 =  btn11.getText();
	    	String b6 =  btn12.getText();
	    	String b7 =  btn20.getText();
	    	String b8 =  btn21.getText();
	    	String b9 =  btn22.getText();
	    	if(b1=="X"&& b2=="X" && b3=="X") {
	    		
	    		// player x won
	    		   flag=1;
		    	    winner();
	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
	    	    btn00.setBackground(Color.ORANGE);
	    	    btn01.setBackground(Color.ORANGE);
	    	    btn02.setBackground(Color.ORANGE);
	    	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
	    	 
	    	}
              if(b4=="X"&& b5=="X" && b6=="X") {
	    		
	    		// player x won
            	  flag=1;
            	  winner();
	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
	    	    btn10.setBackground(Color.CYAN);
	    	    btn11.setBackground(Color.CYAN);
	    	    btn12.setBackground(Color.CYAN);
	    	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
	    	}
              if(b7=="X"&& b8=="X" && b9=="X") {
  	    		
  	    		// player x won
            	  flag=1;
            	  winner();
  	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
  	    	    btn20.setBackground(Color.GREEN);
  	    	    btn21.setBackground(Color.GREEN);
  	    	    btn22.setBackground(Color.GREEN);
  	  	    btn00.setEnabled(false);
    	    btn01.setEnabled(false);
    	    btn02.setEnabled(false);
    	    btn10.setEnabled(false);
    	    btn11.setEnabled(false);
    	    btn12.setEnabled(false);
    	    btn20.setEnabled(false);
    	    btn21.setEnabled(false);
    	    btn22.setEnabled(false);
  	    	}
              if(b1=="X"&& b4=="X" && b7=="X") {
    	    		
    	    		// player X won
            	  flag=1;
            	  winner();
    	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
    	    	    btn00.setBackground(Color.CYAN);
    	    	    btn10.setBackground(Color.CYAN);
    	    	    btn20.setBackground(Color.CYAN);
    	    	    btn00.setEnabled(false);
    	    	    btn01.setEnabled(false);
    	    	    btn02.setEnabled(false);
    	    	    btn10.setEnabled(false);
    	    	    btn11.setEnabled(false);
    	    	    btn12.setEnabled(false);
    	    	    btn20.setEnabled(false);
    	    	    btn21.setEnabled(false);
    	    	    btn22.setEnabled(false);
    	    	}
                  if(b2=="X"&& b5=="X" && b8=="X") {
      	    		
      	    		// player X won
                	  flag=1;
                	  winner();
      	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
      	    	    btn01.setBackground(Color.GREEN);
      	    	    btn11.setBackground(Color.GREEN);
      	    	    btn21.setBackground(Color.GREEN);
      	  	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
      	    	}
                  if(b3=="X"&& b6=="X" && b9=="X") {
      	    		
      	    		// player X won
                	  flag=1;
                	  winner();
      	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
      	    	    btn02.setBackground(Color.ORANGE);
      	    	    btn12.setBackground(Color.ORANGE);
      	    	    btn22.setBackground(Color.ORANGE);
      	  	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
      	    	}
                  if(b1=="X"&& b5=="X" && b9=="X") {
      	    		
      	    		// player X won
                	  flag=1;
                	  winner();
      	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
      	    	    btn00.setBackground(Color.ORANGE);
      	    	    btn11.setBackground(Color.ORANGE);
      	    	    btn22.setBackground(Color.ORANGE);
      	  	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
      	    	}
                  if(b3=="X"&& b5=="X" && b7=="X") {
      	    		
      	    		// player X won
                	  flag=1;
                	  winner();
      	    		JOptionPane.showMessageDialog(this,"Player X WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
      	    	    btn02.setBackground(Color.ORANGE);
      	    	    btn11.setBackground(Color.ORANGE);
      	    	    btn20.setBackground(Color.ORANGE);
      	  	    btn00.setEnabled(false);
	    	    btn01.setEnabled(false);
	    	    btn02.setEnabled(false);
	    	    btn10.setEnabled(false);
	    	    btn11.setEnabled(false);
	    	    btn12.setEnabled(false);
	    	    btn20.setEnabled(false);
	    	    btn21.setEnabled(false);
	    	    btn22.setEnabled(false);
      	    	}
              if(b1=="O"&& b2=="O" && b3=="O") {
  	    		
  	    		// player O won
            	  flag=0;
            	  winner();
  	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
  	    	    btn00.setBackground(Color.ORANGE);
  	    	    btn01.setBackground(Color.ORANGE);
  	    	    btn02.setBackground(Color.ORANGE);
  	  	    btn00.setEnabled(false);
    	    btn01.setEnabled(false);
    	    btn02.setEnabled(false);
    	    btn10.setEnabled(false);
    	    btn11.setEnabled(false);
    	    btn12.setEnabled(false);
    	    btn20.setEnabled(false);
    	    btn21.setEnabled(false);
    	    btn22.setEnabled(false);
  	    	}
              if(b4=="O"&& b5=="O" && b6=="O") {
  	    		
  	    		// player O won
            	  flag=0;
            	  winner();
  	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
  	    	    btn10.setBackground(Color.ORANGE);
  	    	    btn11.setBackground(Color.ORANGE);
  	    	    btn12.setBackground(Color.ORANGE);
  	  	    btn00.setEnabled(false);
    	    btn01.setEnabled(false);
    	    btn02.setEnabled(false);
    	    btn10.setEnabled(false);
    	    btn11.setEnabled(false);
    	    btn12.setEnabled(false);
    	    btn20.setEnabled(false);
    	    btn21.setEnabled(false);
    	    btn22.setEnabled(false);
  	    	}
              if(b7=="O"&& b8=="O" && b9=="O") {
  	    		
  	    		// player O won
            	  flag=0;
            	  winner();
  	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
  	    	    btn20.setBackground(Color.ORANGE);
  	    	    btn21.setBackground(Color.ORANGE);
  	    	    btn22.setBackground(Color.ORANGE);
  	  	    btn00.setEnabled(false);
    	    btn01.setEnabled(false);
    	    btn02.setEnabled(false);
    	    btn10.setEnabled(false);
    	    btn11.setEnabled(false);
    	    btn12.setEnabled(false);
    	    btn20.setEnabled(false);
    	    btn21.setEnabled(false);
    	    btn22.setEnabled(false);
  	    	}
              if(b1=="O"&& b4=="O" && b7=="O") {
  	    		
  	    		// player O won
            	  flag=0;
            	  winner();
  	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
  	    	    btn00.setBackground(Color.CYAN);
  	    	    btn10.setBackground(Color.CYAN);
  	    	    btn20.setBackground(Color.CYAN);
  	  	    btn00.setEnabled(false);
    	    btn01.setEnabled(false);
    	    btn02.setEnabled(false);
    	    btn10.setEnabled(false);
    	    btn11.setEnabled(false);
    	    btn12.setEnabled(false);
    	    btn20.setEnabled(false);
    	    btn21.setEnabled(false);
    	    btn22.setEnabled(false);
  	    	}
                if(b2=="O"&& b5=="O" && b8=="O") {
    	    		
    	    		// player O won
                	flag=0;
                	winner();
    	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
    	    	    btn01.setBackground(Color.GREEN);
    	    	    btn11.setBackground(Color.GREEN);
    	    	    btn21.setBackground(Color.GREEN);
    	    	    btn00.setEnabled(false);
    	    	    btn01.setEnabled(false);
    	    	    btn02.setEnabled(false);
    	    	    btn10.setEnabled(false);
    	    	    btn11.setEnabled(false);
    	    	    btn12.setEnabled(false);
    	    	    btn20.setEnabled(false);
    	    	    btn21.setEnabled(false);
    	    	    btn22.setEnabled(false);
    	    	}
                if(b3=="O"&& b6=="O" && b9=="O") {
    	    		
    	    		// player O won
                	flag=0;
                	winner();
    	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
    	    	    btn02.setBackground(Color.ORANGE);
    	    	    btn12.setBackground(Color.ORANGE);
    	    	    btn22.setBackground(Color.ORANGE);
    	    	    btn00.setEnabled(false);
    	    	    btn01.setEnabled(false);
    	    	    btn02.setEnabled(false);
    	    	    btn10.setEnabled(false);
    	    	    btn11.setEnabled(false);
    	    	    btn12.setEnabled(false);
    	    	    btn20.setEnabled(false);
    	    	    btn21.setEnabled(false);
    	    	    btn22.setEnabled(false);
    	    	}
                if(b1=="O"&& b5=="O" && b9=="O") {
    	    		
    	    		// player O won
                	flag=0;
                	winner();
    	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
    	    	    btn00.setBackground(Color.ORANGE);
    	    	    btn11.setBackground(Color.ORANGE);
    	    	    btn22.setBackground(Color.ORANGE);
    	    	    btn00.setEnabled(false);
    	    	    btn01.setEnabled(false);
    	    	    btn02.setEnabled(false);
    	    	    btn10.setEnabled(false);
    	    	    btn11.setEnabled(false);
    	    	    btn12.setEnabled(false);
    	    	    btn20.setEnabled(false);
    	    	    btn21.setEnabled(false);
    	    	    btn22.setEnabled(false);
    	    	}
                if(b3=="O"&& b5=="O" && b7=="O") {
    	    		
    	    		// player O won
                	flag=0;
                	winner();
    	    		JOptionPane.showMessageDialog(this,"Player O WIN!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
    	    	    btn02.setBackground(Color.ORANGE);
    	    	    btn11.setBackground(Color.ORANGE);
    	    	    btn20.setBackground(Color.ORANGE);
    	    	    btn00.setEnabled(false);
    	    	    btn01.setEnabled(false);
    	    	    btn02.setEnabled(false);
    	    	    btn10.setEnabled(false);
    	    	    btn11.setEnabled(false);
    	    	    btn12.setEnabled(false);
    	    	    btn20.setEnabled(false);
    	    	    btn21.setEnabled(false);
    	    	    btn22.setEnabled(false);
    	    	}
                if(b1!=""&&b2!=""&& b3!=""&&b4!=""&& b5!=""&&b6!=""&& b7!=""&&b8!=""&& b9!="") {
                	JOptionPane.showMessageDialog(this,"Draw Match play Again!","tic tac toe", JOptionPane.INFORMATION_MESSAGE);
                	 btn00.setText("");
    				 btn00.setBackground(new Color(248, 248, 255));
    		    	  btn01.setText("");
    		    	  btn01.setBackground(new Color(248, 248, 255));
    		         btn02.setText("");
    		         btn02.setBackground(new Color(248, 248, 255));
    		    	 btn10.setText("");
    		    	 btn10.setBackground(new Color(248, 248, 255));
    		    	  btn11.setText("");
    		    	  btn11.setBackground(new Color(248, 248, 255));
    		    	  btn12.setText("");
    		    	  btn12.setBackground(new Color(248, 248, 255));
    		    	  btn20.setText("");
    		    	  btn20.setBackground(new Color(248, 248, 255));
    		    	  btn21.setText("");
    		    	  btn21.setBackground(new Color(248, 248, 255));
    		    	  btn22.setText("");
    		    	  btn22.setBackground(new Color(248, 248, 255));
    		    	  startGame="X";
                }
	    }
 
    
  
     
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticTacToeGame frame = new ticTacToeGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	   
	     
	}

	/**
	 * Create the frame.
	 */
	public ticTacToeGame() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\RAHEEM\\Downloads\\download.png"));
		setTitle("Tic Tac Toe");
		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(0, 0, 686, 473);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(52, 26, 583, 59);
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(255, 0, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtTicTacToe = new JTextField();
		txtTicTacToe.setEditable(false);
		txtTicTacToe.setForeground(new Color(253, 245, 230));
		txtTicTacToe.setBackground(new Color(255, 0, 0));
		txtTicTacToe.setFont(new Font("Tahoma", Font.BOLD, 27));
		txtTicTacToe.setText(" Tic Tac Toe Game");
		txtTicTacToe.setBounds(173, 0, 247, 59);
		panel_1.add(txtTicTacToe);
		txtTicTacToe.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		panel_2.setBounds(0, 132, 686, 331);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 404, 331);
		panel_3.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		panel_3.setBackground(new Color(95, 158, 160));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		btn00.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		
	
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn00.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
				
			}
				
		});
		btn00.setBackground(new Color(248, 248, 255));
		btn00.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn00.setBounds(10, 19, 109, 91);
		panel_3.add(btn00);
		btn10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn10.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});
		
		
		btn10.setBackground(new Color(248, 248, 255));
		btn10.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn10.setBounds(10, 120, 109, 91);
		panel_3.add(btn10);
		btn20.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn20.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});
		
	
		btn20.setBackground(new Color(248, 248, 255));
		btn20.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn20.setBounds(10, 221, 109, 91);
		panel_3.add(btn20);
		btn01.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn01.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
				
			}
			
		});
		
	
		btn01.setBackground(new Color(248, 248, 255));
		btn01.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn01.setBounds(145, 19, 109, 91);
		panel_3.add(btn01);
		btn11.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn11.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
			
		});
		
	
		btn11.setBackground(new Color(248, 248, 255));
		btn11.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn11.setBounds(145, 120, 109, 91);
		panel_3.add(btn11);
		btn21.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn21.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});
		
		
		btn21.setBackground(new Color(248, 248, 255));
		btn21.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn21.setBounds(145, 221, 109, 91);
		panel_3.add(btn21);
		btn02.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn02.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});
		
	
		btn02.setBackground(new Color(248, 248, 255));
		btn02.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn02.setBounds(280, 19, 109, 91);
		panel_3.add(btn02);
		btn12.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn12.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});
		
	
		btn12.setBackground(new Color(248, 248, 255));
		btn12.setBounds(280, 120, 109, 91);
		btn12.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		panel_3.add(btn12);
		btn22.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn22.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
					checker=false;
				else
					checker=true;
				choose_player();
				winningGame();
			}
		});

		btn22.setBackground(new Color(248, 248, 255));
		btn22.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btn22.setBounds(280, 221, 109, 91);
		panel_3.add(btn22);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		panel_4.setBackground(new Color(95, 158, 160));
		
		panel_4.setBounds(403, 0, 283, 331);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		txtPlayerX = new JTextField();
		txtPlayerX.setEditable(false);
		txtPlayerX.setForeground(new Color(255, 255, 255));
		txtPlayerX.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtPlayerX.setText(" Player X :");
		txtPlayerX.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		txtPlayerX.setBounds(10, 65, 97, 42);
		txtPlayerX.setBackground(new Color(95, 158, 160));
		panel_4.add(txtPlayerX);
		txtPlayerX.setColumns(10);
		
		txtPlayerY = new JTextField();
		txtPlayerY.setEditable(false);
		txtPlayerY.setForeground(new Color(255, 255, 255));
		txtPlayerY.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtPlayerY.setText(" Player O :");
		txtPlayerY.setBackground(new Color(95, 158, 160));
		txtPlayerY.setColumns(10);
		txtPlayerY.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		txtPlayerY.setBounds(10, 123, 97, 42);
		panel_4.add(txtPlayerY);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		textField.setBounds(123, 65, 136, 42);
		
		textField.setText("0");
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(123, 123, 136, 42);
		panel_4.add(textField_1);
		
		txtScore = new JTextField();
		txtScore.setEditable(false);
		txtScore.setText(" Score List");
		txtScore.setForeground(new Color(253, 245, 230));
		txtScore.setFont(new Font("Tahoma", Font.BOLD, 27));
		txtScore.setColumns(10);
		txtScore.setBackground(Color.RED);
		txtScore.setBounds(70, 10, 151, 45);
		panel_4.add(txtScore);
		
		JButton btnNewButton_2 = new JButton("New Game");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 btn00.setText("");
				 btn00.setBackground(new Color(248, 248, 255));
		    	  btn01.setText("");
		    	  btn01.setBackground(new Color(248, 248, 255));
		         btn02.setText("");
		         btn02.setBackground(new Color(248, 248, 255));
		    	 btn10.setText("");
		    	 btn10.setBackground(new Color(248, 248, 255));
		    	  btn11.setText("");
		    	  btn11.setBackground(new Color(248, 248, 255));
		    	  btn12.setText("");
		    	  btn12.setBackground(new Color(248, 248, 255));
		    	  btn20.setText("");
		    	  btn20.setBackground(new Color(248, 248, 255));
		    	  btn21.setText("");
		    	  btn21.setBackground(new Color(248, 248, 255));
		    	  btn22.setText("");
		    	  btn22.setBackground(new Color(248, 248, 255));
		    	  startGame="X";
		  	    btn00.setEnabled(true);
	    	    btn01.setEnabled(true);
	    	    btn02.setEnabled(true);
	    	    btn10.setEnabled(true);
	    	    btn11.setEnabled(true);
	    	    btn12.setEnabled(true);
	    	    btn20.setEnabled(true);
	    	    btn21.setEnabled(true);
	    	    btn22.setEnabled(true);
		    	 
				
			}
		});
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBounds(10, 186, 263, 42);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 btn00.setText("");
				 btn00.setBackground(new Color(248, 248, 255));
		    	  btn01.setText("");
		    	  btn01.setBackground(new Color(248, 248, 255));
		         btn02.setText("");
		         btn02.setBackground(new Color(248, 248, 255));
		    	 btn10.setText("");
		    	 btn10.setBackground(new Color(248, 248, 255));
		    	  btn11.setText("");
		    	  btn11.setBackground(new Color(248, 248, 255));
		    	  btn12.setText("");
		    	  btn12.setBackground(new Color(248, 248, 255));
		    	  btn20.setText("");
		    	  btn20.setBackground(new Color(248, 248, 255));
		    	  btn21.setText("");
		    	  btn21.setBackground(new Color(248, 248, 255));
		    	  btn22.setText("");
		    	  btn22.setBackground(new Color(248, 248, 255));
		    	  textField.setText("0");
		    	  textField_1.setText("0");
			   playerX_score=0;
		    	   playerO_score=0;
		    	   startGame="X";
			   
		    	    btn00.setEnabled(true);
		    	    btn01.setEnabled(true);
		    	    btn02.setEnabled(true);
		    	    btn10.setEnabled(true);
		    	    btn11.setEnabled(true);
		    	    btn12.setEnabled(true);
		    	    btn20.setEnabled(true);
		    	    btn21.setEnabled(true);
		    	    btn22.setEnabled(true);
		    	 
			}
		});
		btnNewButton_3.setBackground(new Color(128, 128, 128));
		btnNewButton_3.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_3.setBounds(21, 250, 97, 55);
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Exit");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int confirmed = JOptionPane.showConfirmDialog(null, 
					        "Are you sure you want to exit the program?", "Exit Program Message Box",
					        JOptionPane.YES_NO_OPTION);

					    if (confirmed == JOptionPane.YES_OPTION) {
					      dispose();
					    }
					  }
			
		});
		btnNewButton_3_1.setBackground(new Color(128, 128, 128));
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_3_1.setBounds(162, 250, 97, 55);
		panel_4.add(btnNewButton_3_1);
	}
	
	
}
