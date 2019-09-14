package _02_unbirthday;
import javax.swing.JOptionPane;
public class Unbirthday {
	public static void main(String[] args) {
		
		String bday = JOptionPane.showInputDialog("what is your birthday (e.g January 16th)");
		if (bday.equals("September 13th")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "happy unbirthday");
		}
		}
	}
