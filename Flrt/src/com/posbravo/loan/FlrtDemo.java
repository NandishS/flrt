package com.posbravo.loan;

import java.util.Random;

import javax.swing.JOptionPane;

public class FlrtDemo {
	private static Loan naeemLoan=null;
	public static void main(String [] args) {
		Random rand = new Random();
		String name = JOptionPane.showInputDialog("Enter your name");
		double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount"));
		int score = Integer.parseInt(JOptionPane.showInputDialog("Enter your credit score"));
		final int LIMIT = 700; 
		
		if(score<LIMIT) {
			JOptionPane.showMessageDialog(null, "Sorry!");
		} else {
			naeemLoan = new Loan(name,amount,Integer.toString(rand.nextInt(99)+1));
			JOptionPane.showMessageDialog(null, "Congratulations! Your loan has approved. Your loan information is " + naeemLoan.getName());
		}
		
	}
}
