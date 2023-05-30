package org.college;

public class College {
	
	public void collegeName() {
		System.out.println("RMD Engineering college");
	}

	public void collegeCode() {
		System.out.println("1112");
	}
	
	public void collegeRank() {
		System.out.println("40");
	}
	public static void main(String[] args) {
		
		College colg = new College();
		colg.collegeCode();
		colg.collegeName();
		colg.collegeRank();

	}

}
