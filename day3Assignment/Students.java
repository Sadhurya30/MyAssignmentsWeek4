package week4.day3Assignment;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("id is " + id + " name is " + name);
	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email is " + email + "phoneNumber is " + phoneNumber);
	}
	

	public static void main(String[] args) {
	
		Students stud = new Students();
		stud.getStudentInfo(14256);
		stud.getStudentInfo(14256, "Ramesh");
		stud.getStudentInfo("ramesh123@gmail.com ", 9876543210l );
		

	}

}
