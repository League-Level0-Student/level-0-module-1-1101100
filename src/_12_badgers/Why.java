package _12_badgers;

import javax.swing.JOptionPane;

public class Why {
public static void main(String[] args) {
	//badger 1
	
	for(int i = 0; i < 12; i++) {
		
		JOptionPane.showMessageDialog(null, "badger");
			
	}
	for(int j = 0; j < 2; j++) {
		
		JOptionPane.showMessageDialog(null, "mushroom");
			
	}
	
	//badger 2*2
	for (int bad = 0; bad < 2; bad++) {
	for(int k = 0; k < 11; k++) {
		
		JOptionPane.showMessageDialog(null, "badger");
			
	}
	
	for(int l = 0; l < 2; l++) {
		
		JOptionPane.showMessageDialog(null, "mushroom");

	}
	}

	//pre snake badger
	for(int m = 0; m < 11; m++) {
		
		JOptionPane.showMessageDialog(null, "badger");
			
	}
	//snake
	for(int n = 0; n < 4; n++) {
		
		JOptionPane.showMessageDialog(null, "a snake");
			
	}
	JOptionPane.showMessageDialog(null, "you have reached the music limit for this song, please purchase premium to play more. Prices start at $49.99 per month");
	
}
}
