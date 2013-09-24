package com.posbravo.loan;

public class Loan {
	private String name;
	private double balance;
	private String loanNum;
	
	public Loan() {
		super();
	}
	public Loan(String name, double balance, String loanNum) {
		this.name = name;
		this.balance = balance;
		this.loanNum = loanNum;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getLoanNum() {
		return loanNum;
	}

	public void setLoanNum(String loanNum) {
		this.loanNum = loanNum;
	}
	
	public String toString() {
		return "\n Loan Number: " +  this.loanNum + "\n Loan Name: " + this.name + "\n Loan Amount: " + this.balance + " ";
	}
	
}
