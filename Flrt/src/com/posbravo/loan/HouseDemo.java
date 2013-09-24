package com.posbravo.loan;

public class HouseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House tanesHouse = new House("8477", "Springfield" );
		House naeemHouse = new House("101", "Alexandria");
		System.out.println("Tanes:" + tanesHouse.getHouseNum());
		System.out.println("Naeem:" + naeemHouse.getHouseNum());

	}

}
