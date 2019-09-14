package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null, "answer 2 of these 3 questions right and you win");
		
		String riddle = JOptionPane.showInputDialog(null, "What can travel around the world while staying in a corner? (enter answers in all lower case)");
		if(riddle.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");	
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		String riddle1 = JOptionPane.showInputDialog(null, "What has hands but can not clap? (enter answers in all lower case)");
		if(riddle1.equals("a clock")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");	
		}
		
		
		String riddle2 = JOptionPane.showInputDialog(null, "I'm tall when I'm young and I'm short when I'm old. What am I? (enter answers in all lower case)");
		if(riddle2.equals("a candle")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");	
		}
		
		if (score >= 2) {
		JOptionPane.showMessageDialog(null, "you won with a score of "+ score);
		}
		else {
			JOptionPane.showMessageDialog(null, "you lost");
		}
		}
	}


