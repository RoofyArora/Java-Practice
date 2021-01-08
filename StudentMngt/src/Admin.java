
public class Admin {
	
	public static void main(String[] args) {
		
		StudentSchedular std=new StudentSchedular();
		
		System.out.println(std.addStudents(101, "Manoj"));
		System.out.println(std.addStudents(102, "Aditi"));
		
		
		std.showAllStudents();
	}

}
