package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		String p;
		String n;
		String d;
		String q;
		p=JOptionPane.showInputDialog("How many pennies do you have?");
		int pennies=Integer.parseInt(p);	
		// Ask the user how many nickels they have
		n=JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an integer using Integer.parseInt()
		int nickles=Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		d=JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes=Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		q=JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters=Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable 
		double money=(pennies*0.01)+(nickles*0.05)+(dimes*0.1)+(quarters*0.25);
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" +money+ ".");
	}
}

