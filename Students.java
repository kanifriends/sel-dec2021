package week3.day1;

public class Students {
	
	public void getStudentinfo(int id){
		System.out.println("Details of"+id);
	}
	
	public void getStudentinfo(int id,String name) {
		System.out.println(id+"-"+name);
	}
	
	public void getStudentinfo(String email, int phoneNumber) {
		System.out.println(email+"-"+phoneNumber);
	}

	public static void main(String[] args) {
	 Students stud=new Students();
	 stud.getStudentinfo(10);
	 stud.getStudentinfo(11,"kani");
	 stud.getStudentinfo("jagu@gmail.com",2223335);

	}

}
