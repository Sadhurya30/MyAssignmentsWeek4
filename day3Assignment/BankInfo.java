package week4.day3Assignment;

public class BankInfo {
	
	public void saving() {
		System.out.println("many saving schemes are available");
	}

	public void fixed() {
		System.out.println("Interest rates higher for fixed deposit");
	}
	
	public void deposit() {
		System.out.println("Fixed and recurring deposit");
	}
	public static void main(String[] args) {
		
		BankInfo b1 = new BankInfo();
		b1.saving();
		b1.fixed();
		b1.deposit();
		

	}

}
