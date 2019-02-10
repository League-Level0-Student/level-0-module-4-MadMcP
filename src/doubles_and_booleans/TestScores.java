package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
	String score;
	score=JOptionPane.showInputDialog("What did you get on your most recent test?");
	double testScore=Double.parseDouble(score);
	if (testScore<=60) {
		JOptionPane.showMessageDialog(null, "You need to study harder next time!");
	}
	else if (testScore>=61 && testScore<=80) {
		JOptionPane.showMessageDialog(null, "I'm sure you can do better than that!");
	}
	else if (testScore>=81) {
		JOptionPane.showMessageDialog(null, "Great job! You must have studied really hard!");
	}
}
}