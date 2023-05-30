package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("size of the desktop is 32 inch");
	}

	public static void main(String[] args) {
		
		Desktop d1 = new Desktop();
		d1.desktopSize();
		d1.computerModel();
	

	}

}
